import java.util.ArrayList;
import java.util.Scanner;

public class MainAcecraft {

    static ArrayList<Acecraft> database = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {

            System.out.println(" SISTEM PENYIMPANAN DATA AKUN GAME ACECRAFT ");
            System.out.println("1. Tambah Data (Create)");
            System.out.println("2. Tampilkan Data (Read)");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data (Delete)");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");

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
                    System.out.println("Sistem Program Sudah Selesai.");
                    break;

                default:
                    System.out.println("Menu Not Available.");
            }

        } while (pilihan != 5);

    }

    static void tambahData() {

        System.out.println("\n Tambah Data Akun ");

        System.out.print("Masukkan UID      : ");
        String uid = input.nextLine();

        System.out.print("Masukkan Username : ");
        String username = input.nextLine();

        System.out.print("Masukkan Level    : ");
        int level = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Server   : ");
        String server = input.nextLine();

        Acecraft akun = new Acecraft(uid, username, level, server);

        database.add(akun);

        System.out.println("Data Akun Sudah Ditambahkan.");

    }

    static void tampilkanData() {

        System.out.println("\n Data Akun Acecraft ");

        if(database.isEmpty()) {

            System.out.println("Data Akun masih kosong.");

        } else {

            for(Acecraft akun : database) {

                akun.tampilkanData();

            }

        }

    }

    static void updateData() {

        System.out.print("\nMasukkan UID Anda diupdate : ");
        String uid = input.nextLine();

        for(Acecraft akun : database) {

            if(akun.getUid().equals(uid)) {

                System.out.println("Data Ditemukan.");

                System.out.print("Username baru : ");
                String username = input.nextLine();

                System.out.print("Level baru : ");
                int level = input.nextInt();
                input.nextLine();

                System.out.print("Server baru : ");
                String server = input.nextLine();

                akun.setUsername(username);
                akun.setLevel(level);
                akun.setServer(server);

                System.out.println("Data Anda Sudah Diupdate.");
                return;
            }

        }

        System.out.println("UID Tidak Ditemukan.");

    }

    // DELETE
    static void hapusData() {

        System.out.print("\nMasukkan UID Anda dihapus : ");
        String uid = input.nextLine();

        for(int i = 0; i < database.size(); i++) {

            if(database.get(i).getUid().equals(uid)) {

                database.remove(i);

                System.out.println("Data Anda Sudah Dihapus.");

                return;

            }

        }

        System.out.println("UID Tidak Ditemukan.");

    }

}
