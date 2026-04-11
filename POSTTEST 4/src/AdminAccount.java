public class AdminAccount extends Acecraft {
    private String adminCode;

    public AdminAccount(String uid, String username, int level, String server, String adminCode) {
        super(uid, username, level, server);
        this.adminCode = adminCode;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Admin ID : " + adminCode);
        System.out.println("Tipe     : Administrator");
    }
}