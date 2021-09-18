package cn.itcast.order;

//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;
import cn.itcast.order.config.FeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
// 开启http客户端自动装配
@EnableFeignClients(defaultConfiguration = FeignConfig.class)
@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    // 创建RestTemplate 注册到bean  这个是用来发http请求
//    @Bean
//    // 设置负载均衡
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

    //负载均很策略  默认轮询
    // 这里是全局配置所有调用的服务都会生效
//    @Bean
//    // 随机
//    public IRule randomRule(){
//        return new RandomRule();
//    }
}