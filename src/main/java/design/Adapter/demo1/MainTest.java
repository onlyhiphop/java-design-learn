package design.Adapter.demo1;

/**
 * @Description 类适配器
 * @Author liaobaocai
 * @Date 2021/7/13 13:31
 */
public class MainTest {

    public static void main(String[] args) {
        Phone p = new Phone();
        CommonTarget c = new TypeCAdapter(p);
        c.recharge();
    }

}
