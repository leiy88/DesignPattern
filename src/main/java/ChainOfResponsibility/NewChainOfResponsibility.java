package ChainOfResponsibility;

/**
 * Created by baodinglan on 2016/6/12.
 */
public class NewChainOfResponsibility {
    public static void main(String args[]){
        PoliceStation policeBlackCat = initChain();
        policeBlackCat.call();
    }

    private static PoliceStation initChain() {
        PoliceStation police = new Police();
        PoliceStation capWhiteCat = new CapWhiteCat();
        capWhiteCat.setHandler(police);

        PoliceStation capDove = new CapDove();
        capDove.setHandler(capWhiteCat);

        PoliceStation policeBlackCat = new PoliceBlackCat();
        policeBlackCat.setHandler(capDove);

        return policeBlackCat;
    }
}
