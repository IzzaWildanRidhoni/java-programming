package com.izzawildan.accessModifier.package3;

public class Perhitugan {

  //   Variabel yang berdiri sendiri tanpa perlu instance dari kelas
  public static int nilai = 0;

  //   Metode yang berdiri sendiri tanpa perlu instance dari kelas.
  protected static int getNilai() {
    return nilai;
  }

  Perhitugan() {
    nilai++;
  }
}
