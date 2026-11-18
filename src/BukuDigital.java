import java.util.Locale;

public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;
    private int diskonPersen;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB, int diskonPersen) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
        this.diskonPersen = diskonPersen;
    }

    @Override
    public void unduh() {
        System.out.println("Mengunduh " + getJudul() + " (" + ukuranMB + " MB)");
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() - getHarga() * diskonPersen / 100;
    }

    @Override
    public String getKeterangan() {
        return String.format(Locale.US, "%.1f MB, diskon %d%%", ukuranMB, diskonPersen);
    }
}