package com.zking.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zk on 17.5.9.
 */
@Controller
public class FirstControllerForTest {

    @RequestMapping("/")
    public String indexTest() {
        return "index";
    }
}
