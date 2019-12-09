package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//public class LlistaAlumnesSeq  {
//
//    String nom;
//    private int operador;
//
//    public String getNom() {
//        return nom;
//    }
//
//    public LlistaAlumnesSeq(String nom) {
//        this.nom = nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public int operadores (){
//        operador=(int)(Math.random()*10);
//        return operador;
//    }
//
//    public static void main(String[] args) throws InterruptedException, ExecutionException {
//
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
//        List<LlistaAlumnesSeq> llistaTasques= new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            LlistaAlumnesSeq calcula = new LlistaAlumnesSeq("alumne "+i);
//            llistaTasques.add(calcula);
//        }
//
//        List <Future<Integer>> llistaResultats;
//        llistaResultats = executor.invokeAll(llistaTasques);
//
//        executor.shutdown();
//
//        for (int i = 0; i < llistaResultats.size(); i++) {
//            Future<Integer> resultat = llistaResultats.get(i);
//            try {
//                System.out.println("Resultat tasca "+llistaTasques.get(i).getNom()+ " és: " + resultat.get());
//            } catch (InterruptedException | ExecutionException ignored) {
//            }
//        }
//
//    }
//}
