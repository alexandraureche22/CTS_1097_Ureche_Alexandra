package hospital.prototype;

public interface IRaport {
    IRaport cloneaza();
    void afiseazaRaport();
    void setNumeDoctor(String nume);
    void setData(String data);
}
