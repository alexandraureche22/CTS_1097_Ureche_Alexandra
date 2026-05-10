package combinatii.factoryMethodSton;

public abstract  class ArticolFactory {
    public abstract Articol creeaza(Tip tip, String model, double pret) throws Exception;
}
