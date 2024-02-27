package Lab3;

import java.util.Scanner;

public class Hailstone {

    public void hailstone(int num){
        if (num < 0){
            return;
        }
        int count = 0;
        while (num != 1){
            System.out.print(num + "\t");
            if ((num % 2) == 0){
                num /= 2;
            }

            else{
                num = (num * 3) + 1;
            }

            count += 1;

            if ((count % 10) == 0){
                System.out.println();
            }
        }

        System.out.print("1");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Hailstone labObject = new Hailstone();
        int num;

        num = scnr.nextInt();
        labObject.hailstone(num);
    }
}
