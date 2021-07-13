package design.strategy.jdk;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/7/13 10:46
 */
public class MainTest {

    public static void main(String[] args) {
        Person p1 = new Person(2);
        Person p2 = new Person(2);

        System.out.println(p1.compareTo(p2));
    }

}
