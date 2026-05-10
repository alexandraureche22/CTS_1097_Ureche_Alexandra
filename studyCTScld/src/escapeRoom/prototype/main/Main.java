package escapeRoom.prototype.main;

import escapeRoom.prototype.Document;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new Document("camera horror");
        doc1.setNrPersoane(4);
        doc1.setOraStart("20:20");
        doc1.afiseazaDocument();
        Document doc2 = (Document) doc1.cloneaza();
        doc2.setNrPersoane(2);
        doc2.afiseazaDocument();
        System.out.println("sunt la fel?"+(doc2==doc1));
        System.out.println(doc1);
        System.out.println(doc2);

    }
}
