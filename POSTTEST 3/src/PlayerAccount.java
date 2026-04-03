public class PlayerAccount extends Acecraft {
    private String rank;

    public PlayerAccount(String uid, String username, int level, String server, String rank) {
        super(uid, username, level, server);
        this.rank = rank;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Rank     : " + rank);
        System.out.println("Tipe     : Player");
    }
}
