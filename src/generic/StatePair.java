package generic;

public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>>{
    private  Type1 value1;
    private  Type2 value2;

    // Constructor
    public StatePair(Type1 value1, Type2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    // Mutator
    public void setValue1(Type1 value1){
        this.value1 = value1;
    }

    public  void setValue2(Type2 value2){
        this.value2 = value2;
    }

    // Accessor
    public Type1 getValue1() {
        return value1;
    }

    public Type2 getValue2() {
        return value2;
    }

    // printInfo() Method
    public void printInfo() {
        System.out.println(value1 + ": " + value2);
    }
}
