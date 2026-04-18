public abstract class Acecraft implements AccountOperations {
    protected String uid;
    protected String username;
    protected int level;
    protected String server;

    public Acecraft(String uid, String username, int level, String server) {
        this.uid = uid;
        this.username = username;
        this.level = level;
        this.server = server;
    }

    public abstract String getAccountType();
    public String getUid() { return uid; }
    public String getUsername() { return username; }

    public void setServer(String server) {
        if(server.isEmpty()) System.out.println("Server tidak boleh kosong");
        else this.server = server;
    }

    public void setServer(int regionCode) {
        if (regionCode == 1) this.server = "Asia";
        else if (regionCode == 2) this.server = "Europe";
        else if (regionCode == 3) this.server = "America";
        else System.out.println("Kode region tidak valid.");
    }

    public void setUsername(String username) {
        if(username.isEmpty()) System.out.println("Username tidak boleh kosong");
        else this.username = username;
    }

    public void setLevel(int level) {
        if(level < 1) System.out.println("Level tidak boleh < 1");
        else this.level = level;
    }

    public void tampilkanData() {
        System.out.println("Tipe Akun: " + getAccountType());
        System.out.println("UID      : " + uid);
        System.out.println("Username : " + username);
        System.out.println("Level    : " + level);
        System.out.println("Server   : " + server);
    }
}