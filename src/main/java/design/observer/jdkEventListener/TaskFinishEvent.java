package design.observer.jdkEventListener;

import java.util.EventObject;

/**
 * @Description TODO
 *
 * 任务结束事件TaskFinishEvent
 * 自定义事件类型TaskFinishEvent继承自JDK中的EventObject,构造时会传入Task作为事件源。
 *
 * @Author liaobaocai
 * @Date 2021/6/28 10:33
 */
public class TaskFinishEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TaskFinishEvent(Object source) {
        super(source);
    }
}
