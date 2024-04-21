package section9;

public class TextBook extends Book {
    private String subject;
    private boolean hasEbook;
    private double eBookPrice;

    // Default constructor
    public TextBook() {
        super();
        this.subject = "No Subject";
    }

    // Constructor with isbn, title, edition, and subject
    public TextBook(String isbn, String title, int edition, String subject){
        super(isbn, title, edition);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean eBookChecker() {
        return hasEbook;
    }

    public void setEbook(boolean hasEbook) {
        this.hasEbook = hasEbook;
    }

    public double geteBbookPrice() {
        return eBookPrice;
    }

    public void seteBookPrice(double eBookPrice){
        this.eBookPrice = eBookPrice;
    }

    // Add "(TextBook)" to the end of book title
    public void appendTextBookToTitle() {
        setTitle(getTitle() + " (TextBook)");
    }

    // Override toString
    @Override
    public String toString() {
        String baseString = super.toString();
        String eVersionInfo = hasEbook ? "\neBook: Yes" + "\neBook Price: " + eBookPrice : "";

        return baseString + "\nSubject: " + subject + eVersionInfo;
    }
}
