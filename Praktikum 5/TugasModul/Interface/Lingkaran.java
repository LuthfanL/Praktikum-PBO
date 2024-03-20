/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Tanggal : 20 Maret 2024
 * File : Lingkaran.java
 * Deskripsi : kelas implementasi IArea berupa cara menghitung
 *              luas lingkaran
 */


import static java.lang.Math.PI;
class Lingkaran {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }

}
