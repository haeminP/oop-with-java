package inputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadVaryingAmount {
    public static void main(String[] args) throws IOException {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        int fileNum;

        // Try to open file
        System.out.println("Opening file myfile.txt.");
        fileByteStream = new FileInputStream("src/inputOutput/myfile.txt");
        inFS = new Scanner(fileByteStream);

        // File is open and valid if we got this far
        System.out.println("Reading and printing numbers.");
        while (inFS.hasNextLine()){
            fileNum = inFS.nextInt();
            System.out.println("num: " + fileNum);
        }

        // Done with file, so try to close it
        System.out.println("Clsoing file myfile.txt");
        fileByteStream.close();

    }
}
