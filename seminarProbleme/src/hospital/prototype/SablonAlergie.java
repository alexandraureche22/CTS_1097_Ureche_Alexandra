package hospital.prototype;

public class SablonAlergie extends Sablon{
    public SablonAlergie(String text, String recomandari, String doctor, String data) {
        super(text, recomandari, doctor, data);
    }

    public SablonAlergie() {
        super("hoiebfsdyubjkwgfuidyhkejgfuwe","edbfiewjbfkewj","asfuwbfjawb","sdfuw");
    }

    public SablonAlergie(SablonAlergie altul) {
        super(altul);
    }

    @Override
    public IRaport cloneaza() {
        return new SablonAlergie(this);
    }
}
