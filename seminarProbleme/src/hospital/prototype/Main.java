package hospital.prototype;

public class Main {
    public static void main(String[] args) {
        Sablon s1 = new SablonAlergie();
        Sablon s2 = new SablonSange();
        s1.afiseazaRaport();
        s2.afiseazaRaport();
    }
}
