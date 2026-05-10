package gaming.model.builder;

public class GamingSystem implements IGamingSystem {
    private String placaBaza;
    private String memorieRAM;
    private String stocareSSD;
    private String placaVideo;
    private String mouse;
    private String tastatura;
    private String cameraWEB;
    private String casti;
    private String scaunGaming;

    public GamingSystem(String placaBaza, String memorieRAM, String stocareSSD, String placaVideo, String mouse, String tastatura, String cameraWEB, String casti, String scaunGaming) {
        this.placaBaza = placaBaza;
        this.memorieRAM = memorieRAM;
        this.stocareSSD = stocareSSD;
        this.placaVideo = placaVideo;
        this.mouse = mouse;
        this.tastatura = tastatura;
        this.cameraWEB = cameraWEB;
        this.casti = casti;
        this.scaunGaming = scaunGaming;
    }

    public String getPlacaBaza() {
        return placaBaza;
    }

    public String getMemorieRAM() {
        return memorieRAM;
    }

    public String getStocareSSD() {
        return stocareSSD;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public String getMouse() {
        return mouse;
    }

    public String getTastatura() {
        return tastatura;
    }

    public String getCameraWEB() {
        return cameraWEB;
    }

    public String getCasti() {
        return casti;
    }

    public String getScaunGaming() {
        return scaunGaming;
    }

    @Override
    public String toString() {
        return "GamingSystem{" +
                "placaBaza='" + placaBaza + '\'' +
                ", memorieRAM='" + memorieRAM + '\'' +
                ", stocareSSD='" + stocareSSD + '\'' +
                ", placaVideo='" + placaVideo + '\'' +
                ", mouse='" + mouse + '\'' +
                ", tastatura='" + tastatura + '\'' +
                ", cameraWEB='" + cameraWEB + '\'' +
                ", casti='" + casti + '\'' +
                ", scaunGaming='" + scaunGaming + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("GamingSystem{" +
                "placaBaza='" + placaBaza + '\'' +
                ", memorieRAM='" + memorieRAM + '\'' +
                ", stocareSSD='" + stocareSSD + '\'' +
                ", placaVideo='" + placaVideo + '\'' +
                ", mouse='" + mouse + '\'' +
                ", tastatura='" + tastatura + '\'' +
                ", cameraWEB='" + cameraWEB + '\'' +
                ", casti='" + casti + '\'' +
                ", scaunGaming='" + scaunGaming + '\'' +
                '}');
    }
}
