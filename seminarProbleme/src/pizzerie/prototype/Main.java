package pizzerie.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PizzaPresetata p1 = new PizzaPresetata("margherita","cheesy",40,55);
        PizzaPresetata p2 = new PizzaPresetata("pepperoni","churi",45,66);
        PizzaPresetata p3=p2.clone();
        p3.setNume("con carne");
        System.out.println("egale?"+(p2==p3));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        PizzaCollection pizza =  new PizzaCollection();
        pizza.salveazaPizza("ion",p3);
        pizza.salveazaPizza("maria",p2);
        pizza.salveazaPizza("ion",p1);
        System.out.println("-----");
        System.out.println(pizza.getPizza("ion"));


    }
}
