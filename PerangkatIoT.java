public abstract class PerangkatIoT {
    public static final String NAMA_SISTEM = "SMART HOME IoT SYSTEM";

    private final String idPerangkat;
    private String nama;
    private String lokasi;
    private boolean aktif;

    public PerangkatIoT(String idPerangkat, String nama) {
        this(idPerangkat, nama, "Belum ditentukan");
    }

    public PerangkatIoT(String idPerangkat, String nama, String lokasi) {
        this.idPerangkat = idPerangkat;
        this.nama = nama;
        this.lokasi = lokasi;
        this.aktif = false;
    }

    public String getIdPerangkat() {
        return idPerangkat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public void tampilkanInfo() {
        System.out.println("ID perangkat : " + this.idPerangkat);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Lokasi       : " + this.lokasi);
        System.out.println("Status       : " + (this.aktif ? "Aktif" : "Nonaktif"));
    }

    public abstract void evaluasiKondisi(double nilai);
}
