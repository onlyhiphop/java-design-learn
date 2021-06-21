package design.observer.demo1;

/**
 * @Description 观察者
 * @Author liaobaocai
 * @Date 2021/6/21 15:16
 */
public class AObserver implements Observer {
    @Override
    public void response() {
        System.out.println("A观察者改变---------");
    }
}

class BObserver implements Observer{

    @Override
    public void response() {
        System.out.println("B观察者改变---------");
    }
}
