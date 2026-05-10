package universitate.prototype;

public interface IMaterial {
    IMaterial cloneaza();
    void afiseazaMaterial();
    void setAutor(String autor);
    void setDisciplina(String disciplina);
}
