package com.company.a3.Ascensor;

public class Persona extends Thread {
    int plantaActual;
    int plantaDesti;
    Ascensor ascensor;
    String nom;

    public Persona(String nom, int plantaActual, int plantaDesti, Ascensor ascensor) {
        super(nom);
        this.nom = nom;
        this.plantaActual = plantaActual;
        this.plantaDesti = plantaDesti;
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        super.run();

        while (plantaActual != plantaDesti){
            try {
                Thread.sleep((long) (Math.random() * 4000));
                ascensor.pujar(plantaActual);
                System.out.println(" Ha pujat l'usuari: "+ nom);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep((long) (Math.random() * 3000));
                ascensor.baixar(plantaDesti);
                System.out.println(" Ha baixat l'usuari: "+ nom +" en la planta numero "+ascensor.planta);

                plantaActual = plantaDesti;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
