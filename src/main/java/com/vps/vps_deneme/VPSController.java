package com.vps.vps_deneme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VPSController {

    @GetMapping("/deneme")
    public String Vps(){
        return "MERHABA";
    }
}
