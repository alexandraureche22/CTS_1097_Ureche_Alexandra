package iar.factoryMethod;

public class Asistent implements PersonalSpital {
    private String name;
    private int vechime;

    public Asistent(String name, int vechime) {
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
        return "Asistent{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}';
    }

    @Override
    public void afiseazaOcupatia() {
        System.out.println("Asistent{" +
                "name='" + name + '\'' +
                ", vechime=" + vechime +
                '}');
    }
}
