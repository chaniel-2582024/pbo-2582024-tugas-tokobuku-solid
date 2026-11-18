public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    // ongkir Rp5.000 untuk setiap 500 gram (dibulatkan ke atas)
    private int hitungOngkir() {
        return ((beratGram + 499) / 500) * 5000;
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() + hitungOngkir();
    }

    @Override
    public String getKeterangan() {
        return beratGram + " gram, ongkir " + formatRupiah(hitungOngkir());
    }
}