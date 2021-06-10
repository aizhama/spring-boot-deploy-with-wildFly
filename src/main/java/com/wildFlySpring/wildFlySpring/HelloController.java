package com.wildFlySpring.wildFlySpring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
 
    @RequestMapping("/app/{vorname}")
    String getString(@PathVariable String vorname) {
             return "Geben sie bitte Ihre Vorname "+vorname+" !";
              
    }

    @RequestMapping("/app/v1/{nachName}")
    String getNumber(@PathVariable String nachName) {
        return "Geben sie bitte Ihre Nachname "+nachName+" !";

    }
}