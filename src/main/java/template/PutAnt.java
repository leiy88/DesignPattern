package template;

/**
 * Created by baodinglan on 2016/6/8.
 */
public class PutAnt extends AbstractPutSomethingIntoFridge{

    @Override
    protected void putSomethingIn() {
        System.out.println("把蚂蚁放进去");
    }

    @Override
    protected boolean isFridgeFull(){
        return false;
    }
}
