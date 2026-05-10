package decorator.restaurant;

public abstract class NotaDecorator implements INota{
    private INota nota;

    public NotaDecorator(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaNota() {
        this.nota.printeazaNota();
    }
}
