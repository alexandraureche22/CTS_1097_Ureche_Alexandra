package licentaturism.model.builder;

public class PachetTuristic {
    private Transport transport;
    private Cazare cazare;
    private ActivitatiExtra activitatiExtra;

    public PachetTuristic(Transport transport, Cazare cazare, ActivitatiExtra activitatiExtra) {
        this.transport = transport;
        this.cazare = cazare;
        this.activitatiExtra = activitatiExtra;
    }

    public Transport getTransport() {
        return transport;
    }

    public Cazare getCazare() {
        return cazare;
    }

    public ActivitatiExtra getActivitatiExtra() {
        return activitatiExtra;
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "transport=" + transport +
                ", cazare=" + cazare +
                ", activitatiExtra=" + activitatiExtra +
                '}';
    }
}
