package com.storm.stormweb.config.db;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao {


    @Autowired
    private JBaseDao jBaseDao;

    public JBaseDao getjBaseDao() {
        return jBaseDao;
    }


}
