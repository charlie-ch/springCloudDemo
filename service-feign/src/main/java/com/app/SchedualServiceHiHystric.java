package com.app;

import org.springframework.stereotype.Component;

/**
 * 断路器的回调类
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "对不起，挂了";
    }
}
