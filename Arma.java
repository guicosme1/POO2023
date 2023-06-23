public class Arma {
    private String nome;
    private int poderOfensivo;

    public Arma(String nome, int poderOfensivo) {
        this.nome = nome;
        this.poderOfensivo = poderOfensivo;
    }

    public int getPoderOfensivo() {
        return poderOfensivo;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", poderOfensivo=" + poderOfensivo +
                '}';
    }
}