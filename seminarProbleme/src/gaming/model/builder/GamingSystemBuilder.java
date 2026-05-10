package gaming.model.builder;

public class GamingSystemBuilder {
    private String placaBaza;
    private String memorieRAM;
    private String stocareSSD;
    private String placaVideo;
    private String mouse;
    private String tastatura;
    private String cameraWEB;
    private String casti;
    private String scaunGaming;

    public GamingSystemBuilder(String placaBaza, String memorieRAM, String stocareSSD, String placaVideo) {
        this.placaBaza = placaBaza;
        this.memorieRAM = memorieRAM;
        this.stocareSSD = stocareSSD;
        this.placaVideo = placaVideo;
        this.mouse = "necunoscut";
        this.tastatura = "necunoscut";
        this.cameraWEB = "necunoscut";
        this.casti = "necunoscut";
        this.scaunGaming = "necunoscut";
    }

    public GamingSystemBuilder setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public GamingSystemBuilder setTastatura(String tastatura) {
        this.tastatura = tastatura;
        return this;
    }

    public GamingSystemBuilder setCameraWEB(String cameraWEB) {
        this.cameraWEB = cameraWEB;
        return this;
    }

    public GamingSystemBuilder setCasti(String casti) {
        this.casti = casti;
        return this;
    }

    public GamingSystemBuilder setScaunGaming(String scaunGaming) {
        this.scaunGaming = scaunGaming;
        return this;
    }
    public GamingSystem build(){
        return new GamingSystem(placaBaza,memorieRAM,stocareSSD,placaVideo,mouse,tastatura,cameraWEB,casti,scaunGaming);
    }
}
