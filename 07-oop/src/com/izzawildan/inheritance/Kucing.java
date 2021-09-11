package com.izzawildan.inheritance;

public class Kucing extends Hewan {
  private String ras;
  private String habitat;



  public Kucing(String ras, String habitat) {
    this.ras = ras;
    this.habitat = habitat;
  }

  @Override 
  public String toString(){
    return "kucing ras : "+ras+", habitat : "+habitat;
  }

  @Override
  public boolean equals(Object obj){
    if(obj instanceof Kucing){
      Kucing other =(Kucing) obj;
      return this.ras.equals(other.ras);
    }else{
      return false;
    }
  }
 
  public Kucing() {
    super(); //akan memanggil constructor parent class
    System.out.println("construct kucing");
  }

  public void makan(){//overiding
    System.out.println("kucing sedang makan");
  }

  public void makan(String food){//overloading
    System.out.println("Kucing makan "+food);
  }
  
}
