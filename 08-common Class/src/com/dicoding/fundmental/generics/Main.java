package com.dicoding.fundmental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List lo = new ArrayList(); //list tanpa parameter
    lo.add("lo - String 1"); //lo menamampung objek string
    lo.add(new Planet("mercury", 0.06)); //lo menampung objek planet

    for (Object o : lo) {
      Planet p = (Planet) o; // perlu type casting dari objek ke planet
      p.print();
    }

    List<Planet> lp = new ArrayList(); //list dengan type-parameter planet
    lp.add(new Planet("Mercury", 0.06)); //lp menampung objek planet
    // lp.add("lp - String 1"); //baris ini kompile error lp tidak diiinkan menampung objek string

    for (Planet p : lp) {
      p.print();
    }
  }
}
