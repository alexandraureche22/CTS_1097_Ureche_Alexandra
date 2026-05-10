package aperativ;

public class Italiana extends ABucatarieFactory{
    @Override
    public AFelPrincipal creeaza(String nume, boolean esteRece) {
        return new Paste(nume,esteRece);
    }

    @Override
    public AAperitiv creeaza(String nume, String ingrediente) {
        return new Bruschete(nume,ingrediente);
    }

    @Override
    public ADesert creeaza(String nume, String ingrediente, int calorii) {
        return new Tiramisu(nume,ingrediente,calorii);
    }
}
