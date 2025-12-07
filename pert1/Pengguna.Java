class Pengguna {
    // State / atribut data pengguna
    int umur;        // dalam tahun
    double berat;    // dalam kg
    double tinggi;   // dalam cm

    // Konstanta faktor aktivitas (tidak bisa diubah)
    final double faktorAktivitas = 1.2;

    // 1. Menghitung BMI
    double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;  // konversi cm -> meter
        return berat / (tinggiMeter * tinggiMeter);
    }

    // 2. Menampilkan kategori BMI
    void tampilKategori() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    // 3. Menghitung kebutuhan kalori
    double hitungKalori() {
        return berat * faktorAktivitas * 10;
    }

    // 4. Menampilkan semua informasi
    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.printf("BMI: %.2f%n", hitungBMI());
        tampilKategori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari%n", hitungKalori());
        System.out.println("====================================");
    }
}
