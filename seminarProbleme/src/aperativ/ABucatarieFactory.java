package aperativ;

public abstract class ABucatarieFactory {
    public abstract AFelPrincipal creeaza(String nume, boolean esteRece);
    public abstract AAperitiv creeaza(String nume, String ingrediente);
    public  abstract ADesert creeaza(String nume, String ingrediente, int calorii);
}
