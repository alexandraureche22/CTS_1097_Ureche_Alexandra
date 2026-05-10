package iar.factoryMethod;

public class Brancardier implements PersonalSpital {
    private String name;
    private int vechime;

    public Brancardier(String name, int vechime) {
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
        return "Brancardier{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}';
    }

    @Override
    public void afiseazaOcupatia() {
        System.out.println("Brancardier{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}');
    }
}
