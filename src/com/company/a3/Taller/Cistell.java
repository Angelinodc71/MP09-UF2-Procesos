package com.company.a3.Taller;

public class Cistell {
    int capacidadMAX;
    int cantidad = 0;

    public Cistell(int capacidadMAX) {
        this.capacidadMAX = capacidadMAX;
    }

    public synchronized void deixarpeça(){
        try {
            while (cantidad==capacidadMAX)wait();
            cantidad ++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    public synchronized void agafarpeça(){
            try {
                while (cantidad==0)wait();
                cantidad --;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        notifyAll();
    }


}
