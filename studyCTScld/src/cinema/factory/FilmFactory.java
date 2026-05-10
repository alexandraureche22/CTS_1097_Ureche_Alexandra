package cinema.factory;

public class FilmFactory {
    public static Proiectie creeaza(String tip, String titlu, int durata, double pret) throws Exception {
        switch (tip){
            case "Film2d":return new Film2d(titlu, durata, pret);
            case "Film3d":return new Film3d(titlu, durata, pret);
            case "Filmimax":return new Filmimax(titlu, durata, pret);
            default: throw new Exception("tip invalid");
        }
    }
}
