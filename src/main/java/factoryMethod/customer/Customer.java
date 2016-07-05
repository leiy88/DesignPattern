package factoryMethod.customer;

import factoryMethod.factory.FactoryBMW;
import factoryMethod.factory.FactoryBMW_320;
import factoryMethod.factory.FactoryBMW_X6;
import factoryMethod.product.BMW_320;
import factoryMethod.product.BMW_X6;

/**
 * Created by duhai on 16/5/23.
 */
public class Customer {
    public static void main(String[] args){
        FactoryBMW factoryBMW_320 = new FactoryBMW_320();
        BMW_320 bmw320 = (BMW_320) factoryBMW_320.createBMW();

        FactoryBMW factoryBMW_X6 = new FactoryBMW_X6();
        BMW_X6 bmwX6 = (BMW_X6) factoryBMW_X6.createBMW();
    }
}
