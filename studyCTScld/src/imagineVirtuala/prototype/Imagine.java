package imagineVirtuala.prototype;

import java.util.ArrayList;
import java.util.List;

public class Imagine implements ImagineVirtuala{
    private String nume;
    private List<Calculator> calculatoare;

    public Imagine(String nume, List<Calculator> calculatoare) {
        this.nume = nume;
        this.calculatoare = calculatoare;
    }

    public Imagine(Imagine altaImagine) throws CloneNotSupportedException {
        this.nume = altaImagine.nume;
        List<Calculator> calculatorCopie = new ArrayList<>();
        for(Calculator c: altaImagine.calculatoare){
            calculatorCopie.add((Calculator) c.clone());
        }
        this.calculatoare=calculatorCopie;
    }

    public List<Calculator> getCalculatoare() {
        return calculatoare;
    }

    @Override
    public ImagineVirtuala cloneazaImagine() {
        try {
            return new Imagine(this);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void afisareConfiguratie() {
        System.out.println("Imagine{" +
                "nume='" + nume + '\'' +
                ", calculatoare=" + calculatoare +
                '}');
    }
}
