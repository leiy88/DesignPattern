package adaptor;

/**
 * Created by Administrator on 2016/5/30.
 */
public class SocketAdapter implements ChineseSocket, JapaneseSocket {
    @Override
    public void supplyPower220V() {
        System.out.println("Supply power 220V");
    }

    @Override
    public void supplyPower110V() {
        supplyPower220V();
    }
}
