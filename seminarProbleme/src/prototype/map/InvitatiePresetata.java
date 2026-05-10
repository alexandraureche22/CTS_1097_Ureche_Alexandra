package prototype.map;

import prototype.simplu.IAtestat;
import prototype.simplu.ICloneaza;

public class InvitatiePresetata implements IAtestat, ICloneaza {
    private String tip;
    private String background;
    private String font;
    private String elemente;

    public InvitatiePresetata( String background, String font, String elemente) {
        this.tip="necunoscut";
        this.background = background;
        this.font = font;
        this.elemente = elemente;

    }
    public InvitatiePresetata(InvitatiePresetata alta) {
        this.tip = alta.tip;
        this.background = alta.background;
        this.font = alta.font;
        this.elemente = alta.elemente;
    }

    @Override
    public String toString() {
        return "InvitatiePresetata{" +
                "background='" + background + '\'' +
                ", font='" + font + '\'' +
                ", elemente='" + elemente + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("InvitatiePresetata{" +
                "background='" + background + '\'' +
                ", font='" + font + '\'' +
                ", elemente='" + elemente + '\'' +
                '}');
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public IAtestat cloneaza() {
        return new InvitatiePresetata(this);
    }
}
