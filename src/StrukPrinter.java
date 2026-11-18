public class StrukPrinter {
    private static final int LEBAR = 41;

    private String garisJudul(String teks) {
        int sisa = LEBAR - teks.length() - 2;
        int kiri = sisa / 2;
        int kanan = sisa - kiri;
        return "-".repeat(kiri) + " " + teks + " " + "-".repeat(kanan);
    }

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println(garisJudul(judul));
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.printf("  %-11s : %s%n", "Harga", Buku.formatRupiah(b.getHarga()));
            System.out.printf("  %-11s : %s%n", "Keterangan", b.getKeterangan());
            System.out.printf("  %-11s : %s%n", "Harga akhir", Buku.formatRupiah(b.hitungHargaAkhir()));
        }
        System.out.println("-".repeat(LEBAR));
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println(garisJudul("PEMBAYARAN"));
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(), Buku.formatRupiah(m.totalBayar(totalBelanja)));
        }
    }
}