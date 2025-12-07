public class PesawatTempur extends KendaraanGalaksi {

    private int jumlahRudal;

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20)
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        else
            System.out.println("Mesin pesawat tempur diaktifkan.");
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 3;
        if (getLevelEnergi() < konsumsi)
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        else {
            setLevelEnergi(getLevelEnergi() - konsumsi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int sebelum = getLevelEnergi();
        setLevelEnergi(sebelum + jumlah);
        System.out.println("Energi pesawat bertambah dari " + sebelum + "% menjadi " + getLevelEnergi() + "%.");
    }

    public void tembakRudal(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah rudal harus lebih dari 0.");
            return;
        }

        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak, jumlah rudal tidak mencukupi!");
        }
    }
}
