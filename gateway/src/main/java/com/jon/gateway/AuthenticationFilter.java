package com.jon.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;


@Slf4j
@Component
@RefreshScope  // ??
public class AuthenticationFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();

        // not need
        String path = request.getURI().getPath();
        if(path.contains("/user") || path.contains("/token")){
            return chain.filter(exchange);
        }
        List<String> token = request.getHeaders().get("token");


        // 如果 token 对 或者 routes 不需要 验证 （login/ signup）
        if( JwtUtil.tokenValid(token.get(0))){
            System.out.println("没毛病");
            System.out.println(token);
            // 放行
            return chain.filter(exchange);
        }
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        return response.setComplete();  // 直接返回
    }
}
