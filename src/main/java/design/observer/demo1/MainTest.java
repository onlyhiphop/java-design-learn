package design.observer.demo1;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/6/21 15:05
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractSubject subject = new SubjectEvent();
        subject.add(new AObserver());
        subject.add(new BObserver());

        subject.notityObserver();
    }
}
