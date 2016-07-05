package template;

/**
 * Created by baodinglan on 2016/6/8.
 */
public class NewPutIntoFridge {
    public static void main(String args[]){
        AbstractPutSomethingIntoFridge putE = new PutElephant();
        AbstractPutSomethingIntoFridge putG = new PutGiraffe();
        //AbstractPutSomethingIntoFridge putA = new PutAnt();

        putE.putIntoFridge();
        putG.putIntoFridge();
        //putA.putIntoFridge();
    }
}
