package com.company;

import java.util.concurrent.RecursiveTask;

public class Factorial extends RecursiveTask<Double> {
    int n;

    public Factorial(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    protected Double compute() {
        if (n<=3) {
            factSeq(n);
        }
        else {
            fact(n);
        }
        return (double)n;
    }
    static int factSeq (int n) {
        return n;
    }

    static int fact (int n) {

        return n;
    }
}

// tiene que hacer n-- para ir restando hasta llegar a su final
// tiene que hacer n * (n-1)
// el uno en una variable que baia restando ??


