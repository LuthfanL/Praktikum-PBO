/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Tanggal : 15 Maret 2024
 */


package org.mobil;
import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis : Kendaraan Mobil");
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu nomor " + nomorPintu + " terbuka");
    }
    @Override
    public void klakson() {
        System.out.println("Bunyi klakson dari " + nama + ", Vroom Vroom!");
    }
}



