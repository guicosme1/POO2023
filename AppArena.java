import java.util.Iterator;

public class AppArena {

    static int qtdLutadores = 0;
    static int qtdFeras = 0;

    private int numCombatentes;
    private Combatente[] combatentes;


    public AppArena(int numCombatentes) {
        this.numCombatentes = numCombatentes;
        combatentes = gerarVetorCombatentes(numCombatentes);
    }

    private Combatente[] gerarVetorCombatentes(int qtdCombatentes) {
        Combatente[] combatentes = new Combatente[qtdCombatentes];
        for (int i = 0; i < combatentes.length; i++) {
            if (Math.random() > 0.5) {
                combatentes[i] = new Lutador("Lutador " + qtdLutadores++);
            } else {
                combatentes[i] = new Fera("Fera " + qtdFeras++);
            }
        }

        return combatentes;
    }

    public Combatente iniciarCombate(Combatente combatente1, Combatente combatente2) {
        int turno = 1;
        while (combatente1.estaVivo() && combatente2.estaVivo()) {
            Combatente atacante, defensor;
            if (turno == 1) {
                atacante = combatente1;
                defensor = combatente2;
            } else {
                atacante = combatente2;
                defensor = combatente1;
            }
            turno *= -1;
            System.out.println("Ataque de " + atacante.getIdentificacao() + "[" + atacante.getNivelEnergia() + "]" +
                    " em " + defensor.getIdentificacao() + "[" + defensor.getNivelEnergia() + "]");
            atacante.atacar(defensor);
        }

        return combatente1.estaVivo() ? combatente1 : combatente2;
    }

    public void iniciarTorneio() {
        while (numCombatentes > 1) {
            System.out.println("----- Novo Torneio -----");
            System.out.println("Quantidade de combatentes: " + numCombatentes);
            for (int i = 0; i < numCombatentes; i += 2) {
                Combatente combatente1 = combatentes[i];
                Combatente combatente2 = combatentes[i + 1];
                System.out.println("Inicio de Combate: " + combatente1.getIdentificacao() +
                        " vs. " + combatente2.getIdentificacao());
                Combatente campeao = iniciarCombate(combatente1, combatente2);
                System.out.println("Vencedor: " + campeao.getIdentificacao());
                combatentes[i / 2] = campeao;
            }
            numCombatentes /= 2;
        }
        System.out.println("----- Campeão do Torneio -----");
        System.out.println("Vencedor: " + combatentes[0].getIdentificacao());
    }

    public static void main(String[] args) {
        AppArena arena = new AppArena(10);
        arena.iniciarTorneio();
    }
}