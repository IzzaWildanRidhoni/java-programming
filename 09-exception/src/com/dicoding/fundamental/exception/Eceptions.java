package com.dicoding.fundamental.exception;

public class Eceptions {
    public static void main(String[] args) {
        int[] a = new int[5] ;

        try {
            System.out.println("akses elemen ke 5: "+a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("execption thrown : "+e);
        }finally{
            a[4]=10;
            System.out.println("nilai elemen terakhir :"+a[4]);
        }
    }
}
