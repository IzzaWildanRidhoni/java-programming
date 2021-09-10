package com.izzawildan.accessModifier.package1;

public class Main {

  public static void main(String[] args) {
    KelasA kelasA = new KelasA();

    // karena private maka tidak bisa diakses di kelas lain
    // System.out.println(kelasA.memberA);
    // System.out.println(kelasA.functionA());

    System.out.println(kelasA.functionB());

    System.out.println(kelasA.memberB);
    System.out.println(kelasA.memberC);
  }
}
