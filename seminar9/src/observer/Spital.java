package observer;

public class Spital extends Subject{
    private String numeSpital;

    public Spital(String numeSpital) {
        super();
        this.numeSpital = numeSpital;
    }

    public void notifyPrimireVirus(String numeVirus){
        super.notifyObserver("E un virus nou in oras: " + numeVirus);
    }
}