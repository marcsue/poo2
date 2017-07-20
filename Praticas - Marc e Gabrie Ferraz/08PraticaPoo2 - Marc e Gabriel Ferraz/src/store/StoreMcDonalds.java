package store;

import factory.AbstractFactory;
import factory.FactoryMcDonalds;
import product.Sanduiche;
import product.SanduicheMcDonalds;

public class StoreMcDonalds implements Store {


    @Override
    public Sanduiche order() {
        AbstractFactory factory = new FactoryMcDonalds();

        return new SanduicheMcDonalds(factory).preparar();
    }
}
