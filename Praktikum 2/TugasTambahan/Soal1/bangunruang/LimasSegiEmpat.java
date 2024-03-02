/*
Nama    : Muhammad Luthfan Lazuardi
NIM     : 24060122120010
Tanggal : 29 Februari 2024
*/

package org.bangunruang;
import org.bangundatar.SegiEmpat;

public class LimasSegiEmpat {
    private SegiEmpat permukaan;
    private double tinggi;

    public LimasSegiEmpat(SegiEmpat permukaan, double tinggi) {
        this.tinggi = tinggi;
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        double panjangSisi = permukaan.getPanjangSisi();
        return (1.0 / 3) * (panjangSisi * panjangSisi) * tinggi;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuasSegiEmpat();
    }

    private double hitungLuasSisiLimas() {
        double panjangSisi = permukaan.getPanjangSisi();
        double tinggiSisiLimas = Math.sqrt((tinggi * tinggi) + ((panjangSisi / 2) * (panjangSisi / 2)));
        double luasSisi = 0.5 * panjangSisi * tinggiSisiLimas;
        return luasSisi;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuasAlas();
        double luasSisi = hitungLuasSisiLimas();
        return luasAlas + (4 * luasSisi);
    }
}


