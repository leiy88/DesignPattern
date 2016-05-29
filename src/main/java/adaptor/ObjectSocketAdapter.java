package adaptor;

/**
 * Created by Administrator on 2016/5/30.
 */
public class ObjectSocketAdapter implements JapaneseSocket {

    public ChineseSocket chineseSocket;

    @Override
    public void supplyPower110V() {
        chineseSocket.supplyPower220V();
    }

    public ChineseSocket getChineseSocket() {
        return chineseSocket;
    }

    public void setChineseSocket(ChineseSocket chineseSocket) {
        this.chineseSocket = chineseSocket;
    }
}
