package design.observer.jdkEventListener;

/**
 * @Description TODO
 *
 * 任务结束事件的事件源
 * 因为要对任务执行结束这一事件进行监听,所以必须对任务这一概念进行定义,如下
 *
 * @Author liaobaocai
 * @Date 2021/6/28 10:30
 */
public class Task {

    private String name;
    private TaskFinishStatus status;

    public Task(String name, TaskFinishStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskFinishStatus getStatus() {
        return status;
    }

    public void setStatus(TaskFinishStatus status) {
        this.status = status;
    }
}
enum TaskFinishStatus{
    SUCCESS,
    FAIL
}
