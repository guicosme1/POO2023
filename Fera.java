public class Fera extends Combatente {
    private String descricaoArma;
    private String descricaoGolpe;
    private int poderOfensivoGolpe;
    private String descricaoArmadura;
    private int poderDefesaArmadura;
    private String estadoConservacaoArmadura;

    public Fera(String identificacao) {
        super(identificacao);
    }

    public void atacar(Combatente adversario) {
        if (Math.random() > 0.5) {
            adversario.defender(this.poderOfensivoGolpe);
        } else {
            adversario.defender(0); // Não realiza o golpe
        }
    }

    // Getters e Setters
    public String getDescricaoArma() {
        return descricaoArma;
    }

    public void setDescricaoArma(String descricaoArma) {
        this.descricaoArma = descricaoArma;
    }

    public String getDescricaoGolpe() {
        return descricaoGolpe;
    }

    public void setDescricaoGolpe(String descricaoGolpe) {
        this.descricaoGolpe = descricaoGolpe;
    }

    public int getPoderOfensivoGolpe() {
        return poderOfensivoGolpe;
    }

    public void setPoderOfensivoGolpe(int poderOfensivoGolpe) {
        this.poderOfensivoGolpe = poderOfensivoGolpe;
    }

    public String getDescricaoArmadura() {
        return descricaoArmadura;
    }

    public void setDescricaoArmadura(String descricaoArmadura) {
        this.descricaoArmadura = descricaoArmadura;
    }

    public int getPoderDefesaArmadura() {
        return poderDefesaArmadura;
    }

    public void setPoderDefesaArmadura(int poderDefesaArmadura) {
        this.poderDefesaArmadura = poderDefesaArmadura;
    }

    public String getEstadoConservacaoArmadura() {
        return estadoConservacaoArmadura;
    }

    public void setEstadoConservacaoArmadura(String estadoConservacaoArmadura) {
        this.estadoConservacaoArmadura = estadoConservacaoArmadura;
    }
}
