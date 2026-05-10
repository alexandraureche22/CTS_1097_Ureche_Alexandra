package fisaMedicala;

public class Main {
    public static void main(String[] args) {
        AFisaFactory a1 = new Cardiologie();
        AFisaFactory a2 = new Pneumologie();
        AFisaFactory a3 = new Neurologie();

        FisaPacient f1 = a1.creeaza("1","ureche","pastile");
        FisaDoctor f2 = a1.creeaza("1","ureche","pastile","tuseste ");

        FisaPacient f3 = a2.creeaza("2","alex","sirop tuse");
        FisaDoctor f4 = a2.creeaza("3","deni","sirop si pastile","ciudat");

        f1.afiseazaDetalii();
        f2.afiseazaDetalii();
        f3.afiseazaDetalii();
        f4.afiseazaDetalii();


    }
}
