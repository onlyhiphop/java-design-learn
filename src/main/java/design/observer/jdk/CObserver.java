package design.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/6/21 15:42
 */
public class CObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者发现subject改变了------");
    }

}
