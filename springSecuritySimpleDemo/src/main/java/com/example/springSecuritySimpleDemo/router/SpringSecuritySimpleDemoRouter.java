package com.example.springSecuritySimpleDemo.router;

import com.example.springSecuritySimpleDemo.handler.SpringSecuritySimpleDemoHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class SpringSecuritySimpleDemoRouter {

    private SpringSecuritySimpleDemoHandler handler;

    @Autowired
    public SpringSecuritySimpleDemoRouter(SpringSecuritySimpleDemoHandler handler) {
        this.handler = handler;
    }

    @Bean
    public RouterFunction<ServerResponse> initCustomeRoutes(){
        System.out.println("Inside Router method");
        return RouterFunctions.route(RequestPredicates.GET("/helloUser"),
                handler::helloUser).
                andRoute(RequestPredicates.GET("/helloAdmin"),
                        handler::helloAdmin);
    }

}