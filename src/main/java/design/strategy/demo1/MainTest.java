package design.strategy.demo1;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/7/13 10:41
 */
public class MainTest {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.strategyMethod();


        Context context2 = new Context(new ConcreteStrategyB());
        context2.strategyMethod();
    }
}
