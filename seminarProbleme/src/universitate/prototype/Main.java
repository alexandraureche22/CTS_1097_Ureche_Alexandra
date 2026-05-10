package universitate.prototype;

public class Main {
    public static void main(String[] args) {
        ASablon sablon1 = new Laborator();
        ASablon sablon2 = new Seminar();
        ASablon sablon3 = (ASablon) sablon1.cloneaza();
        System.out.println("egale?"+(sablon3==sablon1));
        sablon1.afiseazaMaterial();
        sablon1.setAutor("ureche");
        sablon1.setDisciplina("matematica");
        sablon1.afiseazaMaterial();
        sablon3.afiseazaMaterial();
    }
}
