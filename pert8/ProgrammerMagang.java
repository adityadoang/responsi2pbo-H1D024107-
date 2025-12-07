public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    String nama;
    double gajiPerJam;
    String pinRahasia;
    boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }

    @Override
    public double hitungGaji(int jamKerja) {
        return jamKerja * gajiPerJam;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    @Override
    public void login(String pin) {
        if (pinRahasia.equals(pin)) {
            sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        if (sedangLogin) {
            sedangLogin = false;
        }
        System.out.println(nama + " berhasil logout.");
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}
