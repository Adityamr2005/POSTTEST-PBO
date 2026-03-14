## Laporan Praktikum Pemrograman Berorientasi Objek (Posttest 2)
## Disusun Oleh
# Nama: Aditya Mahyudi Ramadhan
# NIM: 2409106101
# Kelas: C1'24

# Deskripsi Program
Program ini adalah sistem Manajemen Basis Data (CRUD) sederhana berbasis CLI (Command Line Interface)
yang dirancang untuk menyimpan informasi akun game bernama Acecraft. 
Program ini menerapkan prinsip dasar Pemrograman Berorientasi Objek (OOP) menggunakan bahasa pemrograman Java.

Fungsi utama program meliputi:
Create: Menambahkan data akun baru (UID, Username, Level, dan Server).
Read: Menampilkan seluruh daftar akun yang tersimpan dalam sistem.
Update: Memperbarui data akun berdasarkan UID yang dicari.
Delete: Menghapus data akun dari sistem berdasarkan UID.

# Struktur Class
Program ini terdiri dari dua class utama:

1. Class Acecraft (Model)
Berperan sebagai blueprint (kerangka) dari objek akun.

- Encapsulation: Menggunakan modifier akses private, protected, dan default pada atribut.
- Constructor: Untuk inisialisasi objek saat pertama kali dibuat.
- Getter & Setter: Digunakan untuk mengakses dan mengubah data, lengkap dengan validasi (seperti pengecekan input kosong atau level di bawah 1).
- Method tampilkanData(): Untuk mencetak atribut objek ke konsol.

2. Class MainAcecraft (Controller)
Berperan sebagai pengatur alur jalannya program.

- ArrayList: Menggunakan ArrayList<Acecraft> sebagai database sementara di dalam memori.
- Menu Loop: Menggunakan do-while dan switch-case untuk navigasi fitur pengguna.
- Logic CRUD: Berisi method statis tambahData(), tampilkanData(), updateData(), dan hapusData().

# Konsep PBO Diterapkan

Class & Object: Class Acecraft didefinisikan sebagai blueprint, dan objeknya dibuat pada method tambahData().
Encapsulation:	Penggunaan private field uid dan username yang hanya bisa diakses via getter/setter.
Data Validation:	Setter pada (Acecraft.java) memastikan data tidak kosong sebelum disimpan.
Collection Framework:	Penggunaan ArrayList untuk manajemen data yang dinamis (bisa bertambah/berkurang).

# Kesimpulan
- Penerapan CRUD Berbasis Objek: Program mampu menjalankan fungsi fundamental
  manajemen data yang meliputi Create (menambah akun), Read (menampilkan daftar),
  Update (mengubah data berdasarkan UID), dan Delete (menghapus data).

- Implementasi Encapsulation: Penggunaan akses modifier private pada atribut seperti
  uid dan username dalam class Acecraft menunjukkan penerapan enkapsulasi yang baik,
  di mana data hanya dapat diakses atau diubah melalui method getter dan setter.

- Validasi Data pada Setter: Program tidak hanya menyimpan data,
  tetapi juga melakukan validasi sederhana di dalam class Acecraft,
  seperti memastikan username dan server tidak kosong serta level tidak kurang dari 1 sebelum data tersebut diproses.

- Manajemen Data Dinamis: Penggunaan ArrayList<Acecraft> pada class MainAcecraft memungkinkan penyimpanan data
  dalam jumlah banyak tanpa harus menentukan ukuran array di awal,
  memberikan fleksibilitas saat menambah atau menghapus akun.

- Interaksi User yang Terstruktur: Alur program dikelola dengan baik menggunakan struktur kontrol do-while dan switch-case,
  sehingga memberikan pengalaman pengguna yang intuitif melalui menu navigasi yang tersedia.
