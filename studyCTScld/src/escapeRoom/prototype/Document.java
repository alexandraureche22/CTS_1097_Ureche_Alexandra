package escapeRoom.prototype;

import escapeRoom.factory.ICameraEscape;
import transport.prototype.IDocument;

public class Document implements IDocument, DocumentCloneable {
    private String tipCamera;
    private String numeEchipa;
    private int nrPersoane;
    private String oraStart;

    public Document(String tipCamera){
        this.tipCamera = tipCamera;
        this.numeEchipa = "necunoscut";
        this.nrPersoane = 0;
        this.oraStart = "necunoscut";
    }

    public Document(Document altDoc) {
        this.tipCamera = altDoc.tipCamera;
        this.numeEchipa = altDoc.numeEchipa;
        this.nrPersoane = altDoc.nrPersoane;
        this.oraStart = altDoc.oraStart;
    }

    public void setNumeEchipa(String numeEchipa) {
        this.numeEchipa = numeEchipa;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOraStart(String oraStart) {
        this.oraStart = oraStart;
    }

    @Override
    public DocumentCloneable cloneaza() {
        return new Document(this);
    }

    @Override
    public void afiseazaDocument() {
        System.out.println("Document{" +
                "tipCamera='" + tipCamera + '\'' +
                ", numeEchipa='" + numeEchipa + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", oraStart='" + oraStart + '\'' +
                '}');
    }
}
