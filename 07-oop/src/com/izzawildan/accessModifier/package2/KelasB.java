package com.izzawildan.accessModifier.package2;

import com.izzawildan.accessModifier.package1.KelasA;

public class KelasB extends KelasA {

  @Override
  protected void methodC() {
    super.methodC();

    System.out.println("contoh pemanggilan protected  dari luar package");
  }
}
