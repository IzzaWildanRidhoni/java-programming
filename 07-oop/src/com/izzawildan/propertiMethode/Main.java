package com.izzawildan.propertiMethode;

public class Main {

  public static void main(String[] args) {
    // kita tambahkan 1 argumen dengan  nilai int 2
    // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
    Hewan kucing = new Hewan(2);
    // Pemanggilan metode biasa disebut dengan “invoke”.
    kucing.makan();
    kucing.jalan();
    kucing.lari();

    // contoh penggunaan fungsi getUmur
    System.out.println("umurnya adalah " + kucing.getUmur());

    // perhitungan indexs massa tubuh (BMI)
    // berat (kg) /tinggi (m) * tinggi (m)
    double bmi =
      kucing.getBerat() /
      ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
    System.out.println("indexs masa tubuhnya adalah " + bmi);
  }
}
