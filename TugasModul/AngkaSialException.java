/*
 * File         : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama / NIM   : Muhammad Luthfan Lazuardi / 24060122120010
 * Tanggal      : 6 Maret 2024
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
