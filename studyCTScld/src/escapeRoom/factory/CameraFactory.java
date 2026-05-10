package escapeRoom.factory;

public class CameraFactory {
    public static ICameraEscape creeaza(TipCamera tip, String nume, int dificultate,int timpRezolvare, double pret) throws Exception {
        switch (tip){
            case CameraHorror : return new CameraHorror(nume, dificultate, timpRezolvare, pret);
            case CameraMister:  return new CameraMister(nume, dificultate, timpRezolvare, pret);
            case CameraStiintfica: return new CameraStiintfica(nume, dificultate, timpRezolvare, pret);
            default: throw new Exception("tip invalid");
        }
    }
}
