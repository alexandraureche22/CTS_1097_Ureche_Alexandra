package livrareMancareSub1Zamfi.factory;

public class NotificarePromotie implements NotificareSistem{
    private String tag;
    private String mesaj;
    private String oraTrimiterii;

    public NotificarePromotie(String tag, String mesaj, String oraTrimiterii) {
        this.tag = tag;
        this.mesaj = mesaj;
        this.oraTrimiterii = oraTrimiterii;
    }

    @Override
    public void afiseazaNotificare() {
        System.out.println("NotificarePromotie{" +
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
        return "NotificarePromotie{" +
                "tag='" + tag + '\'' +
                ", mesaj='" + mesaj + '\'' +
                ", oraTrimiterii='" + oraTrimiterii + '\'' +
                '}';
    }
}
