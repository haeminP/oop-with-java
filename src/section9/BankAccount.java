package section9;

public class BankAccount {

    private String name;
    private double checking;
    private double saving;

    public BankAccount(){
        name = "No name";
        checking = 0.0;
        saving = 0.0;
    }

    public BankAccount(String userName, double checkingAmt, double savingAmt){
        name = userName;
        checking = checkingAmt;
        saving = savingAmt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChecking(double checking) {
        this.checking = checking;
    }

    public double getChecking() {
        return checking;
    }

    public void setSavings(double saving) {
        this.saving = saving;
    }

    public double getSavings() {
        return saving;
    }

    public void depositChecking(double amt){
        if (amt < 0) {
            System.out.println("Negative amount can't be deposited");
            return;
        }
        checking += amt;
    }

    public void depositSavings(double amt){
        if (amt < 0) {
            System.out.println("Negative amount can't be deposited");
            return;
        }
        saving += amt;
    }

    public void withdrawChecking(double amt) {
        if (amt > checking || amt < 0) {
            System.out.println("Not enough balance");
            return;
        }
        checking -= amt;
    }


    public void withdrawSavings(double amt) {
        if (amt > saving) {
            System.out.println("Not enough balance");
            return;
        }
        saving -= amt;
    }

    public void transferToSavings(double amt){
        if (amt < 0){
            System.out.println("Negative amount");
            return;
        }

        checking -= amt;
        saving += amt;
    }



    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mickey", 500.00, 1000.00);
        account.setChecking(500);
        account.setSavings(500);
        account.withdrawSavings(100);
        account.withdrawChecking(100);
        account.transferToSavings(300);

        System.out.println(account.getName()); // Expected Mickey
        System.out.printf("$%.2f\n", account.getChecking()); // Expected 100.0
        System.out.printf("$%.2f\n", account.getSavings()); // Expected 700.0
    }
}
