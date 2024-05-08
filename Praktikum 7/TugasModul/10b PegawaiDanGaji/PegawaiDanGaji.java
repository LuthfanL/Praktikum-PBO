/*
 * Nama		    : Muhammad Luthfan Lazuardi
 * NIM		    : 24060122120010
 * File		    : PegawaiDanGaji.java
 */

public class PegawaiDanGaji {
    public static void main(String args[]){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
