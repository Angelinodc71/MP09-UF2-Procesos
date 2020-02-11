package com.company.a3.Ascensor;

public class Ascensor {
    int plantaMAX;
    int planta = 0;

    public synchronized void entrar() {
        try {
            while (planta == plantaMAX) wait();
            planta--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    public synchronized void agafarpeça() {
        try {
            while (planta == 0) wait();
            planta++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }
}
