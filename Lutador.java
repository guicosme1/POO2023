public class Lutador extends Combatente {

    public Lutador(String identificacao) {
        super(identificacao);
    }

    public int chutar() {
        return 20;
    }

    public int socar() {
        return 10;
    }

    @Override
    public void atacar(Combatente adversario) {
        if (Math.random() > 0.5) {
            adversario.defender(this.chutar());
        } else {
            adversario.defender(this.socar());
        }
    }
}
