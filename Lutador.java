public class Lutador extends Combatente implements ArtesMarciais {

    public Lutador(String identificacao) {
        super(identificacao);
    }

    @Override
    public int chutar() {
        return 20;
    }

    @Override
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

    @Override
    public String toString() {
        return "Lutador: " + super.toString();
    }
}