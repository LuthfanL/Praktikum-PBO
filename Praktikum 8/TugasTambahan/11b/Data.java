/*
 * Nama        : Muhammad Luthfan Lazuardi
 * NIM         : 24060122120010
 * Tanggal     : 8 Mei 2024
 * File        : Data.java
 * Deskripsi   : class konstruksi generics untuk kupu
 */

public class Data<T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }
    public void setIsi(T x) {
        this.isi = x;
    }
}
