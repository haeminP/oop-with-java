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

    public static Polynomial subtract (Polynomial p1, Polynomial p2){
        Polynomial p = new Polynomial(p1);
        p.subtract(p2);
        return p;
    }

    public int getDegree(){
        return this.degree;
    }

    public int coefficient(int power){
        for (int e: this.terms.keySet()){
            if (e == power){
                return this.terms.get(e);}
        }
        return 0;
    }

    public void changeCoefficient(int power, int newCoefficient){
        for (int e: this.terms.keySet()){
            if (e == power){
                this.terms.put(e, newCoefficient);
                return;
            }
        }
    }

    public void removeTerm(int power){
        this.terms.remove(power);
    }

    public double evaluate(double x){
        double v = 0;
        for (int e : this.terms.keySet()) {
            v += this.terms.get(e) * Math.pow(x, e);
        }
        return v;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Polynomial){
            Polynomial p = (Polynomial) obj;
            return this.terms.equals(p.terms);
         }
        return false;
    }
    @Override
    public int compareTo(Polynomial other) {
        double v1 = this.evaluate(0);
        double v2 = other.evaluate(0);
        if (v1 > v2){
            return 1;
        } else if (v2 > v1){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        boolean firstTerm = true;
        StringBuilder s = new StringBuilder();
        for (Integer power: this.terms.keySet()){
            int coefficient = this.terms.get(power);
        if (Math.abs(coefficient) != 0){
            if(!firstTerm && coefficient >= 0){
                s.append(" + ");
            } else if (coefficient < 0) {
                s.append(" - ");
            }
            if (power == 0 || Math.abs(coefficient) != 1){
                s.append(Math.abs(coefficient));
            }
            if(power > 0){
                s.append("x");
            }
            if (power > 1){
                s.append(power);
            }
        }
        firstTerm = false;
        }
        return s.toString();
    }


}
