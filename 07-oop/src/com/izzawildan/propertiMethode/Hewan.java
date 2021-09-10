package com.izzawildan.propertiMethode;

public class Hewan {

  //   properti atau fields
  // Inisiasi dengan nilai inisial
  double tinggi;
  double berat;

  // Inisiasi melalui konstruktor
  int umur;

  //   Hewan(int umurParam) {
  //     umur = umurParam;
  //   }

  //   constructor dengan parameter
  Hewan(int umur) {
    this.umur = umur;
    //   Kode this mereferensikan objek yang sedang digunakan. Pemanggilan this ada di dalam konstruktor kelas Hewan. Artinya nilai this mereferensikan objek Hewan. Kesimpulannya kode this.umur adalah akses ke atribut umur kelas Hewan dalam kelas Hewan.
  }

  void lari() {
    System.out.println("Berlari dengan cepat");
  }

  void jalan() {
    System.out.println("Berjalan dengan pelan");
  }

  void makan() {
    System.out.println("Makan dengan menggunakan mulut");
  }

  //   methode dengan pengembalian
  double getBerat() {
    return berat;
  }

  double getTinggi() {
    return tinggi;
  }

  int getUmur() {
    return umur;
  }
}
