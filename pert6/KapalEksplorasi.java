public class KapalEksplorasi extends KendaraanGalaksi {

    private int modulScan;

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15)
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        else
            System.out.println("Kapal eksplorasi siap berangkat!");
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 2;
        if (getLevelEnergi() < konsumsi)
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        else {
            setLevelEnergi(getLevelEnergi() - konsumsi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int sebelum = getLevelEnergi();
        setLevelEnergi(sebelum + jumlah);
        System.out.println("Mengisi energi kapal dari " + sebelum + "% menjadi " + getLevelEnergi() + "%.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
