package Lab4;

import java.util.Scanner;

public class WordFrequency {

    public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
        int count = 0;
        for (int i = 0; i < listSize; i++){
           boolean checkEqual = wordsList[i].equalsIgnoreCase(currWord);
           if (checkEqual) {
               count++;
           }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputNum = scnr.nextInt();

        String[] wordsList = new String[inputNum];

        for (int i = 0; i < inputNum; i++){
            wordsList[i] = scnr.next();
        }


        for (int i = 0; i < inputNum; i++){
            System.out.println(wordsList[i] + " " + getWordFrequency(wordsList, inputNum, wordsList[i]));
        }



    }
}
