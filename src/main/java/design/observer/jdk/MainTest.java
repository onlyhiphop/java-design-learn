package design.observer.jdk;


/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/6/21 15:43
 */
public class MainTest {
    public static void main(String[] args) {
        SubjectEvent1 subject = new SubjectEvent1();
        subject.addObserver(new CObserver());

        subject.setChange();
        subject.notifyObservers();
    }
}
