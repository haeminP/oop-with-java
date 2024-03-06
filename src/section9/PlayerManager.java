package section9;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    private ArrayList<Integer> players;

    // Constructor creates an empty ArrayList of player numbers
    public PlayerManager(){
        players = new ArrayList<Integer>();
    }

    // Adds playerNum to end of ArrayList
    public void addPlayer (int playerNum){
        players.add(playerNum);
    }

    // Deletes playerNum from ArrayList
    public void deletePlayer(int playerNum){
        int i;
        boolean found;

        // Search for playerNum in ArrayList
        found = false;
        i = 0;
        while ((!found) && (i < players.size())){
            if (players.get(i).equals(playerNum)){
                players.remove(i);
                found = true;
            }
            ++i;
        }
    }

    // Prints player numbers currently in ArrayList
    public void printPlayers() {
        int i;
        for (i = 0; i < players.size(); i++){
            System.out.println(" " + players.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        PlayerManager teamRoaster = new PlayerManager();
        String userInput = "-";
        int playerNum;

        System.out.println("Commands: 'a' add, 'd' deletes,");
        System.out.println("Commands: 'p' print, 'q' quit: ");

        while (!userInput.equals("q")) {
            System.out.print("Command: ");
            userInput = scnr.next();

            if (userInput.equals("a")){
                System.out.print(" Player number: ");
                playerNum = scnr.nextInt();
                teamRoaster.addPlayer(playerNum);
            }

            else if (userInput.equals("d")){
                System.out.print(" Player number: ");
                playerNum = scnr.nextInt();
                teamRoaster.deletePlayer(playerNum);
            }

            else if (userInput.equals("p")) {
                teamRoaster.printPlayers();
            }
        }
    }
}
