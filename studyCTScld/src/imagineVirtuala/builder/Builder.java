package imagineVirtuala.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder implements IImagineBuilder{
    private String numeImagine;
    private String sistemOperare;
    private String office;
    private String antivirus;
    private String browser;
    private List<String> aplicatiiExtra;

    public Builder() {
        this.numeImagine = "numeImagine";
        this.sistemOperare = "sistemOperare";
        this.office = ";";
        this.antivirus = "antivirus";
        this.browser = "browser";
        this.aplicatiiExtra = new ArrayList<>();
    }

    public Builder setNumeImagine(String numeImagine) {
        this.numeImagine = numeImagine;
        return this;
    }

    public Builder setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
        return this;
    }

    public Builder setOffice(String office) {
        this.office = office;
        return this;
    }

    public Builder setAntivirus(String antivirus) {
        this.antivirus = antivirus;
        return this;
    }

    public Builder setBrowser(String browser) {
        this.browser = browser;
        return this;
    }

    public Builder setAplicatiiExtra(List<String> aplicatiiExtra) {
        this.aplicatiiExtra = aplicatiiExtra;
        return this;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "numeImagine='" + numeImagine + '\'' +
                ", sistemOperare='" + sistemOperare + '\'' +
                ", office='" + office + '\'' +
                ", antivirus='" + antivirus + '\'' +
                ", browser='" + browser + '\'' +
                ", aplicatiiExtra=" + aplicatiiExtra +
                '}';
    }

    @Override
    public ImagineVirtuala build() {
        return new ImagineVirtuala(numeImagine,sistemOperare,office,antivirus,browser,aplicatiiExtra);
    }
}
