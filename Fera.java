
public class Fera extends Personagem {

    public Fera(String nome) {
        super(nome);
        this.nivelEnergia = 100;
    }

    public Fera() {
        this("Fera sem nome " + sequencialNome++);
        this.nivelEnergia = Math.random() * 200;
    }

    public Fera(String string, double nivelEnergia) {
        super(string, nivelEnergia);
    }

    public boolean estaVivo() {
        return super.nivelEnergia > 0;
    }

    public void atacar(Personagem personagem) {
        int tipoAtaque = (int) (Math.random() * 2);

        if (tipoAtaque == 0)
            morder(personagem);
        else if (tipoAtaque == 1)
            usarGarra(personagem);
    }

    public void defender(double poderAtaque) {
        int tipoDefesa = (int) (Math.random() * 2);

        if (tipoDefesa == 0)
            pular(poderAtaque);
        else if (tipoDefesa == 1)
            correr(poderAtaque);
        else {
            nivelEnergia -= poderAtaque;
        }
    }

    public void morder(Personagem personagem) {
        personagem.defender(10);
    }

    public void usarGarra(Personagem personagem) {
        personagem.defender(20);
    }

    public void pular(double poderAtaque) {
        nivelEnergia -= poderAtaque * 0.01;
    }

    public void correr(double poderAtaque) {
        nivelEnergia -= poderAtaque * 0.05;
    }


}