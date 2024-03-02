/*
Nama    : Muhammad Luthfan Lazuardi
NIM     : 24060122120010
Tanggal : 29 Februari 2024
*/

package org.main;
import org.bangundatar.SegiEmpat;
import org.bangunruang.LimasSegiEmpat;

public class MLimasSegiEmpat
{
    public static void main(String[] args)
    {
        SegiEmpat persegi = new SegiEmpat(4);
        LimasSegiEmpat limas = new LimasSegiEmpat(persegi, 9);
        System.out.println("\nLuas permukaan Limas Segi Empat dengan panjang sisi permukaan 4 dan tinggi limas 9 : " + limas.hitungLuasPermukaan());
        System.out.println("Volume Limas Segi Empat dengan panjang sisi permukaan 4 dan tinggi limas 9 : " + limas.hitungVolume());
    }
}
