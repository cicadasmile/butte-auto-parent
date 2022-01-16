package com.butte.auto.serve.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServeWeb {
    private static final Logger logger = LoggerFactory.getLogger(ServeWeb.class) ;

    @Value("${server.port:}")
    private Integer servePort ;

    @GetMapping("/serve")
    public String serve (){
        logger.info("serve:{}",servePort);
        return "serve:"+servePort ;
    }

}
