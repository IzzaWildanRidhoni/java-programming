package com.dicoding.fundmental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {

  public static void main(String[] args) {
    List<String> ls = new ArrayList();
    ls.add("String 1");
    ls.add("String 2");

    print(ls); //apakah baris ini valid? tidak

    Collection<Planet> cp = new ArrayList();
    cp.add(new Planet("mercury", 0.06));
    cp.add(new Planet("venus", 0.2));

    print(ls); //apakah baris ini valid ? tidak
  }

  //   public static void print(Collection<Object> collection) {
  public static void print(Collection<?> collection) { // perubahan ada di baris ini
    for (Object o : collection) {
      System.out.println(o);
    }
  }
}
