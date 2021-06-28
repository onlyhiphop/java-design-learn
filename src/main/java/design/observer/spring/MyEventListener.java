package design.observer.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * 手动实现ApplicationListener接口来实现事件的监听（泛型为监听的事件类型）
 * 也可以用注解方式
 * @see org.springframework.context.event.EventListener
 *
 * @Author liaobaocai
 * @Date 2021/6/28 13:46
 */
@Component
public class MyEventListener implements ApplicationListener<MySpringEvent> {
    @Override
    public void onApplicationEvent(MySpringEvent event) {
        System.out.println("收到自定义事件 MySpringEvent....手动实现..");
    }
}
