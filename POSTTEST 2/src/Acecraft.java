public class Acecraft {
    private String uid;
    private String username;

    protected int level;

    String server;

    public Acecraft(String uid, String username, int level, String server) {
        this.uid = uid;
        this.username = username;
        this.level = level;
        this.server = server;
    }

    public String getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    public String getServer() {
        return server;
    }

    public void setUsername(String username) {

        if(username.isEmpty()){
            System.out.println("Username Anda Tidak Boleh Kosong");
        } else {
            this.username = username;
        }

    }

    public void setLevel(int level) {

        if(level < 1){
            System.out.println("Level Tidak Boleh Kurang Dari 1");
        } else {
            this.level = level;
        }

    }

    public void setServer(String server) {

        if(server.isEmpty()){
            System.out.println("Server tidak boleh kosong");
        } else {
            this.server = server;
        }
    }

    public void tampilkanData() {
        System.out.println("UID      : " + uid);
        System.out.println("Username : " + username);
        System.out.println("Level    : " + level);
        System.out.println("Server   : " + server);
    }

}
