/*
 * Nama     : Muhammad Luthfan Lazuardi
 * NIM      : 24060122120010
 * Tanggal  : 6 Maret 2024
 */

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman = new Buku[3];
    private int jumlahBukuPinjaman = 0;

    public Anggota(String nama) {
        this.nama = nama;
        //bukuPinjaman = new Buku[3];
        //jumlahBukuPinjaman = 0;
    }
    public String getNama() {
        return nama;
    }
    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }
    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }
    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Anggota tidak dapat meminjam lebih dari 3 buku \n");
        }
        if (!buku.isTersedia()) {
            throw new BukuTidakTersediaException("Buku dengan judul " + buku.getJudul() + " tidak tersedia");
        }

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
        //System.out.println(" Nama Anggota " + nama + " telah meminjam buku dengan judul: " + buku.getJudul());
        System.out.println("\nNama Anggota : " + nama);
        System.out.println("Judul Buku yang dipinjam : " + buku.getJudul());
    }
}
