package inputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadName {
    public static void main(String[] args) throws IOException {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        int fileNum1;
        int fileNum2;

        // Try to open file
        System.out.println("Opening file numFile.txt");
        fileByteStream = new FileInputStream("src/inputOutput/numFile.txt");
        inFS = new Scanner(fileByteStream);

        // File is open and valid if we got this far (otherwise exception thrown)
        System.out.println("Reading two integers.");
        fileNum1 = inFS.nextInt();
        fileNum2 = inFS.nextInt();

        // Output values read from file
        System.out.println("num1: " + fileNum1);
        System.out.println("num2: " + fileNum2);
        System.out.println("num1 + num2: " + (fileNum1 + fileNum2));

        // Done with file, so try to close it
        System.out.println("Closing file numFile.txt");
        // close() may throw IOExceptions if fails
        fileByteStream.close();

    }
}
