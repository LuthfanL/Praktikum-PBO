/*
Nama    : Muhammad Luthfan Lazuardi
NIM     : 24060122120010
Tanggal : 29 Februari 2024
*/

package org.bangundatar;
import org.poligon.Poligon;

public class SegiEmpat extends Poligon
{
    private double panjangSisi;

    public SegiEmpat(double panjangSisi) //asumsi SegiEmpat adalah persegi
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }
    public double hitungLuasSegiEmpat()
    {
        return panjangSisi * panjangSisi;
    }
    public double getPanjangSisi()
    {
        return this.panjangSisi;
    }
}

