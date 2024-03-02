/*
Nama    : Muhammad Luthfan Lazuardi
NIM     : 24060122120010
Tanggal : 29 Februari 2024
*/

package org.main;
import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Main {
    public static void main(String[] args) {

        WaliMahasiswa wali1 = new WaliMahasiswa(
                "Mukhsyon",
                "332467001",
                "082111222333",
                "Banyumanik"
        );

        WaliMahasiswa wali2 = new WaliMahasiswa(
                "Ali Mustamim",
                "332466002",
                "085222333444",
                "Ngaliyan"
        );

        WaliMahasiswa wali3 = new WaliMahasiswa(
                "Siti Nur Rohmah",
                "332472003",
                "089333444555",
                "Demak"
        );

        WaliMahasiswa wali4 = new WaliMahasiswa(
                "Krisnawati",
                "332465005",
                "0821999111222",
                "Kendal"
        );

        Mahasiswa mahasiswa1 =  new Mahasiswa(
                "Mahammad Luthfan Lazuardi",
                "332419002",
                "24060122120010",
                "Teknik Informatika",
                wali1
        );

        Mahasiswa mahasiswa2 = new Mahasiswa(
                "Asrul Huda",
                "332420009",
                "24060322130001",
                "Teknik Sipil",
                wali2
        );

        Mahasiswa mahasiswa3 = new Mahasiswa(
                "Zulfikar Dhiya Ulhaq",
                "332417004",
                "24060222240120",
                "Statistika",
                wali3
        );

        Mahasiswa mahasiswa4 = new Mahasiswa(
                "Sulthon Danial",
                "332512002",
                "240611222130020",
                "Teknik Komputer",
                wali4
        );

        mahasiswa1.cetak();
        mahasiswa2.cetak();
        mahasiswa3.cetak();
        mahasiswa4.cetak();

    }
}
