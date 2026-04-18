import java.util.ArrayList;
import java.util.Scanner;

public class MainAcecraft {
    static ArrayList<Acecraft> database = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM DATA ACECRAFT (ABSTRACT & INTERFACE) ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data & Welcome Message");
            System.out.println("3. Update Data & Level Up");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: tambahData(); break;
                case 2: tampilkanData(); break;
                case 3: updateData(); break;
                case 4: hapusData(); break;
                case 5: System.out.println("Selesai."); break;
                default: System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.println("\nPilih Tipe Akun:");
        System.out.println("1. Player Account");
        System.out.println("2. Admin Account");
        System.out.print("Pilihan: ");
        int tipe = input.nextInt(); input.nextLine();

        System.out.print("Masukkan UID      : "); String uid = input.nextLine();
        System.out.print("Masukkan Username : "); String user = input.nextLine();
        System.out.print("Masukkan Level    : "); int lvl = input.nextInt(); input.nextLine();
        System.out.print("Masukkan Server   : "); String srv = input.nextLine();

        if (tipe == 1) {
            System.out.print("Masukkan Rank     : "); String rank = input.nextLine();
            database.add(new PlayerAccount(uid, user, lvl, srv, rank));
        } else {
            System.out.print("Masukkan Kode Admin: "); String code = input.nextLine();
            database.add(new AdminAccount(uid, user, lvl, srv, code));
        }
        System.out.println("Data berhasil ditambahkan!");
    }

    static void tampilkanData() {
        if(database.isEmpty()) {
            System.out.println("Data kosong.");
        } else {
            for(Acecraft acc : database) {
                System.out.println("-----------------------");
                acc.getWelcomeMessage();
                acc.tampilkanData();
            }
        }
    }

    static void updateData() {
        System.out.print("\nMasukkan UID yang akan diupdate: ");
        String uid = input.nextLine();

        for(Acecraft akun : database) {
            if(akun.getUid().equals(uid)) {
                System.out.println("1. Update Username/Server");
                System.out.println("2. Gunakan Fitur Level Up (Interface)");
                System.out.print("Pilihan: ");
                int opt = input.nextInt(); input.nextLine();

                if(opt == 1) {
                    System.out.print("Username baru : "); akun.setUsername(input.nextLine());
                    System.out.print("Masukkan kode server (1:Asia, 2:EU, 3:US): ");
                    akun.setServer(input.nextInt()); input.nextLine();
                } else {
                    akun.levelUp();
                }
                return;
            }
        }
        System.out.println("UID tidak ditemukan.");
    }

    static void hapusData() {
        System.out.print("\nMasukkan UID yang akan dihapus: ");
        String uid = input.nextLine();
        database.removeIf(akun -> akun.getUid().equals(uid));
        System.out.println("Proses hapus selesai.");
    }
}