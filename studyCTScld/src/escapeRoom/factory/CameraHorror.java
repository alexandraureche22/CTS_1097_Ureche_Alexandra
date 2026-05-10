package escapeRoom.factory;

public class CameraHorror implements ICameraEscape{
    private String nume;
    private int dificultate;
    private int timpRezolvare;
    private double pret;

    public CameraHorror(String nume, int dificultate, int timpRezolvare, double pret) {
        this.nume = nume;
        this.dificultate = dificultate;
        this.timpRezolvare = timpRezolvare;
        this.pret = pret;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getDificultate() {
        return dificultate;
    }

    @Override
    public int getTimpMaxim() {
        return timpRezolvare;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("CameraHorror{" +
                "nume='" + nume + '\'' +
                ", dificultate=" + dificultate +
                ", timpRezolvare=" + timpRezolvare +
                ", pret=" + pret +
                '}');

    }

}
