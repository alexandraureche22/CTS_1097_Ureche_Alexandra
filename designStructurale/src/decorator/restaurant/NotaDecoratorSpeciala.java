package decorator.restaurant;

public class NotaDecoratorSpeciala extends NotaDecorator{
    @Override
    public void printeazaNota() {
        super.printeazaNota();
        System.out.println("La multi ani!");
    }

    public NotaDecoratorSpeciala(INota nota) {
        super(nota);
    }
}
