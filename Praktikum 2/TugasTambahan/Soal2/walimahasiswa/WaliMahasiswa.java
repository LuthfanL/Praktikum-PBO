/*
Nama    : Muhammad Luthfan Lazuardi
NIM     : 24060122120010
Tanggal : 29 Februari 2024
*/

package org.walimahasiswa;

public class WaliMahasiswa {
    private String nama;
    private String nik;
    public String nomorHp;
    public String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat) {
        this.nama = nama;
        this.nik = nik;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getNik(){
        return nik;
    }
    public String getNomorHp(){
        return nomorHp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
