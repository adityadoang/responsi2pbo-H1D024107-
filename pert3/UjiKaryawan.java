class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Buat objek Karyawan biasa (Budi)
        Karyawan karyawanBiasa = new Karyawan("Budi Santoso", 4000000.0);

        // Tampilkan info Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        karyawanBiasa.tampilInfo();

        System.out.println(); // Baris baru/jarak

        // Buat objek Manajer (Siti)
        Manajer manajer = new Manajer("Siti Aminah", 6000000.0, 2500000.0);

        // Tampilkan info Manajer
        System.out.println("Status: Manajer");
        manajer.tampilInfo();
    }
}
