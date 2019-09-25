package com.example.springSecuritySimpleDemo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class SpringSecuritySimpleDemoHandler {

    public Mono<ServerResponse> helloUser(ServerRequest request){
        System.out.println("Inside handler");
        return ServerResponse.ok()
                .body(BodyInserters.fromObject("Hello User!!"));
    }

    public Mono<ServerResponse> helloAdmin(ServerRequest request){
        System.out.println("Inside handler");
        return ServerResponse.ok()
                .body(BodyInserters.fromObject("Hello Admin!!"));
    }
}
