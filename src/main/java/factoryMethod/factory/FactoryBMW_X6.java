package factoryMethod.factory;

import factoryMethod.product.BMW_X6;

/**
 * Created by duhai on 16/5/23.
 */
public class FactoryBMW_X6 implements FactoryBMW {

    @Override
    public BMW_X6 createBMW() {
        return new BMW_X6();
    }
}
