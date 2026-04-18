public class PlayerAccount extends Acecraft {
    private String rank;

    public PlayerAccount(String uid, String username, int level, String server, String rank) {
        super(uid, username, level, server);
        this.rank = rank;
    }

    @Override
    public String getAccountType() {
        return "Regular Player";
    }

    @Override
    public void levelUp() {
        this.level++;
        System.out.println("Selamat! Level Player naik menjadi: " + this.level);
    }

    @Override
    public void getWelcomeMessage() {
        System.out.println("Selamat datang, Pahlawan " + username + "!");
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Rank     : " + rank);
    }
}
