package com.example.httpsApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class SimpleController {
    @GetMapping("/sellerList")
    public String getSellersList() {
        return "hello you made it but you're still an idiot";
    }
}