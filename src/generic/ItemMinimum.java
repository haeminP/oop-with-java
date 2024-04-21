package generic;

public class ItemMinimum {
    public static <TheType extends Comparable<TheType>>
    TheType tripleMin(TheType item1, TheType item2, TheType item3) {
        TheType minVal = item1;

        if (item2.compareTo(minVal) < 0){
            minVal = item2;
        }
        if (item3.compareTo(minVal) < 0){
            minVal = item3;
        }

        return minVal;
    }


    public static void main(String[] args) {
        Integer num1 = 55;
        Integer num2 = 99;
        Integer num3 = 66;

        Character let1 = 'a';
        Character let2 = 'z';
        Character let3 = 'm';

        String str1 = "zzz";
        String str2 = "aaa";
        String str3 = "mmm";

        // Try tripleMin method with Integers
        System.out.println("Items: " + num1 + " " + num2 + " " + num3);
        System.out.println("Min: " + tripleMin(num1, num2, num3));


        // Try tripleMin method with Characters
        System.out.println("Items: " + let1 + " " + let2 + " " + let3);
        System.out.println("Min: " + tripleMin(let1, let2, let3));

        // Try tripleMin method with Strings
        System.out.println("Items: " + str1 + " " + str2 + " " + str3);
        System.out.println("Min: " + tripleMin(str1, str2, str3));

    }
}
