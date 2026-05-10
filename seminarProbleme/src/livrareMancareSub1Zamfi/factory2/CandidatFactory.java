package livrareMancareSub1Zamfi.factory2;

public class CandidatFactory {
    public static DosarCandidat creeaza(String tip, String nume, double medie, String diploma, String premiu) throws Exception {
        switch (tip){
            case "olimpic": return new CandidatOlimpic(nume, medie, diploma, premiu);
            case "ces": return new CandidatCES(nume, medie, diploma, premiu);
            case "normal": return new CandidatNormal(nume, medie, diploma, premiu);
            default : throw new Exception("invalid tip");
        }
    }
}
