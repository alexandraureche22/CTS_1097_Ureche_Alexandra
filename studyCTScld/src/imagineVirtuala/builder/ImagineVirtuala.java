package imagineVirtuala.builder;

import java.util.List;

public class ImagineVirtuala {
    private String numeImagine;
    private String sistemOperare;
    private String office;
    private String antivirus;
    private String browser;
    private List<String> aplicatiiExtra;

    public ImagineVirtuala(String numeImagine, String sistemOperare, String office, String antivirus, String browser, List<String> aplicatiiExtra) {
        this.numeImagine = numeImagine;
        this.sistemOperare = sistemOperare;
        this.office = office;
        this.antivirus = antivirus;
        this.browser = browser;
        this.aplicatiiExtra = aplicatiiExtra;
    }

    public String getNumeImagine() {
        return numeImagine;
    }

    public String getSistemOperare() {
        return sistemOperare;
    }

    public String getOffice() {
        return office;
    }

    public String getAntivirus() {
        return antivirus;
    }

    public String getBrowser() {
        return browser;
    }

    public List<String> getAplicatiiExtra() {
        return aplicatiiExtra;
    }

    @Override
    public String toString() {
        return "ImagineVirtuala{" +
                "numeImagine='" + numeImagine + '\'' +
                ", sistemOperare='" + sistemOperare + '\'' +
                ", office='" + office + '\'' +
                ", antivirus='" + antivirus + '\'' +
                ", browser='" + browser + '\'' +
                ", aplicatiiExtra=" + aplicatiiExtra +
                '}';
    }

}
