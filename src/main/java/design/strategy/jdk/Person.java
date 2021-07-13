package design.strategy.jdk;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/7/13 10:47
 */
public class Person implements Comparable<Person>{

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return o.getAge() - this.age;
    }
}
