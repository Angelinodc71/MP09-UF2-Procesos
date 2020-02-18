package com.company.a3.Ascensor;

public class Ascensor {
    int planta;
    int limit = 10;

    int countPer = 0;


    public Ascensor(int planta) {
        this.planta = planta;
    }

    synchronized void notificar(){
        notifyAll();
    }


    public synchronized void pujar(int plantaAct){
        try {
            while (countPer == limit || plantaAct != planta) wait();
            countPer++;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void baixar(int plantaDesti) {

        try {
            while (countPer == limit || plantaDesti != planta) wait();
            countPer--;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
