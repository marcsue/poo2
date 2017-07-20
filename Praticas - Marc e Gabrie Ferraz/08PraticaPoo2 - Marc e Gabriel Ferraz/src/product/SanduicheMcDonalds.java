package product;

import factory.AbstractFactory;

public class SanduicheMcDonalds implements Sanduiche {

    private AbstractFactory concreteFactory;

    public SanduicheMcDonalds(AbstractFactory concreteFactory) {
        this.concreteFactory = concreteFactory;
    }


    @Override
    public Sanduiche preparar() {
        System.out.println("Preparando " + concreteFactory.getName());
        return this;
    }
}
