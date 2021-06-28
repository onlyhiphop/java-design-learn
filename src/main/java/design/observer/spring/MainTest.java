package design.observer.spring;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description TODO
 *
 * 基于JDK的支持要实现对自定义事件的监听还是比较麻烦的,要做的工作比较多。
 * 而且自定义的事件发布器也不能提供对所有事件的统一发布支持。
 * 基于Spring框架实现自定义事件监听则要简单很多,功能也更加强大。
 *
 * @see ApplicationListener
 * @see ApplicationEvent
 * @see ApplicationEventPublisher
 *
 * @Author liaobaocai
 * @Date 2021/6/28 11:21
 */
@ComponentScan("design.observer.spring")
public class MainTest {


    @Test
    public void testEvent(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);
        MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
        publisher.publishEvent();
    }

}
