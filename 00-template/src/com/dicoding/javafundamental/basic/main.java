package com.dicoding.javafundamental.basic;

import java.util.Date;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;

import org.apache.commons.lang3.time.DateUtils;

public class main {
    public static void main(String[] args) {
        System.out.println("wkwk");

        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("hari ini = " + today);
        Date tommorow = DateUtils.addDays(today,1);
        System.out.println("besok = " + tommorow);

    }
}
