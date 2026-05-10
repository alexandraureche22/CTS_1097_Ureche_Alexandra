package decorator.restaurant;


public class Main {
    static void main() {
        INota nota1 = new Nota();
        nota1.printeazaNota();
        INota nota2 = new NotaDecoratorSpeciala(nota1);
        nota2.printeazaNota();
    }


}
