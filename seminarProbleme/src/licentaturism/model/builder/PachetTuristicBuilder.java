package licentaturism.model.builder;

public class PachetTuristicBuilder implements AbstractHolidayPackage {
    private Transport transport;
    private Cazare cazare;
    private ActivitatiExtra activitatiExtra;

    public PachetTuristicBuilder() {
        new PachetTuristic(null,null,null);
    }

    public PachetTuristicBuilder setTransport(Transport transport) {
        this.transport = transport;
        return this;
    }

    public PachetTuristicBuilder setCazare(Cazare cazare) {
        this.cazare = cazare;
        return this;
    }

    public PachetTuristicBuilder setActivitatiExtra(ActivitatiExtra activitatiExtra) {
        this.activitatiExtra = activitatiExtra;
        return this;
    }

    @Override
    public String toString() {
        return "PachetTuristicBuilder{" +
                "transport=" + transport +
                ", cazare=" + cazare +
                ", activitatiExtra=" + activitatiExtra +
                '}';
    }

    @Override
    public void printDetalii() {
        System.out.println("PachetTuristicBuilder{" +
                "transport=" + transport +
                ", cazare=" + cazare +
                ", activitatiExtra=" + activitatiExtra +
                '}');

    }
    public PachetTuristic build(){
        return new PachetTuristic(transport,cazare,activitatiExtra);
    }
}
