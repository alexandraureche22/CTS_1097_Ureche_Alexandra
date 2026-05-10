package zoo.singleton;

public interface ISetAlarma {
    void activeazaAlarma(String mesaj);
    void dezactiveazaAlarma();
    boolean esteActiva();
    String getMesajAlerta();
}
