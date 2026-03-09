import java.util.ArrayList;
import java.util.Scanner;

public class MainAcecraft {

    static ArrayList<Acecraft> database = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n SISTEM PENYIMPANAN DATA AKUN ACECRAFT ");
            System.out.println("1. Tambah Data (Create)");
            System.out.println("2. Tampilkan Data (Read)");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data (Delete)");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;

                case 2:
                    tampilkanData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    System.out.println("Sistem Sudah Selesai, Sampai Jumpa.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    static void tambahData() {

        System.out.print("Masukkan UID: ");
        String uid = input.nextLine();

        System.out.print("Masukkan Username: ");
        String username = input.nextLine();

        System.out.print("Masukkan Level: ");
        int level = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Server: ");
        String server = input.nextLine();

        Acecraft akun = new Acecraft(uid, username, level, server);
        database.add(akun);

        System.out.println("Data Akun Sudah Dimasukkan.");
    }

    static void tampilkanData() {

        if (database.isEmpty()) {
            System.out.println("Data Akun Masih Kosong.");
        } else {
            System.out.println("\n DATA AKUN LAMA ACECRAFT TERSIMPAN ");
            for (Acecraft akun : database) {
                akun.tampilkanData();
            }
        }
    }

    static void updateData() {

        System.out.print("Masukkan UID Yang Ingin Diupdate: ");
        String uid = input.nextLine();

        for (Acecraft akun : database) {

            if (akun.getUid().equals(uid)) {

                System.out.print("Username baru: ");
                String username = input.nextLine();

                System.out.print("Level baru: ");
                int level = input.nextInt();
                input.nextLine();

                System.out.print("Server baru: ");
                String server = input.nextLine();

                akun.setUsername(username);
                akun.setLevel(level);
                akun.setServer(server);

                System.out.println("Data Akun Sudah Diupdate.");
                return;
            }
        }

        System.out.println("UID Not Exist.");
    }

    static void hapusData() {

        System.out.print("Masukkan UID yang ingin dihapus: ");
        String uid = input.nextLine();

        for (int i = 0; i < database.size(); i++) {

            if (database.get(i).getUid().equals(uid)) {

                database.remove(i);
                System.out.println("Data Akun Sudah Dihapus.");
                return;
            }
        }

        System.out.println("UID Not Exist.");
    }
}