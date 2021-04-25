public class Piloot extends Personeelslid{
    protected boolean flightcheck;

    public Piloot(String naam, int leeftijd, String adres, boolean flightcheck) {
        super(naam, leeftijd, adres);
        this.flightcheck = flightcheck;
    }

    public boolean isFlightcheck() {
        return flightcheck;
    }

    public void setFlightcheck(boolean flightcheck) {
        this.flightcheck = flightcheck;
    }

    @Override
    public String toString() {
        return "Piloot{" +
                "flightcheck=" + flightcheck +
                ", naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", adres='" + adres + '\'' +
                '}';
    }
}
