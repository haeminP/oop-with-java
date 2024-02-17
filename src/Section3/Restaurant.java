package Section3;

public class Restaurant {
    private String name;
    private int rating;

    public void setName (String restaurantName){
        name = restaurantName;
    }
    public void setRating (int userRating){
        rating = userRating;
    }

    public void print() {
        System.out.println(name + " -- " + rating);
    }

}


