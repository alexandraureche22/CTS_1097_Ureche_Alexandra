package zoo.builder;

import java.util.List;

public class DosarMedical {
    private String numeAnimal;
    private String specie;
    private double greutate;
    private String dataUltimControl;
    private List<String> vaccinuri;
    private List<String> alergii;
    private String dieta;
    private String numeIngrijitor;

    public DosarMedical(String numeAnimal, String specie, double greutate, String dataUltimControl, List<String> vaccinuri, List<String> alergii, String dieta, String numeIngrijitor) {
        this.numeAnimal = numeAnimal;
        this.specie = specie;
        this.greutate = greutate;
        this.dataUltimControl = dataUltimControl;
        this.vaccinuri = vaccinuri;
        this.alergii = alergii;
        this.dieta = dieta;
        this.numeIngrijitor = numeIngrijitor;
    }

    public String getNumeAnimal() {
        return numeAnimal;
    }

    public String getSpecie() {
        return specie;
    }

    public double getGreutate() {
        return greutate;
    }

    public String getDataUltimControl() {
        return dataUltimControl;
    }

    public List<String> getVaccinuri() {
        return vaccinuri;
    }

    public List<String> getAlergii() {
        return alergii;
    }

    public String getDieta() {
        return dieta;
    }

    public String getNumeIngrijitor() {
        return numeIngrijitor;
    }

    @Override
    public String toString() {
        return "DosarMedical{" +
                "numeAnimal='" + numeAnimal + '\'' +
                ", specie='" + specie + '\'' +
                ", greutate=" + greutate +
                ", dataUltimControl='" + dataUltimControl + '\'' +
                ", vaccinuri=" + vaccinuri +
                ", alergii=" + alergii +
                ", dieta='" + dieta + '\'' +
                ", numeIngrijitor='" + numeIngrijitor + '\'' +
                '}';
    }
}
