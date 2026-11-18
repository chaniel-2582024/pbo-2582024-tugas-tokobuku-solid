public interface MetodeBayar {
    // Kontrak (LSP): totalBayar() hasilnya tidak pernah negatif (minimal 0).
    String nama();
    int totalBayar(int totalBelanja);
}