package Clase;

public class Student extends Persoana implements Cloneable {
    private String idStudent;

    // constructor fara parametrii
    public Student() {
        super();
        this.idStudent = "S00";
    }

    // constructor cu parametrii
    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    // constructor de copiere
    public Student(Student altStudent) {
        super(altStudent);
        this.idStudent = altStudent.idStudent;
    }

    public String getIdStudent() {
        return this.idStudent;
    }

    @Override
    public Student clone() {
        Student clone = (Student) super.clone();
        return clone;
    }
}