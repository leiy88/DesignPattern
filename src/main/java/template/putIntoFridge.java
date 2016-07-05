package template;

/**
 * Created by baodinglan on 2016/6/8.
 */
public class PutIntoFridge {
    public static void main(String args[]){
        putElephantIntoFridge();
        putGiraffeIntoFridge();
    }

    public static void putElephantIntoFridge(){
        openFridge();
        putElephantIn();
        closeFridge();
    }

    public static void putGiraffeIntoFridge(){
        openFridge();
        getElephantOut();
        putGiraffeIn();
        closeFridge();
    }

    private static void openFridge() {
        System.out.println("打开冰箱");
    }

    private static void putGiraffeIn() {
        System.out.println("把长颈鹿放进去");
    }

    private static void getElephantOut() {
        System.out.println("把大象拿出来");
    }

    private static void putElephantIn() {
        System.out.println("把大象放进去");
    }

    private static void closeFridge() {
        System.out.println("关上冰箱门");
    }
}
