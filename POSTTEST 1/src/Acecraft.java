public class Acecraft {

    private String Uid;
    private String Username;
    private int Level;
    private String Server;

    public Acecraft(String uid, String username, int level, String server) {
        this.Uid = uid;
        this.Username = username;
        this.Level = level;
        this.Server = server;
    }

    public String getUid() {
        return Uid;
    }

    public String getUsername() {
        return Username;
    }

    public int getLevel() {
        return Level;
    }

    public String getServer() {
        return Server;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public void setLevel(int level) {
        this.Level = level;
    }

    public void setServer(String server) {
        this.Server = server;
    }

    public void tampilkanData() {
        System.out.println("UID      : " + Uid);
        System.out.println("Username : " + Username);
        System.out.println("Level    : " + Level);
        System.out.println("Server   : " + Server);
    }
}
