SMART HOME IoT SYSTEM

Responsi Akhir Praktikum Pemrograman Berorientasi Objek
Identitas Mahasiswa
- Nama: DAFFA FAIQ ARGANTA
- NIM: H1D025135
- Program Studi: Informatika
- Mata Kuliah: Praktikum Pemrograman Berorientasi Objek
- Tema: IoT (Internet of Things)
- Judul Proyek: Smart Home IoT System
- 
1. Deskripsi Program
Smart Home IoT System merupakan program simulasi rumah pintar (smart
home) menggunakan bahasa pemrograman Java. Program menggambarkan
penggunaan perangkat Internet of Things (IoT) untuk mengontrol dan
memantau kondisi rumah.

Sistem memiliki dua perangkat utama: 1. Lampu Pintar, untuk
menyalakan dan mematikan lampu serta mengatur tingkat kecerahan dan
warna. 2. Sensor Suhu, untuk membaca suhu ruangan dan memberikan
peringatan apabila suhu melebihi batas yang ditentukan.

Program menerapkan konsep Pemrograman Berorientasi Objek sesuai sepuluh
persyaratan teknis pada lembar penugasan responsi akhir.

2. Fitur Program
- Menghidupkan dan mematikan lampu pintar.
- Mengatur tingkat kecerahan lampu dalam rentang 0--100%.
- Menyimpan informasi warna dan lokasi perangkat.
- Membaca suhu ruangan melalui sensor.
- Membandingkan suhu dengan batas suhu yang ditentukan.
- Menampilkan peringatan ketika suhu melebihi batas.
- Mengatur lampu otomatis berdasarkan intensitas cahaya:
  - Jika cahaya kurang dari 100 lux, lampu dinyalakan dan kecerahan
    diatur menjadi 100%.
  - Jika cahaya 100 lux atau lebih, lampu dimatikan.
- Menampilkan informasi dan status setiap perangkat.
- 
3. Struktur File
  Nama File                           Keterangan
  PerangkatIoT.java                 Abstract superclass yang menyimpan
identitas, lokasi, dan status umum
perangkat IoT.

  LampuPintar.java                  Subclass lampu pintar yang
mengimplementasikan
BisaDikendalikan dan
BisaDipantau.

  SensorSuhu.java                   Subclass sensor suhu untuk memantau
kondisi suhu ruangan.

  BisaDikendalikan.java             Interface untuk perilaku menyalakan
dan mematikan perangkat.

  BisaDipantau.java                 Interface untuk membaca status
perangkat.
Main.java                         Class utama untuk membuat objek dan
menjalankan pengujian.

4. Penerapan 10 Persyaratan Teknis PBO
1. State dan Behavior
State ditunjukkan melalui atribut objek, seperti nama, lokasi, status
aktif, tingkat kecerahan, warna lampu, dan suhu terakhir. Behavior
ditunjukkan melalui method prosedur seperti nyalakan() dan
matikan(), serta method fungsi bacaStatus() yang mengembalikan
String.

3. Immutability
Konstanta global public static final String NAMA_SISTEM terdapat pada
class PerangkatIoT. Atribut instans kekal
private final String idPerangkat ditentukan melalui konstruktor dan
tidak memiliki setter.

5. Enkapsulasi dan Overloading
Atribut pada setiap class menggunakan akses private. Atribut yang
dapat diubah disediakan getter dan setter. Program menggunakan keyword
this. Overloading konstruktor diterapkan melalui beberapa variasi
parameter pada class PerangkatIoT, LampuPintar, dan SensorSuhu.

7. Inheritance
Class LampuPintar dan SensorSuhu merupakan subclass yang mewarisi
PerangkatIoT menggunakan keyword extends. Class Main dipisahkan
dari class perangkat dan interface.

9. Super Chaining
Konstruktor subclass memanggil konstruktor superclass menggunakan
super(...). Method tampilkanInfo() pada subclass juga memanggil
method superclass menggunakan super.tampilkanInfo().

11. Method Overriding
Subclass mengimplementasikan ulang method superclass maupun interface
dengan anotasi @Override, seperti evaluasiKondisi(),
tampilkanInfo(), bacaStatus(), nyalakan(), dan matikan().

13. Abstract Class
PerangkatIoT dideklarasikan sebagai abstract class dan memiliki
abstract method evaluasiKondisi(double nilai) yang wajib
diimplementasikan subclass konkret.

15. Logika State dan Percabangan
Method evaluasiKondisi() pada LampuPintar dan SensorSuhu
menggunakan if/else. Pada lampu, intensitas cahaya menentukan apakah
lampu dinyalakan atau dimatikan. Pada sensor, suhu menentukan status
peringatan perangkat.

17. Polimorfisme Interface
Program menggunakan variabel referensi bertipe interface untuk merujuk
objek subclass:
BisaDikendalikan kontrolLampu = lampu;
BisaDipantau pemantauLampu = lampu;
BisaDipantau pemantauSensor = sensor;
Pemanggilan method melalui variabel interface menjalankan implementasi
dari objek yang dirujuk.

19. Multiple Interface
Class LampuPintar mengimplementasikan dua interface sekaligus, yaitu
BisaDikendalikan dan BisaDipantau:
public class LampuPintar extends PerangkatIoT
        implements BisaDikendalikan, BisaDipantau
    
5. Cara Compile dan Menjalankan Program
Persyaratan
- Java Development Kit (JDK) telah terpasang.
- Terminal atau Command Prompt.
- Seluruh file .java berada dalam satu folder.
  
Langkah menjalankan
1. Buka terminal pada folder proyek yang berisi seluruh file Java.
2. Kompilasi seluruh file:
javac *.java
3. Jalankan program:
java Main
Jika kompilasi berhasil, program menampilkan simulasi kontrol lampu,
pemantauan suhu, otomatisasi lampu, dan informasi perangkat.
6. Skenario Pengujian
Class Main menjalankan skenario berikut: 1. Membuat objek
LampuPintar dan SensorSuhu. 2. Menyalakan dan mematikan lampu
melalui interface BisaDikendalikan. 3. Membaca status lampu dan sensor
melalui interface BisaDipantau. 4. Menguji sensor dengan suhu 32,5 °C
ketika batas suhu 30 °C sehingga sistem menampilkan peringatan. 5.
Menguji otomatisasi lampu dengan intensitas cahaya 45 lux sehingga lampu
menyala. 6. Menguji otomatisasi lampu dengan intensitas cahaya 250 lux
sehingga lampu mati. 7. Menampilkan informasi lengkap masing-masing
perangkat.
7. Screenshot Output Program
Setelah program dijalankan melalui terminal, ambil screenshot yang
memperlihatkan perintah java Main dan hasil keluarannya. Simpan gambar
ke folder screenshots dengan nama output-program.png, kemudian
tampilkan menggunakan:
