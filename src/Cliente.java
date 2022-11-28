public class Cliente extends Persona {
    private boolean credito;

    public Cliente (){}

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public boolean isCredito() {
        return credito;
    }
}
