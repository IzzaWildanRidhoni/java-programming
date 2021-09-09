package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        // Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("Mercury");//method add() untuk menambah objek ke Set
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");//menambahkan object earth beberapa kali
        planets.add("Earth");
        planets.add("Mars");/// objek bisa terus ditambahkan ke Set

        // method size() untuk mendapatkan ukuran set
        System.out.println("set planets awal : (size = "+planets.size()+")");
        for(String planet: planets){
            System.out.println("\t"+planet);
        }

        planets.remove("Venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set Planet akhir : (size = "+planets.size()+")");
        for(Iterator iterator = planets.iterator();iterator.hasNext();){
            // looping menggunakan iterator
            System.out.println("\t"+iterator.next());
        }
        
    }
}
