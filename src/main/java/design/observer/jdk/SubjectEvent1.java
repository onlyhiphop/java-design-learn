package design.observer.jdk;

import java.util.Observable;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/6/21 15:41
 */
public class SubjectEvent1 extends Observable {

    public void setChange(){
        setChanged();
        System.out.println("改变------");
    }

}
