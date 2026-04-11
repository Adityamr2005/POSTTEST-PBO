import java.util.ArrayList;
import java.util.Scanner;

public class MainAcecraft {
    // Deklarasi global agar bisa diakses semua method dalam class ini
    static ArrayList<Acecraft> database = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM PENYIMPANAN DATA ACECRAFT ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Update Data (Overloading Demo)");
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
                acc.tampilkanData(); // Polymorphism Override
            }
        }
    }

    static void updateData() {
        System.out.print("\nMasukkan UID yang akan diupdate: ");
        String uid = input.nextLine();

        for(Acecraft akun : database) {
            if(akun.getUid().equals(uid)) {
                System.out.print("Username baru : "); akun.setUsername(input.nextLine());
                System.out.print("Level baru    : "); akun.setLevel(input.nextInt()); input.nextLine();

                System.out.println("Update Server dengan:");
                System.out.println("1. Nama Server (String)");
                System.out.println("2. Kode Region (Integer)");
                System.out.print("Pilih metode: ");
                int metode = input.nextInt(); input.nextLine();

                if (metode == 1) {
                    System.out.print("Masukkan nama server: ");
                    akun.setServer(input.nextLine()); // Memanggil setServer(String)
                } else {
                    System.out.print("Masukkan kode (1:Asia, 2:EU, 3:US): ");
                    int code = input.nextInt(); input.nextLine();
                    akun.setServer(code); // Memanggil setServer(int) -> Polymorphism Overloading
                }
                System.out.println("Data berhasil diupdate.");
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
