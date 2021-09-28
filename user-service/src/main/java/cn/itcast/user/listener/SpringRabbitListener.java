package cn.itcast.user.listener;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
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
    @RabbitListener(queues = "fanout.queue1")
    public void ListEnSimpleQueue3(String msg) throws InterruptedException {
        System.out.println("消费者33333接收到消息"+msg);
        Thread.sleep(20);
    }
    @RabbitListener(queues = "fanout.queue2")
    public void ListEnSimpleQueue4(String msg) throws InterruptedException {
        System.out.println("消费者44444接收到消息"+msg);
        Thread.sleep(200);
    }
    // 使用direct交换机
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queue1"),  // 队列名称
            exchange = @Exchange(name = "itcast.direct",type = ExchangeTypes.DIRECT),  // 交换机名称
            key = {"fzy","fzy2"}
    ))
    public void listDirectQueue(String msg){
        System.out.println("消费者5555接收到消息"+msg);
    }
    // 使用direct交换机
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queue2"),  // 队列名称
            exchange = @Exchange(name = "itcast.direct",type = ExchangeTypes.DIRECT),  // 交换机名称
            key = {"fzy","fzy3"}
    ))
    public void listDirectQueue2(String msg){
        System.out.println("消费者6666接收到消息"+msg);
    }
}

