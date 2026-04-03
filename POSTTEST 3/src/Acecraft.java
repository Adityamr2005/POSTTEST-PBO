public class Acecraft {
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

    // Getter dan Setter tetap sama...
    public String getUid() { return uid; }
    public String getUsername() { return username; }

    public void setUsername(String username) {
        if(username.isEmpty()) System.out.println("Username tidak boleh kosong");
        else this.username = username;
    }

    public void setLevel(int level) {
        if(level < 1) System.out.println("Level tidak boleh < 1");
        else this.level = level;
    }

    public void setServer(String server) {
        if(server.isEmpty()) System.out.println("Server tidak boleh kosong");
        else this.server = server;
    }

    public void tampilkanData() {
        System.out.println("UID      : " + uid);
        System.out.println("Username : " + username);
        System.out.println("Level    : " + level);
        System.out.println("Server   : " + server);
    }
}
