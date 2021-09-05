package com.dicoding.javafundamental.array;

public class loopingArray {
    public static void main(String[] args) {
        int[] ganjil = new int[100];

        for (int x = 0; x < ganjil.length; x++) {
            if (x%2 == 0) {
                System.out.println("genap ke -"+x);
            }
        }

    }
}
