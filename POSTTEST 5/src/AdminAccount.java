public class AdminAccount extends Acecraft {
    private String adminCode;

    public AdminAccount(String uid, String username, int level, String server, String adminCode) {
        super(uid, username, level, server);
        this.adminCode = adminCode;
    }

    @Override
    public String getAccountType() {
        return "System Administrator";
    }

    @Override
    public void levelUp() {
        this.level += 10;
        System.out.println("Level Admin ditingkatkan secara instan ke: " + this.level);
    }

    @Override
    public void getWelcomeMessage() {
        System.out.println("Akses Root Diterima. Halo Admin " + username);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Admin ID : " + adminCode);
    }
}
