import java.util.ArrayList;

public class Gladiador extends Lutador {

    ArrayList<Armadura> armaduras;
    ArrayList<Arma> armas;


    public Gladiador(String nome, double nivelEnergia) {
        super(nome, nivelEnergia);
        armaduras = new ArrayList<>();
        armas = new ArrayList<>();
    }

    public Gladiador(String nome) {
        super(nome);
        armaduras = new ArrayList<>();
        armas = new ArrayList<>();
    }

    public Gladiador() {
        super("Gladiador sem nome " + sequencialNome++);
        armaduras = new ArrayList<>();
        armaduras.add(new Armadura("Armadura de Corpo", 0.5, 1));

        armas = new ArrayList<>();

        Arma espada = new Arma("Escalibur");
        espada.addGolpe("Ataque frontal", 50);
        espada.addGolpe("Ataque Lateral", 40);
        armas.add(espada);
    }

    public void addArmaduras(ArrayList<Armadura> armaduras) {
        this.armaduras.addAll(armaduras);
    }

    public void addArmadura(Armadura armadura) {
        armaduras.add(armadura);
    }

    public Armadura getArmadura(String nomeArmadura) {
        for (Armadura armadura : armaduras) {
            if (armadura.descricao.equals(nomeArmadura)) {
                return armadura;
            }
        }
        return null;
    }

    public void addArma(Arma arma) {
        armas.add(arma);
    }

    public void addArmas(ArrayList<Arma> armas) {
        this.armas.addAll(armas);
    }

    public Arma getArma(String nomeArma) {
        for (Arma arma : armas) {
            if (arma.descricao.equals(nomeArma)) {
                return arma;
            }
        }
        return null;
    }

    @Override
    public void atacar(Personagem personagem) {
        int tipoAtaque = (int) (Math.random() * 3);

        if (tipoAtaque == 0)
            socar(personagem);
        else if (tipoAtaque == 1)
            chutar(personagem);
        else if (tipoAtaque == 2)
            usarArma(personagem);
    }

    private void usarArma(Personagem personagem) {
        if (armas.size() > 0) {
            int tipoArma = (int) (Math.random() * armas.size());
            Arma arma = armas.get(tipoArma);

            if (Math.random() > 0.5) {
                personagem.defender(arma.pegarGolpeRandomico().poderOfensivo);
            } else {
                Golpe golpeMortal;

                if (Math.random() > 0.5) {
                    golpeMortal = arma.explodir();
                } else {
                    golpeMortal = arma.atirar();
                }

                personagem.defender(golpeMortal.poderOfensivo);
            }
        }
    }

    @Override
    public void defender(double poderAtaque) {
        int tipoDefesa = (int) (Math.random() * 4);

        if (tipoDefesa == 0)
            esquivar(poderAtaque);
        else if (tipoDefesa == 1)
            fazerGuarda(poderAtaque);
        else if (tipoDefesa == 2)
            usarArmadura(poderAtaque);
        else {
            nivelEnergia -= poderAtaque;
        }
    }

    private void usarArmadura(double poderAtaque) {
        if (armaduras.size() > 0) {
            int tipoArmadura = (int) (Math.random() * armaduras.size());
            Armadura armadura = armaduras.get(tipoArmadura);

            double intensidadeAtaque = armadura.poderDefesa * poderAtaque;

            this.nivelEnergia -= intensidadeAtaque;

            // armadura.estadoConsevacao--;
        }
    }


}

class Armadura{
    private final double estadoConservacao;
    String descricao;
    double poderDefesa;
    double estadoConsevacao;
    public Armadura(String descricao, double poderDefesa, double estadoConservacao) {
        this.descricao = descricao;
        this.poderDefesa = poderDefesa;
        this.estadoConservacao = estadoConservacao;
    }





}