package com.izzawildan.function;

public class MethodOverloading {

  // Java mengizinkan menggunakan dua atau lebih fungsi dengan nama yang sama dalam satu kelas. Namun, yang membedakan adalah parameternya. Konsep ini disebut dengan method overloading. Sebagai contoh kita membuat fungsi dengan nama yang sama pada kode sebelumnya dengan membedakan tipe datanya menjadi int.

  public static void main(String[] args) {
    double p = 7;
    double l = 6.5;
    double hasil = hitungLuas(p, l);
    System.out.println("hasilnya adalah = " + hasil);

    int pn = 7;
    int lb = 6;
    int hsl = hitungLuas(pn, lb);
    System.out.println("hasilnya adalah = " + hsl);
  }

  public static double hitungLuas(double panjang, double lebar) {
    double luas;
    luas = panjang * lebar;
    return luas;
  }

  public static int hitungLuas(int panjang, int lebar) {
    int luas;
    luas = panjang * lebar;
    return luas;
  }
}
