package com.izzawildan.accessModifier.package3;

public class Main {

  public static void main(String[] args) {
    //   karena static jadi tidak perlu instance objek
    System.out.println("nilainya adalah " + Perhitugan.nilai);

    for (int i = 0; i < 5; i++) {
      new Perhitugan();
    }

    System.out.println("sampai " + Perhitugan.nilai);

    // tanpa instance objek Perhitungan karena methodnya static
    System.out.println("getNilai memiliki nilai = " + Perhitugan.getNilai());
  }
}
