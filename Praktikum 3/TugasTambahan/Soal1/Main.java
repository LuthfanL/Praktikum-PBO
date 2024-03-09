/*
 * Nama     : Muhammad Luthfan Lazuardi
 * NIM      : 24060122120010
 * Tanggal  : 6 Maret 2024
 */

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.addItem("Buku");
        keranjang.addItem("Pensil");
        keranjang.addItem("Penghapus");
        keranjang.addItem("Penggaris");
        keranjang.addItem("Meja Lipat");
        keranjang.addItem("Cermin");

        keranjang.printItems();
    }
}

