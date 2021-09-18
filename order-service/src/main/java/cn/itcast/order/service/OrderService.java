package cn.itcast.order.service;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import com.fzy.feign.clients.UserClient;
import com.fzy.feign.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserClient userClient;
    // 注入RestTemplate
//    @Autowired
//    private RestTemplate restTemplate;
    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 使用feign调用
        User user = userClient.findById(order.getUserId());
//        // 设置url
//        String url = "http://userservice/user/"+order.getUserId();
//        // 发起http请求
//        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        // 4.返回
        return order;
    }
}
