package design.observer.jdkEventListener;

import java.util.EventListener;

/**
 * @Description TODO
 *
 * 继承标记接口EventListner表示该接口的实现类是一个监听器,
 * 同时在内部定义了事件发生时的响应方法onTaskFinish(event),接收一个TaskFinishEvent作为参数。
 *
 * @Author liaobaocai
 * @Date 2021/6/28 10:35
 */
public interface TaskFinishEventListener extends EventListener {

    void onTaskFinish(TaskFinishEvent event);

}
