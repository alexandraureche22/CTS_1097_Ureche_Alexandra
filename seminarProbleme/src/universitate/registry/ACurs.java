package universitate.registry;

public abstract class ACurs implements IModul{
    private String nume;
    private String descriere;
    private int id;

    public ACurs() {
    }

    public ACurs(String nume, String descriere, int id) {
        this.nume = nume;
        this.descriere = descriere;
        this.id=id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ACurs{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}
