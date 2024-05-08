/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * File : Lingkaran.java
 * Deskripsi : implementasi Lingkaran sebagai bangundatar
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
