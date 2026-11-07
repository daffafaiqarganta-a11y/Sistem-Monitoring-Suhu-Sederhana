# Smart Home IoT System - Responsi Akhir PBO

## Identitas
- Nama: DAFFA FAIQ ARGANTA
- NIM: H1D025135
- Mata kuliah: Praktikum Pemrograman Berorientasi Objek
- Tema berdasarkan digit terakhir NIM (5): **IoT**
- Judul proyek: **Smart Home IoT System**

## Deskripsi
Program simulasi rumah pintar berbasis Java. Sistem memiliki perangkat lampu pintar untuk mengatur pencahayaan dan sensor suhu untuk memantau kondisi ruangan. Program dijalankan melalui terminal dan menampilkan hasil kontrol serta evaluasi kondisi perangkat.

## Struktur file
- `PerangkatIoT.java`: superclass abstract yang menyimpan identitas dan state perangkat.
- `LampuPintar.java`: subclass untuk kontrol lampu; mengimplementasikan dua interface.
- `SensorSuhu.java`: subclass untuk pemantauan suhu.
- `BisaDikendalikan.java`: interface untuk perangkat yang dapat dinyalakan/dimatikan.
- `BisaDipantau.java`: interface untuk perangkat yang statusnya dapat dibaca.
- `Main.java`: titik awal program dan tempat pengujian.

## Cara compile dan menjalankan
Pastikan JDK sudah terpasang. Buka terminal pada folder yang berisi semua file `.java`, kemudian jalankan:

```bash
javac *.java
java Main
```

## Sepuluh persyaratan PBO yang diterapkan
1. **State dan Behavior**: atribut menyimpan state perangkat; terdapat prosedur `nyalakan()`/`matikan()` dan fungsi `bacaStatus()` yang mengembalikan `String`.
2. **Immutability**: konstanta global `public static final NAMA_SISTEM` dan atribut instans kekal `private final idPerangkat`.
3. **Enkapsulasi dan Overloading**: atribut dibuat `private`; tersedia getter/setter untuk atribut yang dapat diubah; penggunaan `this`; konstruktor dengan variasi parameter pada superclass dan subclass. `idPerangkat` sengaja tidak memiliki setter karena bersifat final.
4. **Inheritance**: `LampuPintar` dan `SensorSuhu` mewarisi `PerangkatIoT`; `Main` dipisahkan.
5. **Super Chaining**: konstruktor subclass memanggil `super(...)`; method `tampilkanInfo()` pada subclass memanggil `super.tampilkanInfo()`.
6. **Method Overriding**: method `evaluasiKondisi()`, `tampilkanInfo()`, serta method interface ditimpa dengan `@Override`.
7. **Abstract Class**: `PerangkatIoT` merupakan abstract class dan memiliki abstract method `evaluasiKondisi(double nilai)`.
8. **Logika State Percabangan**: implementasi `evaluasiKondisi()` pada kedua subclass memakai `if/else` untuk membaca nilai dan mengubah state internal.
9. **Polimorfisme Interface**: `BisaDikendalikan kontrolLampu = lampu;` dan `BisaDipantau pemantauSensor = sensor;`.
10. **Multiple Interface**: `LampuPintar extends PerangkatIoT implements BisaDikendalikan, BisaDipantau`.

## Catatan screenshot
Setelah program berhasil dijalankan, ambil screenshot terminal yang menampilkan perintah `java Main` dan hasil keluarannya. Masukkan screenshot tersebut ke repositori dan tambahkan di bagian ini, misalnya:

```markdown
![Output program](screenshots/output-program.png)
```

## Pengumpulan GitHub
1. Buat repositori GitHub baru, misalnya `Responsi-Akhir-PBO-Smart-Home-IoT`.
2. Unggah seluruh file `.java` dan `README.md`.
3. Tambahkan screenshot output program ke folder `screenshots`.
4. Pastikan repositori dapat diakses oleh dosen/asisten sesuai ketentuan kelas.
