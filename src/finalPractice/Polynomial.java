package finalPractice;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Polynomial implements Comparable<Polynomial>{
    private Map<Integer, Integer> terms; // Map to store the terms of polynomial
    private int degree; // The degree of the polynomial

    // Default constructor
    public Polynomial() {
        this.terms = new TreeMap<>(Collections.reverseOrder());
        this.degree = -1;
    }

    // Constructor with one term
    public Polynomial(int power, int coefficient){
        this();
        try {
        if (power < 0) {throw new IllegalArgumentException("Power cannot be negative.");}
        this.terms.put(power, coefficient);
        this.degree = power;
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    // Constructor with a Map
    public Polynomial (TreeMap<Integer, Integer> p){
        this();
        Set<Integer> powers = p.keySet();
        int max = 0;
        for (Integer pow: powers) {
            try {
                if (pow < 0){throw new IllegalArgumentException("Power of a term can't be negative");}
                this.terms.put(pow, p.get(pow));
                if (max < pow)max = pow;}
            catch (IllegalArgumentException e){
                System.out.println(e);}}
        this.degree = max;
    }

    public Polynomial(Polynomial p){
        this.terms = new TreeMap<>(Collections.reverseOrder());
        this.terms.putAll(p.terms);
        this.degree = p.degree;
    }

    public void add(Polynomial p){
        for (Integer aPower: p.terms.keySet()) {
            Integer bCoefficient = this.terms.get(aPower);
            Integer aCoefficient = p.terms.get(aPower);
            if (bCoefficient == null){bCoefficient = 0;}
            this.terms.put(aPower, bCoefficient + aCoefficient);
        }
        if (this.degree < p.degree){
            this.degree = p.degree;}
    }

    public static Polynomial add(Polynomial p1, Polynomial p2){
        Polynomial p = new Polynomial(p1);
        p.add(p2);
        return p;
    }

    public void subtract(Polynomial p){
        Polynomial temp = new Polynomial();
        temp.terms.putAll(p.terms);
        temp.degree = p.degree;
        for (Integer aPower: temp.terms.keySet()){
            temp.terms.put(aPower, temp.terms.get(aPower) * -1);
        }
        this.add(temp);
    }
}
