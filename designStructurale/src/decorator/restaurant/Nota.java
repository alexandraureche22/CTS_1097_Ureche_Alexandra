package decorator.restaurant;

public class Nota implements INota{
    @Override
    public void printeazaNota() {
        System.out.println("Nota printata cu succes.");
    }
}
