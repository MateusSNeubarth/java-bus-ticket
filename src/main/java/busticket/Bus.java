package busticket;

public class Bus {
    private int id;

    // Check if the card is valid
    public boolean validateCard(Ticket ticket) {
        // to do
        return true;
    }

    // Process the payment, subtracting credit score from the ticket
    public void paymentProcess(Ticket ticket, double price) {
        // to do
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public Bus(int id){
        this.id = id;
    }
}
