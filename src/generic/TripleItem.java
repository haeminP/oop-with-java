package generic;

public class TripleItem <TheType extends Comparable<TheType>>{
    private TheType item1;
    private TheType item2;
    private TheType item3;

    public TripleItem(TheType i1, TheType i2, TheType i3){
        item1 = i1;
        item2 = i2;
        item3 = i3;
    }

    public void printAll() {
        System.out.println("(" + item1 + ", " + item2 + ", " + item3 + ")");
    }

    // Return min data member value
    public TheType minItem() {
        TheType minVal;
        minVal = item1;

        if (item2.compareTo(minVal) < 0){
            minVal = item2;
        }

        if (item3.compareTo(minVal) < 0){
            minVal = item3;
        }
        return minVal;
    }
}


