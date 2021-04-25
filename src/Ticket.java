public class Ticket {
    protected Passagier passagier;
    protected String vertrekpunt;
    protected String bestemming;
    protected String klasse;
    protected int maxGewicht;

    public Ticket(Passagier passagier, String vertrekpunt, String bestemming, String klasse) {
        this.passagier = passagier;
        this.vertrekpunt = vertrekpunt;
        this.bestemming = bestemming;
        this.klasse = klasse;
        this.maxGewicht= maxGewicht;
    }
}
