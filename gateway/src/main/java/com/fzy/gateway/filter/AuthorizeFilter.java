package com.fzy.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
// 全局过滤器
@Component
// 定义过滤器顺序  值越小越先执行
@Order(0)
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//        MultiValueMap<String, String> queryParams = request.getQueryParams();
//        String authorization = queryParams.getFirst("authorization");
//        if("admin".equals(authorization)){
//            // 放行
//           return chain.filter(exchange);
//        }
//        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        // 拦截
//        return exchange.getResponse().setComplete();
        return chain.filter(exchange);
    }
}
