package command.problema1;

public class Main {
    static void main(String[] args) {
        Sofer sofer = new Sofer("anaboss");

        Command c1 =  new CommandLivrare("str 10",sofer);
        Command c2 =  new CommandLivrare("str 11",sofer);
        Command c3 =  new CommandLivrare("str 12",sofer);

        Operator operator = new Operator();
        operator.adaugaComanda(c1);
        operator.adaugaComanda(c2);
        operator.adaugaComanda(c3);
        operator.trimiteComanda();
        operator.trimiteComanda();
        operator.trimiteComanda();
        operator.anuleazaComanda();

    }
}
