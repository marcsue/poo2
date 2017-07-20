public class MarioCapa implements State {

    Mario mario;

    public MarioCapa(Mario mario) {
        this.mario = mario;
    }

    @Override
    public State pegarCogumelo() {
        System.out.println("1000 PONTOS");
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
        System.out.println("1000 PONTOS");
        mario.pontos += 1000;
        return this;
    }

    @Override
    public State levarDano() {
        System.out.println("GRANDE");
        return new MarioGrande(mario);
    }
}
