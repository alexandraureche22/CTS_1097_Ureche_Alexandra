package hotel.model.singleton;

import hotel.model.factory.ICamera;

public interface ISistemRezervari {
    void adaugaRezervare(String codRezervare, ICamera camera);
    void afiseazaRezervari();
}
