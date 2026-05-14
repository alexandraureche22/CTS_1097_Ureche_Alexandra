package command.problema1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Operator {
    private Queue<Command> comenzi;
    private Stack<Command> undo;
    private Stack<Command> redo;

    public Operator() {
        this.comenzi = new LinkedList<>();
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }
    public void adaugaComanda(Command comanda) {
        comenzi.add(comanda);
    }
    public void trimiteComanda(){
        if(!comenzi.isEmpty()){
            Command command = comenzi.poll();
            command.executa();
            undo.push(command);
            redo.clear();
        }
        else{
            System.out.println("Nu exista comnezi de trimis.");
        }
    }
    public void anuleazaComanda(){
        if(!undo.isEmpty()){
            Command command = undo.pop();
            command.undo();
            redo.push(command);

        }
        else{
            System.out.println("Nu exista comnezi de anulat.");
        }
    }
    public void refaceComanda(){
        if(!comenzi.isEmpty()){
            Command command = redo.pop();
            command.redo();
            undo.push(command);
        }
        else{
            System.out.println("Nu exista comnezi de refacut.");
        }
    }
}
