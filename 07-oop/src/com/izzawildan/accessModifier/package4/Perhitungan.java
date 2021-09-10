package com.izzawildan.accessModifier.package4;

public class Perhitungan {

  final int nilai = 5;

  void ubahNilai() {
    //   kode dibawah ini akan menampilkan erorr
    // karena Final variabel hanya bisa diinisiasi sekali tidak bisa diubah
    nilai = 10;
  }
}
