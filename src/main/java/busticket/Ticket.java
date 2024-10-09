package busticket;

public class Ticket {
    private int id;
    private double credit;
    private String createdAt;
    private String user;

    public void addCredit(double value) {
        // to do
    }

    //Getters
    public int getId() { return this.id; }
    public double getCredit() { return this.credit; }
    public String getCreatedAt() { return this.createdAt; }
    public String getUser() { return this.user; }

    public Ticket(int _id, String _user, String _createdAt) {
        this.id = _id;
        this.user = _user;
        this.createdAt = _createdAt;
        this.credit = 0.0;
    }
}
