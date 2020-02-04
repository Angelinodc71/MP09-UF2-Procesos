package com.company.a1;

import java.util.concurrent.ForkJoinPool;
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
            return  (double)factSeq();
        }
        else {
            return (double)fact();
        }
    }
    int factSeq () {
        int temp = n;
        for (int i = n-1; i>0; i--) {
            temp*=i;
        }
        return temp;
    }

    int fact() {
        Factorial task = new Factorial(n-1);
        task.fork();
        return (int) (n * task.join());
    }

    public static void main(String[] args) {
        ForkJoinPool exec = new ForkJoinPool();
        Factorial factorial = new Factorial(3);
        exec.invoke(factorial);
        double result = factorial.join();
        System.out.println(result);

//        System.out.println(factorial.factSeq(5));

    }
}

// tiene que hacer n-- para ir restando hasta llegar a su final
// tiene que hacer n * (n-1)
// el uno en una variable que baia restando ??


