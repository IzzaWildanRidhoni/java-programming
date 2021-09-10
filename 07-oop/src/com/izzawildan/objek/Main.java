package com.izzawildan.objek;

public class Main {

  public static void main(String[] args) {
    // menciptakan objek dengan nama 'obyekHewan'
    Hewan Elang = new Hewan("Elang");
    Hewan Kucing = new Hewan("Kucing");

    Elang.beratHewan(5);
    Elang.jumlahKakiHewan(2);
    Elang.cetakHewan();

    System.out.println();

    Kucing.beratHewan(2);
    Kucing.jumlahKakiHewan(4);
    Kucing.cetakHewan();
  }
}
