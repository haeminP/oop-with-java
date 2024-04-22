package finalPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Airport {
    private Queue<String> takeoffQueue;
    private Queue<String> landingQueue;
    private Stack<String> activityLog;

    public Airport() {
        takeoffQueue = new PriorityQueue<>();
        landingQueue = new LinkedList<>();
        activityLog = new Stack<>();
    }

    public void addTakeoff(String flightID){
        takeoffQueue.add(flightID);
    }

    public void addLanding(String flightID){
        landingQueue.add(flightID);
    }
    public String handleNextAction(){
        String action;
        if (!landingQueue.isEmpty()){
            String flightId = landingQueue.poll();
            activityLog.push("Flight " + flightId + " is landing.");
            action = "Flight " + flightId + " is landing.";
        } else if (!takeoffQueue.isEmpty()) {
            String flightId = takeoffQueue.poll();
            activityLog.push("Flight " + flightId + " is taking off.");
            action = "Flight " + flightId + " is taking off.";
        } else {action = "No plane is waiting to land or take off.";}
        return action;
    }

    public String waitingPlane() {
        StringBuilder waitingPlaneList = new StringBuilder();
        waitingPlaneList.append("Planes waiting for landing/take-off\n");
        waitingPlaneList.append("---------------\n");
        if(takeoffQueue.isEmpty() && landingQueue.isEmpty()){
            waitingPlaneList.append("No plane is in the landing and take-off queues.\n");
        } else {waitingPlaneList.append("Take-off Queue:\n");
            for (String flightId: takeoffQueue){
                waitingPlaneList.append(flightId).append("\n");}
            waitingPlaneList.append("\nLanding Queue:\n");
            for (String flightId: landingQueue){
                waitingPlaneList.append(flightId).append("\n");}
        }
        return waitingPlaneList.toString();
    }

    public String log(){
        StringBuilder logList = new StringBuilder();
        logList.append("List of landing/take-off activities\n");
        logList.append("----------------\n");
        for (String activity: activityLog){
            logList.append(activity).append("\n");
        }
        return logList.toString();
    }
    public void log(String fileName){
        StringBuilder logList = new StringBuilder();
        logList.append("List of landing/take-off activities\n");
        logList.append("----------------\n");
        System.out.println("Writing to the airport to the file...\n");
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String activity : activityLog){
                writer.write(activity + "\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        Scanner scanner = new Scanner(System.in);
        Boolean quit = false;
        System.out.println("Airport Simulation");
        while (!quit){
            String input = scanner.nextLine();
            switch(input.charAt(0)){
                case 'l':
                    airport.addLanding(input.substring(1));
                    break;
                case 't':
                    airport.addTakeoff(input.substring(1));
                    break;
                case 'n':
                    String action = airport.handleNextAction();
                    System.out.println("Performed: " + action);
                    break;
                case 'p':
                    System.out.println(airport.waitingPlane());
                    break;
                case 'g':
                    System.out.println(airport.log());
                    break;
                case 'f':
                    airport.log("AirportLog.txt");
                    break;
                case 'q':
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
        scanner.close();
    }
}
