package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {
        // menggunakan HashMap
        Map<String, Planet> planets = new HashMap();
        planets.put("key-1", new Planet("mercury", 0.06)); //// method put() untuk menambahkan objek ke Map
        planets.put("key-2", new Planet("venus", 0.82));
        planets.put("key-3", new Planet("earth", 1.00));
        planets.put("key-4", new Planet("mars", 0.11));
        planets.put("key-4", new Planet("mars-x", 0.11));// menambahkan ke Map dengan key yang sama

        // ethod size() untuk medapatkan ukuran 
        System.out.println("Map planets awal : (size = "+planets.size()+")");
        for (String key : planets.keySet()) { //looping key dari Map
            // method get()   untuk elihat isi Map berdasarkan key
            System.out.println("\t "+key+" : "+planets.get(key));
        }
        
        planets.remove("key-2");// method remove() untuk mengeluarkan objek dari Map
        
        System.out.println("Map planets awal : (size = "+planets.size()+")");
        for (String key : planets.keySet()) { //looping key dari Map
            // method get()   untuk elihat isi Map berdasarkan key
            System.out.println("\t "+key+" : "+planets.get(key));
        }

        
    }
}
