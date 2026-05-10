package universitate.prototype;

public class Seminar extends ASablon {
    public Seminar(String detalii, String instructiuni, String autor, String disciplina) {
        super(detalii, instructiuni, autor, disciplina);
    }

    public Seminar() {
        super("necunoscute","necunoscute","necunoscut","necunoscuta");
    }
    public Seminar(Seminar altul) {
        super(altul);
    }

    @Override
    public void afiseazaMaterial() {
        System.out.println("Seminar: "+super.toString());

    }

    @Override
    public IMaterial cloneaza() {
        return new Seminar(this);
    }
}
