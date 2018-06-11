package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    static String goal = "evolutionforthewin";

    static int populationSize = 100;
    static ArrayList<Individual> population = new ArrayList<>();
    static Random r = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < populationSize; i++) {
            Individual ind = new Individual();
            ind.countFitness();
            population.add(ind);
        }

        for (int i = 0; i < 1000; i++) {

           // TODO
        }

    }

    static Individual selection(){

        return population.get(r.nextInt(populationSize));

        // TODO
    }

    static void makeOffspring(ArrayList<Individual> children, Individual p1, Individual p2){

        Individual c1 = new Individual();
        Individual c2 = new Individual();

        // TODO

        children.add(c1);
        children.add(c2);
    }

    static void mutate(Individual i){

      // TODO

    }

}
