package facade;

/**
 * Created by Jary on 2016/6/6.
 */
public class Facade {
    private SubSystemA systemA = new SubSystemA();
    private SubSystemB systemB = new SubSystemB();
    private SubSystemC systemC = new SubSystemC();

    public void Method()
    {
        systemA.MethodA();
        systemB.MethodB();
        systemC.MethodC();
    }

}


class SubSystemA
{
    public void MethodA()
    {
        //业务实现代码
    }
}

class SubSystemB
{
    public void MethodB()
    {
        //业务实现代码
    }
}

class SubSystemC
{
    public void MethodC()
    {
        //业务实现代码
    }
}
