public class MarioPequeno implements State {

    Mario mario;

    public MarioPequeno(Mario mario) {
        this.mario = mario;
    }


    @Override
    public State pegarCogumelo() {
        System.out.println("GRANDE");
        return new MarioGrande(mario);
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
        System.out.println("MORTO");
        return new MarioMorto(mario);
    }
}
