/*
 * File : Segitiga.java
 * Penulis : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Deskripsi : representasi dasar dari objek segitiga, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasSegitiga(){
        return alas * tinggi * 0.5;
    }

    public void printInfoSegitiga(){
        System.out.println("\nBangun Segitiga bersisi " + this.getJumlahSisi());
        System.out.println("Memiliki Alas " + this.alas);
        System.out.println("Memiliki Tinggi " + this.tinggi);
    }
}
