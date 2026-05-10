package combinatii2.factoryMethod;

public abstract class ComponentaFactory {
    public abstract  Stocare creeaza(Tip tip, String nume, double pret) throws Exception;
}
