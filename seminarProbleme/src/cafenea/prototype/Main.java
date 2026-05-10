package cafenea.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Collection collection = new Collection();
        BauturaPresetata b1 = new BauturaPresetata("cafea","latte",12.99,500);
        BauturaPresetata b2 = b1.clone();
        System.out.println("egale?"+(b1==b2));
        System.out.println(b1);
        System.out.println(b2);
        b2.setNume("matcha");
        collection.salveazaBauturi("cafea",b1);
        collection.salveazaBauturi("matcha",b2);
        System.out.println(b2);
        System.out.println("====");
        System.out.println(collection.getBautura("cafea"));
    }
}
