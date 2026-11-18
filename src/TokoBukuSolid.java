public class TokoBukuSolid {
    public static void main(String[] args) {
        Keranjang pertama = new Keranjang();
        pertama.tambah(new BukuCetak("Pemrograman Java", "John Doe", 120000, 750));
        pertama.tambah(new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400));
        pertama.tambah(new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5, 20));
        pertama.tambah(new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240, 10));

        Keranjang kedua = new Keranjang();
        kedua.tambah(new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5, 20));

        MetodeBayar[] pilihan = { new Tunai(), new Transfer(), new EWallet(), new Voucher(100000) };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("KERANJANG PERTAMA", pertama);
        printer.cetakPembayaran(pertama.hitungTotal(), pilihan);

        System.out.println();

        printer.cetakKeranjang("KERANJANG KEDUA", kedua);
        printer.cetakPembayaran(kedua.hitungTotal(), pilihan);
    }
}