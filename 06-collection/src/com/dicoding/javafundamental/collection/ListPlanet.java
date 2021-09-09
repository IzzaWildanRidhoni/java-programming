package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "rifki";
        heroes[1] = "sven";

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("list planet awal:");
        for (int i = 0; i < planets.size(); i++) {
            // method get() untuk melihat  isi list pada index i
            System.out.println("\t index-"+i+" = "+planets.get(i));
        }

        planets.remove("venus");//method remove() untuk mengeluarkan objek dari list

        System.out.println("List Planet Akhir");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+i+" = "+planets.get(i));
        }


    }
}
