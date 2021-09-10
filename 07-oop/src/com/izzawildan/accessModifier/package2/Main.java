package com.izzawildan.accessModifier.package2;

import com.izzawildan.accessModifier.package1.KelasA;

public class Main {

  public static void main(String[] args) {
    //   kode ini pasti akan mengalami kompile error terjadi karena bukan public
    KelasA kelasA = new KelasA();
    // System.out.println(kelasA.functionB);

    // System.out.println(kelasA.memberB);
    // System.out.println(kelasA.memberC);

    KelasB kelasB = new KelasB();
    kelasB.methodC();
  }
}
