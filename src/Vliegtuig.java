import java.util.HashMap;

public class Vliegtuig {
    protected int vluchtnummer;
    protected String vertrekpunt;
    protected String bestemming;
    protected HashMap<Passagier, String> passergierlijst;
    protected Piloot piloot;


    public Vliegtuig(int vluchtnummer, String vertrekpunt, String bestemming, HashMap<Passagier,String> passergierlijst) {
        this.vluchtnummer=vluchtnummer;
        this.vertrekpunt = vertrekpunt;
        this.bestemming = bestemming;
        this.piloot = piloot;
        this.passergierlijst =new HashMap<>();
    }
    public void board(Passagier p, String zitplaats){
        passergierlijst.put(p, zitplaats);
    }
}
