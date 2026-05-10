package hospital.prototype;

public abstract class Sablon implements IRaport{
    private String text;
    private String recomandari;
    private String doctor;
    private String data;

    public Sablon(String text, String recomandari, String doctor, String data) {
        this.text = text;
        this.recomandari = recomandari;
        this.doctor=doctor;
        this.data=data;
    }

    public Sablon() {
    }

    public Sablon(Sablon altul) {
        this.text = altul.text;
        this.recomandari = altul.recomandari;
        this.doctor=altul.doctor;
        this.data=altul.data;

    }

    public String getDoctor() {
        return doctor;
    }

    public String getData() {
        return data;
    }

    public String getText() {
        return text;
    }

    public String getRecomandari() {
        return recomandari;
    }

    @Override
    public String toString() {
        return "Sablon{" +
                "text='" + text + '\'' +
                ", recomandari='" + recomandari + '\'' +
                ", doctor='" + doctor + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public abstract IRaport cloneaza();

    @Override
    public void afiseazaRaport() {
        System.out.println("Sablon{" +
                "text='" + text + '\'' +
                ", recomandari='" + recomandari + '\'' +
                ", doctor='" + doctor + '\'' +
                ", data='" + data + '\'' +
                '}');

    }

    @Override
    public void setNumeDoctor(String nume) {
        this.doctor=nume;

    }

    @Override
    public void setData(String data) {
        this.data=data;

    }
}
