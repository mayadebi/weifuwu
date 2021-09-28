package cn.itcast.user.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SpringRabbitListener {
//    @RabbitListener(queues = "simple.queue")
//    public void ListEnSimpleQueue(String msg){
//        System.out.println("接收到消息"+msg);
//    }
    @RabbitListener(queues = "simple.queue")
    public void ListEnSimpleQueue(String msg) throws InterruptedException {
        System.out.println("消费者1接收到消息"+msg);
        Thread.sleep(20);
    }
    @RabbitListener(queues = "simple.queue")
    public void ListEnSimpleQueue2(String msg) throws InterruptedException {
        System.out.println("消费者22222222222接收到消息"+msg);
        Thread.sleep(200);
    }
}
