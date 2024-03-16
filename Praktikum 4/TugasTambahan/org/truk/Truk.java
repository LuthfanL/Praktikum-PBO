/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Tanggal : 15 Maret 2024
 */


package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getBeratMuatan() {
        return beratMuatan;
    }

    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis : Kendaraan Truk");
        System.out.println("Kapasitas Muatan : " + kapasitasMuatan + " kg");
        System.out.println("Berat Muatan awal : " + beratMuatan + " kg");
    }

    public void muatBarang(int berat) {
        System.out.println("Tambahan barang yang akan dimuat (muatBarang) : " + berat + " kg");
        if (beratMuatan + berat > kapasitasMuatan) {
            System.out.println("Muatan melebihi kapasitas muatan truk.");
        } else {
            beratMuatan += berat;
            System.out.println("Muatan berhasil dimuat, berat muatan sekarang : " + beratMuatan + " kg");
        }
    }

    @Override
    public void klakson() {
        System.out.println("Bunyi klakson dari " + nama + ", Honk Honk!");
    }
}


