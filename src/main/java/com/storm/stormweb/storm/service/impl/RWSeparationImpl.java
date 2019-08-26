package com.storm.stormweb.storm.service.impl;

import com.storm.stormweb.config.db.JBaseDao;
import com.storm.stormweb.storm.model.UsernameModel;
import com.storm.stormweb.storm.service.RWSeparation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/8/26 16:41
 * @Description :
 */
@Service("rwSeparation")
public class RWSeparationImpl implements RWSeparation {

    @Autowired
    private JBaseDao jBaseDao;

    @Override
    public void addUsername(String username) {

        String sql = "insert into username values('"+username+"')";
        jBaseDao.update(sql);
    }

    @Override
    public List<String> queryUsernameList() {

        String sql = "select * from  username";
        List<UsernameModel> mapList = jBaseDao.queryForList(sql,UsernameModel.class);
        List<String> names =mapList.stream().map(UsernameModel::getUsername).collect(Collectors.toList());
        return names;
    }
}
