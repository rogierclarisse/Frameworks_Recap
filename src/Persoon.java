public abstract class Persoon {
    protected String naam;
    protected int leeftijd;
    protected String adres;

    public Persoon(String naam, int leeftijd, String adres) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", adres='" + adres + '\'' +
                '}';
    }
}
