package restaurantprototypegreu.prototype;

import restaurantprototypegreu.factory.IFelMancare;

public class MeniuPresetat implements IMeniu,ICloneaza{
    private String design;
    private IFelMancare fel;

    public MeniuPresetat(String design) {
        this.design = design;
    }

    public MeniuPresetat(MeniuPresetat altFel) {
        this.design = altFel.design;
        this.fel = altFel.fel;
    }

    @Override
    public String toString() {
        return "MeniuPresetat{" +
                "design='" + design + '\'' +
                ", fel=" + fel +
                '}';
    }

    @Override
    public ICloneaza cloneaza() {
        return new MeniuPresetat(this);
    }

    public void setFel(IFelMancare fel) {
        this.fel = fel;
    }

    @Override
    public void print() {
        System.out.println("MeniuPresetat{" +
                "design='" + design + '\'' +
                ", fel=" + fel +
                '}');
    }
}
