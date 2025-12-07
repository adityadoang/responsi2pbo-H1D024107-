class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] daftar = new defaultMesin[5];

        daftar[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftar[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        daftar[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftar[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftar[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : daftar) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : daftar) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        System.out.println();
        System.out.println("=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin terbaik = daftar[0];
        for (int i = 1; i < daftar.length; i++) {
            if (daftar[i].nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = daftar[i];
            }
        }
        System.out.println(terbaik.namaMesin + " \u2192 " + terbaik.nilaiPerforma());

        System.out.println();
        System.out.println("=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < daftar.length - 1; i++) {
            for (int j = i + 1; j < daftar.length; j++) {
                if (daftar[j].nilaiPerforma() > daftar[i].nilaiPerforma()) {
                    defaultMesin t = daftar[i];
                    daftar[i] = daftar[j];
                    daftar[j] = t;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + daftar[i].namaMesin +
                    " \u2192 " + daftar[i].nilaiPerforma());
        }
    }
}
