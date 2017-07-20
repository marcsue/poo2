public class Mario {

    State estado;
    int pontos;

    public Mario() {
        this.estado = new MarioPequeno(this);
        this.pontos = 0;
    }

    public void pegarCogumelo() {
        this.estado = estado.pegarCogumelo();
    }

    public void pegarFlor() {
        this.estado = estado.pegarFlor();
    }

    public void pegarPena() {
        this.estado = estado.pegarPena();
    }

    public void levarDano() {
        this.estado = estado.levarDano();
    }

    public int getPontos() {
        return pontos;
    }
}
