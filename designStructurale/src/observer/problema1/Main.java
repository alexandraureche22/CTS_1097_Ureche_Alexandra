package observer.problema1;

public class Main {
    static void main(String[] args) {
        Client c1 = new Client("alexandra");
        Banca banca = new Banca("transilvania");
        banca.adaugaObserver(c1);
        banca.trimiteOferta("super oferta!!! 20% reducere la card de credit!");
        banca.stergeObserver(c1);
    }
}
