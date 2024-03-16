/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Tanggal : 15 Maret 2024
 */

package org.motor;
import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    public int getCC() {
        return cc;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis : Kendaraan Motor");
        System.out.println("Kapasitas Mesin CC : " + cc);
    }

    public double hitungHorsepower(int angka) {
        double hpUp = (double) cc / 15;
        double hpDown = (double) cc / 17;
        double horsepower = (double) cc / angka;
        System.out.println("Motor " + nama + " diperkirakan memiliki tenaga antara " + hpDown + " sampai " + hpUp + " HP");
        return horsepower;
    }

    @Override
    public void klakson() {
        System.out.println("Bunyi klakson dari " + nama + ", Womp Womp!");
    }
}

