package com.company.a3.Taller;

public class Taller {
    public static void main(String[] args) {
        Cistell cistell_manigues = new Cistell(8);
        Cistell cistell_cossos = new Cistell(5);
        Cosidor cosidor_manigues = new Cosidor("Angel","Manigues", cistell_manigues);
        Cosidor cosidor_cossos = new Cosidor("Andres","Cos", cistell_cossos);
        Ensamblador ensamblador = new Ensamblador("Peça", cistell_manigues, cistell_cossos);

        cosidor_manigues.start();
        cosidor_cossos.start();
        ensamblador.start();
    }
}
