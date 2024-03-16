/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Tanggal : 15 Maret 2024
 */


package org.main;

import org.kendaraan.*;
import org.mobil.*;
import org.motor.*;
import org.truk.*;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Muhammad Luthfan Lazuardi");
        Mobil mobil = new Mobil("Toyota Supra MK5", 2);
        Motor motor = new Motor("Kawasaki Ninja H2R", 998);
        Truk truk = new Truk("Mercedes-Benz Axor", 14000);

        System.out.println("\n====== test Kendaraan ======");
        kendaraan.setKecepatan(80);
        kendaraan.cetakInfo();
        kendaraan.gas(50, 30);
        kendaraan.berhenti();
        kendaraan.klakson();
        System.out.println();

        System.out.println("====== Mobil ======");
        mobil.setKecepatan(265);
        mobil.cetakInfo();
        mobil.bukaPintu(1);
        mobil.klakson();
        System.out.println();

        System.out.println("====== Motor ======");
        motor.setKecepatan(400);
        motor.cetakInfo();
        motor.setCC(1000);
        int ccTerbaru = motor.getCC();
        System.out.println("CC motor terbaru setelah di (setCC) : " + ccTerbaru + " cc");
        motor.hitungHorsepower(16);
        motor.klakson();
        System.out.println();

        System.out.println("====== Truk ======");
        truk.setKecepatan(80);
        truk.cetakInfo();
        truk.setBeratMuatan(2000);
        int panggilMuatan = truk.getBeratMuatan();
        System.out.println("Berat Muatan Truk yang sudah diatur ulang (setBeratMuatan) : " + panggilMuatan + " kg");
        truk.muatBarang(3000);
        truk.klakson();
    }
}

