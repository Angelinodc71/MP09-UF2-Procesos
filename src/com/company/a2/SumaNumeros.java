package com.company.a2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumaNumeros extends RecursiveTask<Integer> {
    int[] n= {1,2,4,6,7};

    @Override
    protected Integer compute() {
        if (n.length<=5) {
            return sumaNumerosSeq();
        }
//        else {
//            return sumaNumerosRec();
//        }
        return null;
    }
    int sumaNumerosSeq(){
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum+=n[i];
        }
        return sum;
    }
//    int sumaNumerosRec(){
//
//    }
    public static void main(String[] args) {
        ForkJoinPool exec = new ForkJoinPool();
        SumaNumeros factorial = new SumaNumeros();
        exec.invoke(factorial);
        double result = factorial.join();
        System.out.println(result);
    }
}
