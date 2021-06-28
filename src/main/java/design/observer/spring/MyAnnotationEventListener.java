package design.observer.spring;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 *
 * 也可手动实现接口
 * @see org.springframework.context.ApplicationListener
 * @Author liaobaocai
 * @Date 2021/6/28 13:53
 */
@Component
public class MyAnnotationEventListener {

    @EventListener
    public void onMyEventPublished(MySpringEvent event){
        System.out.println("收到自定义事件 MySpringEvent--注解方式------");
    }

}
