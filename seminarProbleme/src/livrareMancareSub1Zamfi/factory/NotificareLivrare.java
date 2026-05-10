package livrareMancareSub1Zamfi.factory;

public class NotificareLivrare  implements NotificareSistem{
    private String tag;
    private String mesaj;
    private String oraTrimiterii;

    public NotificareLivrare(String tag, String mesaj, String oraTrimiterii) {
        this.tag = tag;
        this.mesaj = mesaj;
        this.oraTrimiterii = oraTrimiterii;
    }

    @Override
    public void afiseazaNotificare() {
        System.out.println("NotificareLivrare{" +
                "tag='" + tag + '\'' +
                ", mesaj='" + mesaj + '\'' +
                ", oraTrimiterii='" + oraTrimiterii + '\'' +
                '}');
    }

    @Override
    public String getMesaj() {
        return mesaj;
    }

    @Override
    public String getOraTransmitere() {
        return oraTrimiterii;
    }

    @Override
    public String toString() {
        return "NotificareLivrare{" +
                "tag='" + tag + '\'' +
                ", mesaj='" + mesaj + '\'' +
                ", oraTrimiterii='" + oraTrimiterii + '\'' +
                '}';
    }
}
