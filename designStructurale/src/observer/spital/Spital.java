package observer.spital;

public class Spital extends Subject {
    private String spital;

    public Spital(String spital) {
        super();
        this.spital = spital;
    }

    @Override
    public void notifyObserver(String numeVirus) {
        super.notifyObserver("E un virus nou in oras"+numeVirus);
    }
}
