public class MarioMorto implements State {

    Mario mario;

    public MarioMorto(Mario mario) {
        this.mario = mario;
    }

    @Override
    public State pegarCogumelo() {
        return null;
    }

    @Override
    public State pegarFlor() {
        return null;
    }

    @Override
    public State pegarPena() {
        return null;
    }

    @Override
    public State levarDano() {
        return null;
    }
}
