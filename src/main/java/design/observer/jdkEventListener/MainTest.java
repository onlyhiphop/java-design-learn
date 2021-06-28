package design.observer.jdkEventListener;

/**
 * @Description TODO
 *
 * 想象我们正在做一个关于Spark的任务调度系统,我们需要把任务提交到集群中并监控任务的执行状态,
 * 当任务执行完毕(成功或者失败),除了必须对数据库进行更新外,还可以执行一些额外的工作:比如将任务执行结果以邮件的形式发送给用户。
 * 这些额外的工作后期还有较大的变动可能:比如还需要以短信的形式通知用户,
 * 对于特定的失败任务需要通知相关运维人员进行排查等等,所以不宜直接写死在主流程代码中。
 * 最好的方式自然是以事件监听的方式动态的增删对于任务执行结果的处理逻辑。
 * 为此我们可以基于JDK提供的事件框架,打造一个能够对任务执行结果进行监听的弹性系统。
 *
 * @Author liaobaocai
 * @Date 2021/6/28 10:24
 */
public class MainTest {

    public static void main(String[] args) {

        //事件源
        Task source = new Task("用户统计", TaskFinishStatus.SUCCESS);

        //任务结束事件
        TaskFinishEvent event = new TaskFinishEvent(source);

        //邮件服务器
        MailTaskFinishListener mailTaskFinishListener = new MailTaskFinishListener("xxx.com");

        //事件发布器
        TaskFinishEventPublisher publisher = new TaskFinishEventPublisher();

        //注册邮件服务器监听器
        publisher.register(mailTaskFinishListener);

        //发布事件
        publisher.publishEvent(event);
    }

}
