package com.storm.stormweb.swf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/8/15 09:06
 * @Description :
 */
@Controller
@RequestMapping("/swf")
public class SwfController {

    @RequestMapping("/camera")
    public String camera(){
        return "cameraPlayer";
    }
}
