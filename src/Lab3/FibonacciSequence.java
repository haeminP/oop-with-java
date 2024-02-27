package Lab3;

import java.util.Scanner;

public class FibonacciSequence {

    public int fibonacci(int n){

        if (n < 0){
            return -1; // Invalid input
        }

        int[] fibonacciNums = new int[n];
        fibonacciNums[0] = 1;
        fibonacciNums[1] = 1;

        for (int i = 2; i < n; i++){
            fibonacciNums[i] = fibonacciNums[i-1] + fibonacciNums[i-2];
        }

        return fibonacciNums[n-1];
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        FibonacciSequence program = new FibonacciSequence();
        int startNum;

        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + program.fibonacci(startNum));
    }
}
