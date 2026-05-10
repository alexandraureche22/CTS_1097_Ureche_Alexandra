package universitate.prototype;

public class Laborator extends ASablon {
    public Laborator(String detalii, String instructiuni, String autor, String disciplina) {
        super(detalii, instructiuni, autor, disciplina);
    }

    public Laborator() {
        super("necunoscute","necunoscute","necunoscut","necunoscuta");
    }
    public Laborator(Laborator altul) {
        super(altul);
    }

    @Override
    public void afiseazaMaterial() {
        System.out.println("Laborator: "+super.toString());

    }

    @Override
    public IMaterial cloneaza() {
        return new Laborator(this);
    }
}
