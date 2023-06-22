public abstract class Combatente {

    protected String identificacao;
    protected int nivelEnergia;

    public Combatente(String identificacao) {
        this.identificacao = identificacao;
        nivelEnergia = 100;
    }

    public abstract void atacar(Combatente adversario);

    public String getIdentificacao() {
        return identificacao;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void defender(int poderOfensivo) {
        nivelEnergia -= poderOfensivo;
    }

    public boolean estaVivo() {
        return nivelEnergia > 0;
    }

    @Override
    public String toString() {
        return identificacao;
    }
}