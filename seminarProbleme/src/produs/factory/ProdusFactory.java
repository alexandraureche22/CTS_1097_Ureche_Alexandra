package produs.factory;

public class ProdusFactory {
    public static ProdusGeneric creeaza(String tip, String nume, double pret, int stoc, String categorie) throws Exception {
        switch (tip){
            case "bio":return new ProdusBio(nume, pret, stoc, categorie);
            case "perisabil":return new ProdusPerisabil(nume, pret, stoc, categorie);
            case "electronic":return new ProdusElectronic(nume, pret, stoc, categorie);
            default:throw new Exception("tip invalid");
        }
    }
}
