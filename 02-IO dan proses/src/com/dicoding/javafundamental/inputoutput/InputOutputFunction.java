package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("program penjumlahan sangat sederhana");
        
        System.out.print("masukkan angka pertama: ");
        int value = scanner.nextInt();
        
        System.out.print("masukkan angka ke dua : ");
        int anotherValue  = scanner.nextInt();
        
        int result = value + anotherValue;
        System.out.println("hasilnya adalah : "+ result);
    }
}