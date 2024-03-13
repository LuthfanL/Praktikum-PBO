/*
 * File : PersegiPanjang.java
 * Penulis : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Deskripsi : representasi dasar dari objek persegi panjang, turunan kelas poligon
 */

package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }
    public void printInfo(){
        System.out.println("\nBangun Persegi Panjang bersisi " + this.getJumlahSisi());
        System.out.println("Memiliki Panjang " + this.panjang);
        System.out.println("Memiliki Lebar " + this.lebar);
    }
}
