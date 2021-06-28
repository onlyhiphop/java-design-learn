package design.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/6/28 13:21
 */
public class MySpringEvent extends ApplicationEvent {
    /**
     *
     * @param source 当前事件的事件源，一般传入Spring的context上下文对象即可
     */
    public MySpringEvent(Object source) {
        super(source);
    }
}
