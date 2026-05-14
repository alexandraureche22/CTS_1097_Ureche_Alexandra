package chainofresponsability.problema1;

public abstract class Handler {
    private Handler succesor;

    public Handler getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }
    public abstract void trateaza(CerereDespagubire cerereDespagubire);
}
