package com.storm.stormweb.storm.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/8/26 16:40
 * @Description :
 */
public interface RWSeparation {

    void addUsername(String username);

    List<String> queryUsernameList();
}
