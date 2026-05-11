package facade.spital;

import java.util.List;
import java.util.stream.Collectors;

public class Medic {
    private String nume;
    private List<Pacient> pacienti;

    public Medic(String nume, List<Pacient> pacienti) {
        this.nume = nume;
        this.pacienti = pacienti.stream().map(Pacient::new).collect(Collectors.toList());
    }
    public Medic(Medic altMedic) {
        this.nume = nume;
        this.pacienti = altMedic.pacienti.stream().map(Pacient::new).collect(Collectors.toList());
    }

    public String getNume() {
        return nume;
    }

    public List<Pacient> getPacienti() {
        return pacienti;
    }
    public boolean decideInternare(int numarPacient) {
        return this.pacienti.get(numarPacient).areStareGrava();
    }

}
