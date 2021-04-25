public class Main {
    public static void main(String[] args) {
        Persoon rogier = new Passagier("Rogier", 23, "Zennestraat 22", true, 23);
        Persoon pablo = new Passagier("Pablo", 33, "Priemstraat 21", true, 30);


        System.out.println(rogier.toString());
    }
}
