public class LampuPintar extends PerangkatIoT
        implements BisaDikendalikan, BisaDipantau {

    private int tingkatKecerahan;
    private String warna;

    public LampuPintar(String id, String nama) {
        super(id, nama);
        this.tingkatKecerahan = 50;
        this.warna = "Putih";
    }

    public LampuPintar(String id, String nama, String lokasi,
                       int tingkatKecerahan, String warna) {
        super(id, nama, lokasi);
        setTingkatKecerahan(tingkatKecerahan);
        this.warna = warna;
    }

    public int getTingkatKecerahan() {
        return tingkatKecerahan;
    }

    public void setTingkatKecerahan(int tingkatKecerahan) {
        if (tingkatKecerahan < 0) {
            this.tingkatKecerahan = 0;
        } else if (tingkatKecerahan > 100) {
            this.tingkatKecerahan = 100;
        } else {
            this.tingkatKecerahan = tingkatKecerahan;
        }
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void nyalakan() {
        setAktif(true);
        System.out.println(getNama() + " berhasil dinyalakan.");
    }

    @Override
    public void matikan() {
        setAktif(false);
        System.out.println(getNama() + " berhasil dimatikan.");
    }

    @Override
    public String bacaStatus() {
        return "Lampu " + getNama() + " | " + (isAktif() ? "Menyala" : "Mati")
                + " | Kecerahan: " + tingkatKecerahan + "%"
                + " | Warna: " + warna;
    }

    @Override
    public void evaluasiKondisi(double tingkatCahaya) {
        System.out.println("Evaluasi lampu berdasarkan cahaya ruangan: " + tingkatCahaya + " lux");
        if (tingkatCahaya < 100) {
            nyalakan();
            setTingkatKecerahan(100);
            System.out.println("Ruangan gelap, lampu diatur menjadi terang.");
        } else {
            matikan();
            System.out.println("Ruangan cukup terang, lampu dimatikan untuk menghemat energi.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kecerahan    : " + tingkatKecerahan + "%");
        System.out.println("Warna        : " + warna);
    }
}
