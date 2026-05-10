package universitate.prototype;

public abstract class ASablon implements IMaterial{
    private String detalii;
    private String instructiuni;
    private String autor;
    private String disciplina;

    public ASablon(String detalii, String instructiuni, String autor, String disciplina) {
        this.detalii = detalii;
        this.instructiuni = instructiuni;
        this.autor = autor;
        this.disciplina = disciplina;
    }

    public ASablon() {
    }
    public ASablon(ASablon altul) {
        this.detalii = altul.detalii;
        this.instructiuni = altul.instructiuni;
        this.autor = altul.autor;
        this.disciplina = altul.disciplina;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public String getInstructiuni() {
        return instructiuni;
    }

    public void setInstructiuni(String instructiuni) {
        this.instructiuni = instructiuni;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public abstract void afiseazaMaterial();
    public abstract IMaterial cloneaza();
    @Override
    public String toString() {
        return "ASablon{" +
                "detalii='" + detalii + '\'' +
                ", instructiuni='" + instructiuni + '\'' +
                ", autor='" + autor + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
