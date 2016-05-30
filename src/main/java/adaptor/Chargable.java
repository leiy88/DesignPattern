package adaptor;

/**
 * Created by Administrator on 2016/5/30.
 */
public class Chargable {

    public void charge(JapaneseSocket japaneseSocket){
        japaneseSocket.supplyPower110V();
    }

    public static void main(String[] args) {
        // 类适配器
        Chargable chargable = new Chargable();
        chargable.charge(new SocketAdapter());

        // 对象适配器
        ObjectSocketAdapter objectSocketAdapter = new ObjectSocketAdapter();
        ChineseSocket chineseSocket = new ChineseSocket() {
            @Override
            public void supplyPower220V() {
                System.out.println("Supply power 220V");
            }
        };
        objectSocketAdapter.setChineseSocket(chineseSocket);
        chargable.charge(objectSocketAdapter);
    }
}
