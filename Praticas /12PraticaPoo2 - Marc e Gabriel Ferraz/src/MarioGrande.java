public class MarioGrande implements State {

    Mario mario;

    public MarioGrande(Mario mario) {
        this.mario = mario;
    }

    @Override
    public State pegarCogumelo() {
        System.out.println("1000 pontos");
        mario.pontos += 1000;
        return this;
    }

    @Override
    public State pegarFlor() {
        System.out.println("FOGO");
        return new MarioFogo(mario);
    }

    @Override
    public State pegarPena() {
        System.out.println("CAPA");
        return new MarioCapa(mario);
    }

    @Override
    public State levarDano() {
        System.out.println("PEQUENO");
        return new MarioPequeno(mario);
    }
}
