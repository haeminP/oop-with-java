package finalPractice;

public class Quadratic extends Polynomial{
    private double root1;
    private double root2;
    public Quadratic(int a, int b, int c){
        super();
        Polynomial pa = new Polynomial(2, a);
        Polynomial pb = new Polynomial(1, b);
        Polynomial pc = new Polynomial(0, c);
        add(pa);
        add(pb);
        add(pc);
        roots();
    }

    public double getRoot1() {
        return root1;
    }
    public double getRoot2() {
        return root2;
    }

    public boolean roots() {
        double delta = coefficient(1) * coefficient(1) - 4 * coefficient(2) * coefficient(0);
        if (delta >= 0){
            root1 = (-1 * coefficient(1) + Math.sqrt(delta)) / (2.0 * coefficient(2));
            root2 = (-1 * coefficient(1) - Math.sqrt(delta)) / (2.0 * coefficient(2));
            return true;
        } else {
            return false;
        }
    }
}
