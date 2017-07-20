package store;

import factory.AbstractFactory;
import factory.FactoryBurgerKing;
import product.Sanduiche;
import product.SanduicheBurgerKing;

public class StoreBurgerKing implements Store{


    @Override
    public Sanduiche order() {
        AbstractFactory factory = new FactoryBurgerKing();

        return new SanduicheBurgerKing(factory).preparar();
    }
}
