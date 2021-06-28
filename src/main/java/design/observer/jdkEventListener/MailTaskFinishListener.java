package design.observer.jdkEventListener;

/**
 * @Description TODO
 *
 * 邮件服务监听器
 * 该邮件服务监听器将在监听到任务结束事件时将任务的执行结果发送给用户。
 *
 * @Author liaobaocai
 * @Date 2021/6/28 10:37
 */
public class MailTaskFinishListener implements TaskFinishEventListener {

    private String email;

    public MailTaskFinishListener(String email) {
        this.email = email;
    }

    @Override
    public void onTaskFinish(TaskFinishEvent event) {
        System.out.println("Send Email to " + email +
                "Task: " + event.getSource());
    }

}
