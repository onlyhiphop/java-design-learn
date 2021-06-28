package design.observer.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.*;
import org.springframework.stereotype.Component;


/**
 * @Description TODO
 *
 *  自定义一个事件发布器MyEventPublisher
 *  在自定义事件发布器MyEventPublisher中，我们需要通过ApplicationEventPublisher来发布事件，
 *  所以我们实现了ApplicationEventPublisherAware接口，
 *  通过回调方法setApplicationEventPublisher为MyEventPublisher的ApplicationEventPublisher属性赋值；
 *  同样的，我们自定义的事件MyEvent构造函数需要传入Spring上下文，
 *  所以MyEventPublisher还实现了ApplicationContextAware接口，注入了上下文对象ApplicationContext。
 *
 * publishEvent方法发布了一个自定义事件MyEvent
 *
 * @Author liaobaocai
 * @Date 2021/6/28 13:26
 */
@Component
public class MyEventPublisher implements ApplicationEventPublisherAware, ApplicationContextAware {

    private ApplicationContext applicationContext;
    private ApplicationEventPublisher applicationEventPublisher;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    /**
     * 发布事件
     */
    public void publishEvent(){
        System.out.println("开始发布自定义事件---------------");
        MySpringEvent event = new MySpringEvent(applicationContext);
        applicationEventPublisher.publishEvent(event);
        System.out.println("发布自定义事件MySpringEvent结束---------");
    }

}
