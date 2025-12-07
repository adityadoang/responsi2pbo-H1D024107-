class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    String kode;
    String nama;
    double harga;
    int stok;

    // Constructor 1: hanya kode dan nama
    BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0; // harga default
        this.stok = 0;    // stok default
    }

    // Constructor 2: kode, nama, dan harga
    BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;    // stok default
    }

    // Constructor 3: kode, nama, harga, dan stok
    BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Mengubah harga barang
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Menambah stok barang
    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    // Menampilkan informasi lengkap barang
    void tampilInfo() {
        System.out.println(
                "Alat musik " + nama +
                        " | Kode: " + kode +
                        " | Harga: Rp " + harga +
                        " | Stok: " + stok + " unit"
        );
    }
}
