package transport.prototype.main;

import transport.prototype.Document;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new Document("aerian","digitala");
        Document doc2 = new Document("feroviar","ufbwejif");
        Document doc3 = (Document) doc1.cloneaza();
        System.out.println("sunt la fel?"+(doc1==doc3));
        doc1.afiseazaDocument();
        doc3.setDestinatie("bucuresti");
        doc3.setOra("12:12");
        doc3.afiseazaDocument();

        doc2.afiseazaDocument();
    }
}
