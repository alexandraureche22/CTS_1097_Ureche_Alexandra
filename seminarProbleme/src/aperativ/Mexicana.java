package aperativ;

public class Mexicana extends ABucatarieFactory{
    @Override
    public AFelPrincipal creeaza(String nume, boolean esteRece) {
        return new Taco(nume, esteRece);
    }

    @Override
    public AAperitiv creeaza(String nume, String ingrediente) {
        return new Nacho(nume, ingrediente);
    }

    @Override
    public ADesert creeaza(String nume, String ingrediente, int calorii) {
        return new Churros(nume, ingrediente, calorii);
    }
}
