# Laporan Praktikum Pemrograman Berorientasi Objek
## Disusun Oleh

Nama: ADITYA MAHYUDI RAMADHAN
NIM: 2409106101
Kelas: C1'24
Judul Tema: Sistem Penyimpanan Data Akun UID Game Acecraft
Bahasa Pemrograman: Java
IDE: IntelliJ IDEA

## Deskripsi Program 
Program ini merupakan Sistem Penyimpanan Data Akun Game Acecraft yang 
dibuat menggunakan bahasa pemrograman Java dengan konsep Pemrograman Berorientasi Objek
(Object Oriented Programming / OOP).

Program mampu menyimpan dan mengelola data akun menggunakan struktur ArrayList.
Sistem menyediakan menu yang dapat digunakan berulang kali hingga pengguna memilih menu keluar.

Program ini memiliki fitur utama yaitu operasi CRUD:
Create → Menambahkan data akun
Read → Menampilkan seluruh data akun
Update → Mengubah data akun
Delete → Menghapus data akun

Data yang disimpan meliputi:
UID
Username
Level
Server

## Class
Class digunakan sebagai blueprint atau cetakan objek.

Pada program ini terdapat class:
Acecraft
MainAcecraft

## Object
Object merupakan instansi dari class.

Contoh pembuatan object pada program:
Acecraft akun = new Acecraft(uid, username, level, server);

Object tersebut kemudian disimpan ke dalam ArrayList sebagai database sementara.

## Encapsulation
Encapsulation diterapkan dengan membuat atribut class bersifat private dan diakses menggunakan getter dan setter.

Contoh atribut dalam class:
private String Uid;
private String Username;
private int Level;
private String Server;

## Penjelasan Class

## Class Acecraft
Class ini berfungsi sebagai model data akun game Acecraft.

## Atribut
1.UID
2.Username
3.Level
4.Server

## Constructor
Constructor digunakan untuk menginisialisasi data akun saat objek dibuat.
public Acecraft(String uid, String username, int level, String server)

## Method
-Getter
getUid()
getUsername()
getLevel()
getServer()

-Setter
setUsername()
setLevel()
setServer()

## Method tambahan
tampilkanData()

Method tampilkanData() digunakan untuk menampilkan informasi akun ke layar.

## Class MainAcecraft
Class ini berfungsi sebagai program utama yang menjalankan sistem.

Class ini menggunakan:
-ArrayList sebagai penyimpanan data
-Scanner untuk input dari pengguna
static ArrayList<Acecraft> database = new ArrayList<>();

## Fitur Program
1. Tambah Data (Create)
Menu ini digunakan untuk menambahkan data akun baru.

User akan diminta mengisi:
-UID
-Username
-Level
-Server
Data kemudian disimpan ke dalam ArrayList database

2. Tampilkan Data (Read)
Menu ini digunakan untuk menampilkan seluruh data akun yang telah disimpan.
Jika database kosong maka program akan menampilkan pesan:
Data Akun Masih Kosong

3. Update Data
Menu ini digunakan untuk memperbarui data akun berdasarkan UID.
User memasukkan UID yang ingin diubah lalu memasukkan data baru.

4. Hapus Data (Delete)
Menu ini digunakan untuk menghapus data akun berdasarkan UID.
Program akan mencari UID dalam ArrayList lalu menghapus data tersebut.

## Cara Menjalankan Program
1. Buka Project Program di IntelliJ IDEA
2. Jalankan File "MainAcecraft.Java"
3. File Program Siap Mencoba

## Kesimpulan
Program Sistem Penyimpanan Data Akun Acecraft berhasil dibuat menggunakan konsep Pemrograman Berorientasi Objek dengan bahasa Java.

Konsep yang digunakan antara lain:
-Class
-Object
-Encapsulation
-ArrayList sebagai penyimpanan data

Program juga mampu melakukan operasi CRUD (Create, Read, Update, Delete)
sehingga data akun dapat dikelola dengan baik.
