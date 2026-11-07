public class SensorSuhu extends PerangkatIoT implements BisaDipantau {
    private double suhuTerakhir;
    private double batasSuhu;

    public SensorSuhu(String id, String nama) {
        this(id, nama, "Belum ditentukan", 0.0, 30.0);
    }

    public SensorSuhu(String id, String nama, String lokasi,
                      double suhuAwal, double batasSuhu) {
        super(id, nama, lokasi);
        this.suhuTerakhir = suhuAwal;
        this.batasSuhu = batasSuhu;
    }

    public double getSuhuTerakhir() {
        return suhuTerakhir;
    }

    public void setSuhuTerakhir(double suhuTerakhir) {
        this.suhuTerakhir = suhuTerakhir;
    }

    public double getBatasSuhu() {
        return batasSuhu;
    }

    public void setBatasSuhu(double batasSuhu) {
        this.batasSuhu = batasSuhu;
    }

    @Override
    public String bacaStatus() {
        return "Sensor " + getNama() + " | Suhu: " + suhuTerakhir
                + " °C | Batas: " + batasSuhu + " °C";
    }

    @Override
    public void evaluasiKondisi(double suhu) {
        this.suhuTerakhir = suhu;
        System.out.println("Membaca suhu ruangan: " + suhu + " °C");
        if (suhu > batasSuhu) {
            setAktif(true);
            System.out.println("Peringatan: suhu melebihi batas! Status sensor aktif.");
        } else {
            setAktif(false);
            System.out.println("Suhu masih normal. Status peringatan nonaktif.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suhu terakhir: " + suhuTerakhir + " °C");
        System.out.println("Batas suhu   : " + batasSuhu + " °C");
    }
}
