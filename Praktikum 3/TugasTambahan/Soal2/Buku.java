/*
 * Nama     : Muhammad Luthfan Lazuardi
 * NIM      : 24060122120010
 * Tanggal  : 6 Maret 2024
 */

public class Buku {
    private String judul;
    private boolean tersedia;

    public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
    }
    public String getJudul() {
        return judul;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}

