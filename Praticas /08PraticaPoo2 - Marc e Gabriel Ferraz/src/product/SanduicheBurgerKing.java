package product;

import factory.AbstractFactory;

public class SanduicheBurgerKing implements Sanduiche {

    private AbstractFactory abstractFactory;

    public SanduicheBurgerKing(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    @Override
    public Sanduiche preparar() {
        System.out.println("Preparando " + abstractFactory.getName());
        return this;
    }
}
