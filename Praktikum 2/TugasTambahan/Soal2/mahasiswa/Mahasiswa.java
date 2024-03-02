/*
Nama    : Muhammad Luthfan Lazuardi
NIM     : 24060122120010
Tanggal : 29 Februari 2024
*/


package org.mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa {
    private String nama;
    public String jurusan;
    private String nik;
    public String nim;
    public WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nik = nik;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getNik(){
        return nik;
    }
    public WaliMahasiswa getWali(){
        return wali;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }
    public void cetak(){
        System.out.println("Nama Mahasiswa\t: " + getNama());
        System.out.println("NIK Mahasiswa\t: " + getNik());
        System.out.println("NIM \t\t\t: " + getNim());
        System.out.println("Jurusan\t\t\t: " + getJurusan());
        System.out.println("Nama Wali\t\t: " + getWali().getNama());
        System.out.println("NIK Wali\t\t: " + getWali().getNik());
        System.out.println("No. HP Wali\t\t: " + getWali().getNomorHp());
        System.out.println("Alamat Wali\t\t: " + getWali().getAlamat() + "\n");
    }

}
