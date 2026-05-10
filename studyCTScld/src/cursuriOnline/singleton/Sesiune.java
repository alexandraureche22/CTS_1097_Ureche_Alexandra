package cursuriOnline.singleton;

import java.util.ArrayList;
import java.util.List;

public class Sesiune implements ISesiuneExamen{
    private List<String> studenti;
    private String examenCurent;
    private static Sesiune instance;

    private Sesiune() {
        this.studenti = new ArrayList<>();
        this.examenCurent = "necunoscut";
    }

    public static Sesiune getInstance(){
        if(instance==null){
            instance = new Sesiune();
        }
        return instance;
    }

    @Override
    public void incepeExamen(String numeExamen) {
        if(examenCurent == null){
            examenCurent = numeExamen;
            System.out.println("A inceput examenul la: "+numeExamen);
        }
        else System.out.println("Examenul este inceput.");
    }

    @Override
    public void adaugaStudent(String numeStudent) {
        studenti.add(numeStudent);
    }

    @Override
    public void finalizeazaExamen() {
        if(examenCurent != null){
            System.out.println("Examen finalizat.");
            examenCurent = null;
        }
        else System.out.println("Examenul nu este oprit.");

    }

    @Override
    public void afiseazaParticipanti() {
        System.out.println("Sesiune{" +
            "studenti=" + studenti +
                    '}');
    }
}
