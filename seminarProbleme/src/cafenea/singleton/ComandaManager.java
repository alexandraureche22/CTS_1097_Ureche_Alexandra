package cafenea.singleton;

import cafenea.singleton.Bautura;

public interface ComandaManager {
    void adaugaBautura(Bautura b);
    void afiseazaComanda();
    double calculeazaPretTotal();
    void resetComanda();
}
