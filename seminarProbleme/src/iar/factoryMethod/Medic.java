package iar.factoryMethod;

public class Medic implements PersonalSpital {
    private String name;
    private int vechime;

    public Medic(String name, int vechime) {
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
        return "Medic{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}';
    }

    @Override
    public void afiseazaOcupatia() {
        System.out.println("Medic{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}');
    }
}
