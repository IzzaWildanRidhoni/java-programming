package com.izzawildan.inheritance;

public class Main {

  public static void main(String[] args) {
    Hewan hewan = new Hewan(); //memanggil constructor
    System.out.println("Apakah hewan IS-A Objek -> "+ (hewan instanceof Object));
    System.out.println("Apakah hewan IS-A Hewan -> "+ (hewan instanceof Hewan));
    System.out.println("Apakah hewan IS-A Kucing -> "+ (hewan instanceof Kucing));
    
    System.out.println("--------------------------");
    Kucing kucing = new Kucing(); //memanggil constructor
    System.out.println("Apakah hewan IS-A Objek -> "+ (kucing instanceof Object));
    System.out.println("Apakah kucing IS-A Hewan -> "+ (kucing instanceof Hewan));
    System.out.println("Apakah kucing IS-A Kucing -> "+ (kucing instanceof Kucing));

    System.out.println("-------------------------");

    hewan.makan();// kucing mewarisi metode makan() dari parent class Hewan
    kucing.makan();
    kucing.makan("daging ikan");

    System.out.println("--------------------------");

    Kucing meow = new Kucing("Ocicat","tropis");
    Kucing puss = new Kucing("Ocicat","subtropis");
    Kucing popo = new Kucing("Anggora","subtropis");

    System.out.println(meow.toString());
    System.out.println(puss.toString());
    System.out.println(popo.toString());

    System.out.println("meow equals puss? "+meow.equals(puss));
    System.out.println("meow equals popo? "+meow.equals(popo));


    // POLIMORPHISM
    System.out.println("---------------------------------------");
    Object o = new Kucing(); //kucing adalah objek
    Hewan h = new Kucing();//kucing adalah hewan
    Kucing k = new Kucing();//kucing adalah kucing pastinya :)

    // o.makan(); error karena method makan tidak ada di class object
    h.makan();
    k.makan();

    Object object = k;//bisa langsung di assign
    Hewan hewanK = k;//bisa langsung di assign

    // Object.makan(); error karena method makan() tidak ada di class Object
    hewanK.makan();

    Kucing KucingK = (Kucing) h;//tidak bisa langsung di assign perlu di casting
    KucingK.makan();

    Hewan harimau = new Hewan();
    // Kucing anggora =(kucing) harimau; // compile OK tetapi runtime error ClassCastException

  }
}

