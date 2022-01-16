package com.butte.auto.client.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientWeb {

    private static final Logger logger = LoggerFactory.getLogger(ClientWeb.class) ;

    @Value("${server.port:}")
    private Integer clientPort ;

    @Value("${dev.param:}")
    private String appEnv ;

    @GetMapping("/client")
    public String client (){
        logger.info("client:{}",clientPort);
        return "client:"+clientPort+" ; config:"+appEnv;
    }

}
