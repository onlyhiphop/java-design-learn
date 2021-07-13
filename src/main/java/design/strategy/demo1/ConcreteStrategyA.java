package design.strategy.demo1;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/7/13 10:42
 */
public class ConcreteStrategyA implements AbstractStrategy {
    @Override
    public void strategyMethod() {
        System.out.println("A策略。。。。");
    }
}
