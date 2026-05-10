package iar.factoryMethod;

public class Secretar implements PersonalSpital {
    private String name;
    private int vechime;

    public Secretar(String name, int vechime) {
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
        return "Secretar{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}';
    }

    @Override
    public void afiseazaOcupatia() {
        System.out.println("Secretar{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}');
    }
}
