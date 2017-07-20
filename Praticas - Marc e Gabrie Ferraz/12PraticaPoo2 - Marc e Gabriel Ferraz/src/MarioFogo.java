public class MarioFogo implements State {

    Mario mario;

    public MarioFogo(Mario mario) {
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
        System.out.println("1000 PONTOS");
        mario.pontos += 1000;
        return this;
    }

    @Override
    public State pegarPena() {
        System.out.println("CAPA");
        return new MarioCapa(mario);
    }

    @Override
    public State levarDano() {
        System.out.println("GRANDE");
        return new MarioGrande(mario);
    }
}
