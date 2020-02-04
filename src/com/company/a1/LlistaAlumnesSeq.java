package com.company.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class LlistaAlumnesSeq  {

    String nom;
    private int operador;

    public String getNom() {
        return nom;
    }

    public LlistaAlumnesSeq(String nom, int operador) {
        this.nom = nom;
        this.operador = operador;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Integer> llistaResultats = new ArrayList<>();
        List<LlistaAlumnesSeq> llistaTasques= new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            LlistaAlumnesSeq calcula = new LlistaAlumnesSeq("alumne "+i, (int)(Math.random()*10));
            llistaTasques.add(calcula);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Resultat "+i+": "+llistaTasques.get(i).operador);
        }
    }
}
