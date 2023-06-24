public class Judoca extends Lutador implements Judo {

    public Judoca(String nome) {
        super(nome);
    }

    public Judoca() {
        super("Judoca sem nome");
    }

    @Override
    public void ipponSeioiNague() {
        System.out.println("Executando Ippon Seioi Nague...");

    }

    @Override
    public void haraiGoshi() {
        System.out.println("Executando Harai Goshi...");

    }
}
