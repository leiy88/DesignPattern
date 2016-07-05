package factoryMethod.factory;

import factoryMethod.product.BMW_320;

/**
 * Created by duhai on 16/5/23.
 */
public class FactoryBMW_320 implements FactoryBMW {

    @Override
    public BMW_320 createBMW() {
        return new BMW_320();
    }
}
