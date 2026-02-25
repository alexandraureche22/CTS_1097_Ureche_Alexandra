package Clase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curs implements Cloneable {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> studenti;

    // constructor fara parametrii
    public Curs() {
        this.numeCurs = "Curs fara nume";
        this.credite = 0;
        this.profesor = new Profesor();
        this.studenti = new ArrayList<>();
    }

    // constructor cu parametrii
    public Curs(String numeCurs, int credite, Profesor profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = new Profesor(profesor); // deep copy folosind constructorul de copiere
        this.studenti = studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    // Constructor de copiere
    public Curs(Curs other) {
        this.numeCurs = other.numeCurs;
        this.credite = other.credite;
        this.profesor = new Profesor(other.profesor); // deep copy folosind constructorul de copiere
        this.studenti = other.studenti.stream().map(Student::new).collect(Collectors.toList()); // deep copy prin crearea unei liste noi, iar fiecărui student îi este creat un deep copy folosind constructorul de copiere
    }

    public String getNumeCurs() {
        return this.numeCurs;
    }

    public int getCredite() {
        return this.credite;
    }

    public Profesor getProfesor() {
        // return this.profesor; // shallow copy
        return new Profesor(this.profesor); // deep copy folosind constructorul de copiere
    }

    public List<Student> getStudenti() {
        // return this.studenti; // shallow copy
        return this.studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    public void setStudenti(List<Student> studenti) {
        // this.studenti = studenti; // shallow copy (copiem referința obiectului, ambele obiecte referă aceeași locație de memorie)
        this.studenti = studenti.stream().map(Student::new).collect(Collectors.toList()); // deep copy complet prin crearea unei liste noi, iar fiecărui student îi este creat un deep copy folosind constructorul de copiere
    }

    @Override
    public Curs clone() {
        try {
            Curs cloned = (Curs) super.clone();
            cloned.profesor = this.profesor.clone(); // deep copy folosind metoda clone(), implementată din interfața Cloneable
            cloned.studenti = this.studenti.stream().map(Student::clone).collect(Collectors.toList()); // deep copy complet prin crearea unei liste noi, iar fiecărui student îi este creat un deep copy folosind metoda clone(), implementată din interfața Cloneable
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}