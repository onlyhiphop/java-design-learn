package design.strategy.demo1;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/7/13 10:44
 */
public class Context {

    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy){
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
