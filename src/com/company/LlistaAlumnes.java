package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class LlistaAlumnes implements Callable<Integer> {

    String nom;
    private int operador;

    public String getNom() {
        return nom;
    }

    public LlistaAlumnes(String nom) {
        this.nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public Integer call() throws Exception {
        operador=(int)(Math.random()*10);
        return operador;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Integer> llistaResultats = new ArrayList<>();
        List<LlistaAlumnes> llistaTasques= new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            LlistaAlumnes calcula = new LlistaAlumnes("alumne "+i);
            llistaTasques.add(calcula);
        }

        for (int i = 0; i < llistaResultats.size(); i++) {
            System.out.println();
        }

    }
}
