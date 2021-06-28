package design.observer.jdkEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 *
 * 自定义事件发布器
 *
 * @Author liaobaocai
 * @Date 2021/6/28 10:39
 */
public class TaskFinishEventPublisher {

    private List<TaskFinishEventListener> listeners = new ArrayList<>();

    //注册监听器
    public synchronized void register(TaskFinishEventListener listener){
        if(!listeners.contains(listener)){
            listeners.add(listener);
        }
    }

    //移除监听器
    public synchronized boolean remove(TaskFinishEventListener listener){
        return listeners.remove(listener);
    }

    //发布任务结束事件
    public void publishEvent(TaskFinishEvent event){
        for (TaskFinishEventListener listener : listeners) {
            listener.onTaskFinish(event);
        }
    }

}
