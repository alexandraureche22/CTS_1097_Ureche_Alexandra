package chainofresponsability.problema2;


public abstract class Handler {
    private Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public Handler getSuccesor() {
        return succesor;
    }
    public abstract void trateaza(CerereImprumut cerereImprumut);
}
