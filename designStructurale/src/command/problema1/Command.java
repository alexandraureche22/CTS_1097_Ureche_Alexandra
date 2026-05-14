package command.problema1;

public abstract class Command {
    private String adresa;
    private Sofer sofer;

    public Command(String adresa, Sofer sofer) {
        this.adresa = adresa;
        this.sofer = sofer;
    }

    public String getAdresa() {
        return adresa;
    }

    public Sofer getSofer() {
        return sofer;
    }
    public abstract void executa();
    public abstract void undo();
    public abstract void redo();
}
