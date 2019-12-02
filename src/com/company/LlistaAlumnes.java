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

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        List<LlistaAlumnes> llistaTasques= new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            LlistaAlumnes calcula = new LlistaAlumnes("alumne "+i);
            llistaTasques.add(calcula);
        }

        List <Future<Integer>> llistaResultats;
        llistaResultats = executor.invokeAll(llistaTasques);

        executor.shutdown();

        for (int i = 0; i < llistaResultats.size(); i++) {
            Future<Integer> resultat = llistaResultats.get(i);
            try {
                System.out.println("Resultat tasca "+llistaTasques.get(i).getNom()+ " és: " + resultat.get());
            } catch (InterruptedException | ExecutionException ignored) {
            }
        }

    }
}
