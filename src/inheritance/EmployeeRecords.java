package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<EmployeeData> emplList = new ArrayList<EmployeeData>();
        EmployeeData emplData;
        String userCommand;
        String emplFirstName;
        String emplLastName;
        Integer emplID;
        Integer deptNum;
        int i;

        do {
            // Prompt user for input
            System.out.println("Enter command ('a' to add new employee, 'p' to print all employees, 'q' to quit): ");
            userCommand = scnr.next();

            // Add new employee entry
            if (userCommand.equals("a")) {
                System.out.print("First Name: ");
                emplFirstName = scnr.next();

                System.out.print("Last Name: ");
                emplLastName = scnr.next();

                System.out.print("ID: ");
                emplID = scnr.nextInt();

                System.out.print("Department Number: ");
                deptNum = scnr.nextInt();

                emplData = new EmployeeData(emplFirstName, emplLastName, emplID, deptNum);
                emplList.add(emplData);
            }
            // Print all entries
            else if (userCommand.equals("p")){
                Collections.sort(emplList);
                System.out.println();
                System.out.println("Employees: ");
                for (i = 0; i < emplList.size(); ++i){
                    System.out.println(emplList.get(i).toString());
                }
                System.out.println();
            }
        } while (!userCommand.equals("q"));

    }
}
