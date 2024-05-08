/*
 * Nama		    : Muhammad Luthfan Lazuardi
 * NIM		    : 24060122120010
 * File		    : Programmer.java
 */

public class Programmer extends Pegawai{
    int bonus=450000;
    public Programmer(String nama){
        this.nama=nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : "+this.nama+", Gaji pokok : "+this.gajiPokok);
        System.out.println("Bonus : "+this.bonus);
    }
}
