package com.demo.spring.reward.point.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewardsController {

    @GetMapping("/")
    public String getRewards()
    {
        return "Hello your rewards are";
    }
}
