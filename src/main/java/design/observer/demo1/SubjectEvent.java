package design.observer.demo1;

/**
 * @Description 具体目标
 * @Author liaobaocai
 * @Date 2021/6/21 15:12
 */
public class SubjectEvent extends AbstractSubject{


    @Override
    public void notityObserver() {
        System.out.println("具体目标改变-- 通知所有观察者-----");

        //执行观察者的方法
        observers.forEach(Observer::response);
    }


}
