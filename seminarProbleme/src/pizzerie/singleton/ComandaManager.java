package pizzerie.singleton;

public interface ComandaManager {
    void adaugaPizza(Pizza p);
    void afiseazaComanda();
    double calculeazaPretTotal();
    void resetComanda();
}
