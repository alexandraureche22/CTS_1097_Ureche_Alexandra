package zoo.singleton.main;

import zoo.singleton.Alarma;

public class Main {
    public static void main(String[] args) {
        Alarma alarma1 = Alarma.getInstance();
        Alarma alarma2 = Alarma.getInstance();
        System.out.println("Sunt egale?"+(alarma2==alarma1));
        Thread thread = new Thread(()->{
            Alarma alarma3 = Alarma.getInstance();
            System.out.println("alarma la fel?"+(alarma3==alarma2));
        });
        thread.start();
        alarma1.activeazaAlarma("a evadat leutu");
        alarma2.activeazaAlarma("a evadat elefantu");
        alarma1.esteActiva();
        alarma1.dezactiveazaAlarma();
        alarma2.activeazaAlarma("a evadat rock");
        alarma2.getMesajAlerta();

    }
}
