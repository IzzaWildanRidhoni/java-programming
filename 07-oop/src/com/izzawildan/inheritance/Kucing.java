package com.izzawildan.inheritance;

public class Kucing extends Hewan {

  public Kucing() {
    super(); //akan memanggil constructor parent class
    System.out.println("construct kucing");
  }
}
