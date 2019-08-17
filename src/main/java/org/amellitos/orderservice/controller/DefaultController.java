package org.amellitos.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rmabini on 8/16/2019.
 */
@RestController
public class DefaultController {

    @RequestMapping(value = "/")
    public String defaultController(){
        return "Welcome to Order System";
    }
}
