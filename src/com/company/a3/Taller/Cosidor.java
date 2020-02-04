package com.company.a3.Taller;

public class Cosidor extends Thread{
    Cistell cistell;
    String nombre;
    String tipo;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";


    public Cosidor(String nombre, String tipo, Cistell cistell) {
        this.tipo=tipo;
        this.cistell = cistell;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                if (getTipo().equals("Cos")){
                    System.out.println(ANSI_BLUE+getNombre()+" ha deixat una "+getTipo()+ANSI_RESET);
                }
                if (getTipo().equals("Manigues")) {
                    System.out.println(ANSI_YELLOW+getNombre()+" ha deixat una "+getTipo()+ANSI_RESET);
                }
                sleep((long) (Math.random()*2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cistell.deixarpeça();
        }
    }
}
