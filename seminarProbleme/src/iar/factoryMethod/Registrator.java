package iar.factoryMethod;

public class Registrator implements PersonalSpital {
    private String name;
    private int vechime;

    public Registrator(String name, int vechime) {
        this.name = name;
        this.vechime = vechime;
    }

    public String getName() {
        return name;
    }

    public int getVechime() {
        return vechime;
    }

    @Override
    public String toString() {
        return "Registrator{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}';
    }

    @Override
    public void afiseazaOcupatia() {
        System.out.println("Registrator{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}');
    }
}
