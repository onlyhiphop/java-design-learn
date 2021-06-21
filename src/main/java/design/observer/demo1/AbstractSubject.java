package design.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 抽象目标
 * @Author liaobaocai
 * @Date 2021/6/21 15:06
 */
public abstract class AbstractSubject {

    protected List<Observer> observers = new ArrayList<Observer>();

    //添加观察者
    public void add(Observer observer){
        observers.add(observer);
    }

    //删除观察者
    public void remove(Observer observer){
        observers.remove(observer);
    }

    //通知观察者方法
    public abstract void notityObserver();

}
