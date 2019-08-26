package com.storm.stormweb.storm;

import com.storm.stormweb.storm.service.RWSeparation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/8/26 16:03
 * @Description :
 */
@RequestMapping("/rwSeparation")
@Controller
public class RWSeparationController {

    @Resource(name = "rwSeparation")
    private RWSeparation rwSeparation;

    @RequestMapping("/init")
    public String index() {
        return "/strom/rwSeparationIndex";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestParam Map<String, String> map) {

        String username = map.get("username");
        rwSeparation.addUsername(username);
        return "redirect:/rwSeparation/query";
    }

    @RequestMapping("/query")
    public String query(HttpServletRequest request) {

        List<String> usernames = rwSeparation.queryUsernameList();
        request.setAttribute("names",usernames);
        return "/strom/rwSeparationList";
    }

}
