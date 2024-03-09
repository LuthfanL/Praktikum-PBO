/*
 * Nama     : Muhammad Luthfan Lazuardi
 * NIM      : 24060122120010
 * Tanggal  : 6 Maret 2024
 */

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Muhammad Luthfan Lazuardi");
        Anggota anggota2 = new Anggota("Al Imam Mahdi");
        Buku buku1 = new Buku("Harry Potter");
        Buku buku2 = new Buku("Game of Thrones");
        Buku buku3 = new Buku("Dungeon and Dragons");
        Buku buku4 = new Buku("Borutod");

        try {
            anggota1.pinjamBuku(buku1);
            anggota1.pinjamBuku(buku2);
            anggota1.pinjamBuku(buku3);
            anggota1.pinjamBuku(buku4);
            //anggota2.pinjamBuku(new Buku("Aneka Menu Berbuka Puasa Edisi 2024"));
            anggota2.pinjamBuku(buku1);
            anggota2.pinjamBuku(buku2);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("\nError : " + e.getMessage());
        } catch (BukuTidakTersediaException ea) {
            System.out.println("\nError : " + ea.getMessage());
        }
    }
}
