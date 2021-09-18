package cn.itcast.order.web;

import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId, @RequestHeader() String fzy
            , @RequestHeader() String admin) {
        System.out.println(fzy);
        System.out.println(admin);
        return orderService.queryOrderById(orderId);
    }
}
