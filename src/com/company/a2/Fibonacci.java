package com.company.a2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer> {
    int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n<=7) {
            return fibonacciSeq();
        }
        else {
            return fibonacci();
        }
    }

    int fibonacciSeq(){
        int sum =0;
        int num1=1;
        int num2=0;
        for (int i = 0; i < n; i++) {
           sum=num1+num2;
           num2=num1;
           num1=sum;
        }
        return sum;
    }

    int fibonacci(){
        Fibonacci f1 = new Fibonacci(n-1);
        Fibonacci f2 = new Fibonacci(n-2);
        f1.fork();
        f2.fork();
        return f1.join()+f2.join();
    }

    public static void main(String[] args) {
        ForkJoinPool exec = new ForkJoinPool();
        Fibonacci fibonacci = new Fibonacci(8);
        exec.invoke(fibonacci);
        int result = fibonacci.join();
        System.out.println(result);
    }

    // 7
    // 1 1 2 3 5 8 13
    // num1
    // num2 num1
    //      num2 num1
}
