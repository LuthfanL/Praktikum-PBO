/*
 * Nama		    : Muhammad Luthfan Lazuardi
 * NIM		    : 24060122120010
 * File		    : Manajer.java
 */

public class Manajer extends Pegawai{
    int tunjangan=700000;

    public Manajer(String nama){
        this.nama=nama;
    }
    @Override
    public void tampilData() {
        System.out.println("Nama :"+this.nama+", Gaji pokok : "+this.gajiPokok);
        System.out.println("Tunjangan : "+this.tunjangan);
    }
}
