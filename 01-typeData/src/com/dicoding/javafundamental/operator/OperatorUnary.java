package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("operator unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("hasil +5 = "+ hasil);
        System.out.println();
        
        System.out.println("operator unary minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("hasil -5 = "+nilaiAwal2);
        System.out.println();

        System.out.println("operator increment");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("hasil 5++ = "+nilaiAwal3);
        System.out.println();

        System.out.println("operator pengurangan / decrement");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("hasil 5-- = "+nilaiAwal4);
        System.out.println();

        System.out.println("operator komplemen logika");        
        boolean sukses  = false;
        System.out.println("hasil !false = "+ !sukses);
        System.out.println();
    }
}
