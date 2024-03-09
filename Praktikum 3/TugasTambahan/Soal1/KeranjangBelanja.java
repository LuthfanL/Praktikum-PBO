/*
 * Nama     : Muhammad Luthfan Lazuardi
 * NIM      : 24060122120010
 * Tanggal  : 6 Maret 2024
 */

public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        if (count < keranjang.length) {
            keranjang[count] = item;
            count++;
        } else {
            //assert (count <= keranjang.length) : "Keranjang sudah penuh";
            assert false : "Keranjang sudah penuh";
        }
    }
    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}

