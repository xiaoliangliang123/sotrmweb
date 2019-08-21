package com.storm.stormweb.storm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/8/19 09:13
 * @Description :
 */
@Controller
@RequestMapping("/strom")
public class IndexController {
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/index")
    public String index(){

        logger.info("test");
        return "index";
    }
}
