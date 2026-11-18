public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    // Versi awal: return totalBelanja - nilai;
    // Keluaran keranjang kedua sebelum diperbaiki:
    //   Voucher Rp100.000    : Rp-36.000   (melanggar kontrak, hasil negatif)
    // Perbaikan: hasil tidak boleh di bawah nol.
    @Override
    public int totalBayar(int totalBelanja) {
        return Math.max(0, totalBelanja - nilai);
    }
}