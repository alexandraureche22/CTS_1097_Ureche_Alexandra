package transport.prototype;

import javax.print.Doc;

public class Document implements DocumentCloneable, IDocument {
    private String tipTransport;
    private String stampila;
    private String destinatie;
    private String sofer;
    private String ora;

    public Document(String tipTransport, String stampila) {
        this.tipTransport = tipTransport;
        this.stampila = stampila;
        this.destinatie = "necunoscut";
        this.sofer = "necunoscut";
        this.ora = "necunoscut";
    }

    public Document(Document altDocument) {
        this.tipTransport = altDocument.tipTransport;
        this.stampila =altDocument.stampila;
        this.destinatie = altDocument.destinatie;
        this.sofer = altDocument.sofer;
        this.ora = altDocument.ora;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    @Override
    public DocumentCloneable cloneaza() {
        return new Document(this);
    }

    @Override
    public void afiseazaDocument() {
        System.out.println("Document{" +
                "tipTransport='" + tipTransport + '\'' +
                ", stampila='" + stampila + '\'' +
                ", destinatie='" + destinatie + '\'' +
                ", sofer='" + sofer + '\'' +
                ", ora='" + ora + '\'' +
                '}');
    }
}
