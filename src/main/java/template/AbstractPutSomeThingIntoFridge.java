package template;

/**
 * Created by baodinglan on 2016/6/8.
 */
public abstract class AbstractPutSomethingIntoFridge {

    private static boolean fridgeFull;

    public void putIntoFridge(){
        openFridge();
        if(isFridgeFull()){
            getSomethingOut();
        }
        putSomethingIn();
        fridgeFull();
        closeFridge();
    }

    private void openFridge() {
        System.out.println("打开冰箱");
    }

    protected boolean isFridgeFull() {
        return fridgeFull;
    }

    private void getSomethingOut(){
        System.out.println("把东西拿出来");
    }

    protected abstract void putSomethingIn();

    private void fridgeFull() {
        fridgeFull = true;
    }

    private void closeFridge() {
        System.out.println("关上冰箱门");
    }

}
