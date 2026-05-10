package hospital.prototype;

public class SablonSange extends Sablon{
    public SablonSange(String text, String recomandari, String doctor, String data) {
        super(text, recomandari, doctor, data);
    }

    public SablonSange(SablonSange altul) {
        super(altul);
    }
    public SablonSange() {
        super("hoiebfsdyubjkwgfuidyhkejgfuwe","edbfiewjbfkewj","asfuwbfjawb","sdfuw");
    }

    @Override
    public IRaport cloneaza() {
        return new SablonSange(this);
    }
}
