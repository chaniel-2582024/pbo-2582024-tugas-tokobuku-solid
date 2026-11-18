public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;
    private int diskonPersen;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit, int diskonPersen) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
        this.diskonPersen = diskonPersen;
    }

    @Override
    public void unduh() {
        System.out.println("Mengunduh " + getJudul() + " (" + durasiMenit + " menit)");
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() - getHarga() * diskonPersen / 100;
    }

    @Override
    public String getKeterangan() {
        return durasiMenit + " menit, diskon " + diskonPersen + "%";
    }
}