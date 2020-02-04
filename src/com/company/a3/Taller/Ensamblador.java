package com.company.a3.Taller;

public class Ensamblador extends Thread{
    Cistell cistell_manigues;
    Cistell cistell_cossos;
    String nombre;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Ensamblador(String nombre, Cistell cistell_manigues, Cistell cistell_cossos) {
        this.nombre = nombre;
        this.cistell_manigues = cistell_manigues;
        this.cistell_cossos = cistell_cossos;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            cistell_cossos.agafarpeça();
            cistell_manigues.agafarpeça();
            cistell_manigues.agafarpeça();
            try {
                System.out.println(ANSI_RED+" + El ensamblador ha ensamblado una pieza"+ANSI_RESET);
                sleep((long) (Math.random()*2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
