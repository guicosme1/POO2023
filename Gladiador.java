public class Gladiador extends Combatente {

    private Arma armaPrincipal;
    private Arma armaSecundaria;

    public Gladiador(String identificacao, Arma armaPrincipal, Arma armaSecundaria) {
        super(identificacao);
        this.armaPrincipal = armaPrincipal;
        this.armaSecundaria = armaSecundaria;
    }

    @Override
    public void atacar(Combatente adversario) {
        int poderOfensivo = calcularPoderOfensivo();
        adversario.defender(poderOfensivo);
    }

    private int calcularPoderOfensivo() {
        int poderTotal = armaPrincipal.getPoderOfensivo() + armaSecundaria.getPoderOfensivo();
        // Lógica para cálculo do poder ofensivo do gladiador
        return poderTotal;
    }

    public void transferirArmas(Gladiador perdedor) {
        this.armaPrincipal = perdedor.armaPrincipal;
        this.armaSecundaria = perdedor.armaSecundaria;
        perdedor.armaPrincipal = null;
        perdedor.armaSecundaria = null;
    }

    @Override
    public String toString() {
        return "Gladiador: " + super.toString();
    }
}



