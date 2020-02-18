package com.company.a3.Ascensor;

public class Motor extends Thread {

    Ascensor ascensor;
    int plantaMax;

    int ascensorBuit = 0;
    Nivell nivel;
    enum Nivell{
        PUJANT,
        BAIXANT
    }

    public Motor(int plantaMax, Ascensor ascensor) {
        this.plantaMax = plantaMax;
        this.ascensor = ascensor;
        nivel = Nivell.PUJANT;
    }

    @Override
    public void run() {
        super.run();
        while (ascensorBuit != 2){
            switch (nivel){
                case PUJANT:
                    try {
                        if(ascensor.planta<=plantaMax){
                            if(ascensor.planta==plantaMax){
                                nivel = Nivell.BAIXANT;
                            } else {
                                ascensor.planta++;
                                ascensor.notificar();
                                System.out.println("PLANTA "+ascensor.planta);

                                Thread.sleep((long)(Math.random() * 4000));
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case BAIXANT:
                    try {
                        if(ascensor.planta>=0){
                            if(ascensor.planta==0){
                                nivel = Nivell.PUJANT;
                            } else {
                                ascensor.planta--;
                                ascensor.notificar();
                                System.out.println("PLANTA "+ascensor.planta);

                                Thread.sleep((long)(Math.random() * 4000));
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

            }
            if (ascensor.countPer==0){
                ascensorBuit++;
            }

        }
    }
}
