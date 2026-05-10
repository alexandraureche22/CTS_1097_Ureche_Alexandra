package zoo.builder;

import java.util.ArrayList;
import java.util.List;

public class DosarMedicalBuilder implements IDosarMedical {
    private String numeAnimal;
    private String specie;
    private double greutate;
    private String dataUltimControl;
    private List<String> vaccinuri;
    private List<String> alergii;
    private String dieta;
    private String numeIngrijitor;

    public DosarMedicalBuilder(String numeAnimal, String specie) {
        this.numeAnimal = numeAnimal;
        this.specie = specie;
        this.greutate = 0;
        this.dataUltimControl = "necunoscut";
        this.vaccinuri = new ArrayList<>();
        this.alergii = new ArrayList<>();
        this.dieta = "necunoscut";
        this.numeIngrijitor = "necunoscut";
    }

    public DosarMedicalBuilder setGreutate(double greutate) {
        this.greutate = greutate;
        return this;
    }

    public DosarMedicalBuilder setDataUltimControl(String dataUltimControl) {
        this.dataUltimControl = dataUltimControl;
        return this;
    }

    public DosarMedicalBuilder setVaccinuri(List<String> vaccinuri) {
        this.vaccinuri = vaccinuri;
        return this;
    }

    public DosarMedicalBuilder setAlergii(List<String> alergii) {
        this.alergii = alergii;
        return this;
    }

    public DosarMedicalBuilder setDieta(String dieta) {
        this.dieta = dieta;
        return this;
    }

    public DosarMedicalBuilder setNumeIngrijitor(String numeIngrijitor) {
        this.numeIngrijitor = numeIngrijitor;
        return this;
    }

    @Override
    public DosarMedical build() {
        return new DosarMedical(numeAnimal,specie, greutate,dataUltimControl,vaccinuri,alergii,dieta,numeIngrijitor);
    }
}
