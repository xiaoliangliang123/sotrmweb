package com.storm.stormweb.storm.model;

import lombok.Data;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/8/26 17:51
 * @Description :
 */
@Data
public class UsernameModel {


    private String username;

    public UsernameModel(String username){
        this.username = username;
    }



}
