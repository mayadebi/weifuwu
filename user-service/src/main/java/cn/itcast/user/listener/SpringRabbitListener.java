package cn.itcast.user.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SpringRabbitListener {
    @RabbitListener(queues = "simple.queue")
    public void ListEnSimpleQueue(String msg){
        System.out.println("接收到消息"+msg);
    }
}
