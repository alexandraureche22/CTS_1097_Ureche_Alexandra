package cursuriOnline.singleton.main;

import cursuriOnline.singleton.Sesiune;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sesiune sesiune1 = Sesiune.getInstance();
        Sesiune sesiune12 = Sesiune.getInstance();
        System.out.println("egale?"+(sesiune12==sesiune1));

        sesiune12.incepeExamen("microeconomie");
        sesiune1.incepeExamen("bti");
        sesiune12.finalizeazaExamen();
        sesiune1.incepeExamen("bti");
        sesiune1.adaugaStudent("larisa");
        sesiune1.adaugaStudent("deni");
        sesiune1.afiseazaParticipanti();

    }
}
