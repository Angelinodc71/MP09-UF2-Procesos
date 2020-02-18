package com.company.a3.Ascensor;

public class Edificio {
    public static void main(String[] args) {

        Ascensor ascensor = new Ascensor(0);
        Motor motor = new Motor(10, ascensor);
        Persona persona1 = new Persona("Jorge",4,9,ascensor);
        Persona persona2 = new Persona("George",4,2,ascensor);
        Persona persona3 = new Persona("Jordi",7,1,ascensor);
        Persona persona4 = new Persona("Pep",1,5,ascensor);
        Persona persona5 = new Persona("Alxen",2,3,ascensor);
        Persona persona6 = new Persona("Anndress",0,4,ascensor);

        Persona persona11 = new Persona("Geremi",9,4,ascensor);
        Persona persona21 = new Persona("Jeremy",2,4,ascensor);
        Persona persona31 = new Persona("Kokko",1,7,ascensor);
        Persona persona41 = new Persona("ElBromas",5,1,ascensor);
        Persona persona51 = new Persona("777Vegettas",3,2,ascensor);
        Persona persona61 = new Persona("Jojo",4,0,ascensor);

        motor.start();

        persona1.start();
        persona2.start();
        persona3.start();
        persona4.start();
        persona5.start();
        persona6.start();
        persona11.start();
        persona21.start();
        persona31.start();
        persona41.start();
        persona51.start();
        persona61.start();

    }
}
