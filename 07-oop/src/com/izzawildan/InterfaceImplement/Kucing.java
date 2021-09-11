package com.izzawildan.InterfaceImplement;

// public class Kucing implements Hewan {}

// Jika kita ingin menjadikan kelas Kucing sebagai abstract class, cukup tambahkan keyword abstract sebelum keyword classseperti berikut.
// public abstract class Kucing implements Hewan {}

// Jika kita ingin mengimplementasikan interface maka kita harus membuat method signature (nama, parameter, return) yang sama disertai isi kode program untuk metodenya. Berikut contoh implementasi metode makan.
public class Kucing implements Hewan {

  @Override
  public void makan() {}
}
