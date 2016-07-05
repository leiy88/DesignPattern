package facade;

/**
 * Created by Jary on 2016/6/6.
 */
public class TurnOffFacade {
    private Light light = new Light();
    private Windows windows = new Windows();
    private Door door = new Door();

    public void turnOffAll() {
        light.turnOff();
        windows.close();
        door.close();
    }

    public static void main(String[] args) {
        //use facade
        new TurnOffFacade().turnOffAll();

        //not use
        new Light().turnOff();
        new Windows().close();
        new Door().close();

    }
}

class Light {
    public void turnOff() {
        System.out.println("点灯已经关闭");
    }
}

class Windows {
    public void close() {
        System.out.println("窗户已经关上");
    }
}

class Door {
    public void close() {
        System.out.println("门已经锁上");
    }
}
