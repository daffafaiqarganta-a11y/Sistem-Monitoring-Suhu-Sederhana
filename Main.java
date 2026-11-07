public class Main {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("       " + PerangkatIoT.NAMA_SISTEM);
        System.out.println("======================================");
        System.out.println("Nama  : DAFFA FAIQ ARGANTA");
        System.out.println("NIM   : H1D025135");
        System.out.println("Tema  : IoT - Smart Home");
        System.out.println();

        // Membuat objek dari dua subclass dengan konstruktor yang tersedia.
        LampuPintar lampu = new LampuPintar(
                "LMP001", "Lampu Ruang Tamu", "Ruang Tamu", 70, "Warm White");
        SensorSuhu sensor = new SensorSuhu(
                "SNS001", "Sensor Suhu", "Ruang Keluarga", 27.5, 30.0);

        // Polimorfisme melalui variabel referensi bertipe interface.
        BisaDikendalikan kontrolLampu = lampu;
        BisaDipantau pemantauLampu = lampu;
        BisaDipantau pemantauSensor = sensor;

        System.out.println("--- 1. Kontrol Perangkat ---");
        kontrolLampu.nyalakan();
        System.out.println(pemantauLampu.bacaStatus());
        kontrolLampu.matikan();
        System.out.println();

        System.out.println("--- 2. Pemantauan Sensor Suhu ---");
        System.out.println(pemantauSensor.bacaStatus());
        sensor.evaluasiKondisi(32.5);
        System.out.println(pemantauSensor.bacaStatus());
        System.out.println();

        System.out.println("--- 3. Otomatisasi Lampu ---");
        lampu.evaluasiKondisi(45);
        System.out.println(pemantauLampu.bacaStatus());
        lampu.evaluasiKondisi(250);
        System.out.println(pemantauLampu.bacaStatus());
        System.out.println();

        System.out.println("--- 4. Informasi Perangkat ---");
        System.out.println("[Lampu Pintar]");
        lampu.tampilkanInfo();
        System.out.println();
        System.out.println("[Sensor Suhu]");
        sensor.tampilkanInfo();

        System.out.println();
        System.out.println("Pengujian Smart Home IoT selesai.");
    }
}
