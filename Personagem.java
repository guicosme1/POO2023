public abstract class Personagem {

    static int sequencialNome = 1;

    String nome;
    double nivelEnergia;

    public Personagem(String nome) {
        this(nome, 0);
    }

    public Personagem(String nome, double nivelEnergia) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
    }

    public String toString() {
        return nome + "[" + nivelEnergia + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Personagem personagem = (Personagem) object;
        return nome.equals(personagem.nome);
    }

    public abstract boolean estaVivo();
    public abstract void atacar(Personagem personagem);
    public abstract void defender(double poderAtaque);
}
