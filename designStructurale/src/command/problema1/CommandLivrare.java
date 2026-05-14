package command.problema1;

public class CommandLivrare extends Command{
    public CommandLivrare(String adresa, Sofer sofer) {
        super(adresa, sofer);
    }

    @Override
    public void executa() {
        System.out.println("Comanda pentru adresa: "+super.getAdresa());
        super.getSofer().livreaza();
    }

    @Override
    public void undo() {
        System.out.println("Se anuleaza comanda de la adresa: "+super.getAdresa());
        super.getSofer().anuleazaLivrarea();

    }

    @Override
    public void redo() {
        System.out.println("Comanda pentru adresa:"+super.getAdresa());
        super.getSofer().refaceLivrare();

    }
}
