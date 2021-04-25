public class Passagier extends Persoon{
    protected boolean ticket;
    protected int bagage;
    public Passagier(String naam, int leeftijd, String adres,boolean ticket,int bagage) {
        super(naam, leeftijd, adres);
        this.ticket = ticket;
        this.bagage = bagage;
    }

    public boolean isTicket() {
        return ticket;
    }

    public void setTicket(boolean ticket) {
        this.ticket = ticket;
    }

    public int getBagage() {
        return bagage;
    }

    public void setBagage(int bagage) {
        this.bagage = bagage;
    }

    @Override
    public String toString() {
        return "Passagier{" +
                "ticket=" + ticket +
                ", bagage=" + bagage +
                ", naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", adres='" + adres + '\'' +
                '}';
    }
}
