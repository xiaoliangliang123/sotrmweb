package com.storm.stormweb;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/8/17 13:07
 * @Description :
 */
public class RegularTester {


    @Test
    public void testMatch(){
        String sql = " and ( housecode='12000001' and oldhousecode='01-001-01-01-01' )  or  ( housecode='12000002' and oldhousecode='01-001-01-01-02' )  ";
        Pattern p=Pattern.compile("(\\s)(.*?)(=|>=|like)");
        Matcher m=p.matcher(sql);
    }


    @Test
    public void testSqlMatch(){

        String tableName = "customername";
        List<String>  keys= new ArrayList<String>(7);

        String sql = " and ( housecode='12000001' and oldhousecode='01-001-01-01-01' )  or  ( housecode='12000002' and oldhousecode='01-001-01-01-02' )  ";
        Pattern p=Pattern.compile("(\\s)(.*?)(=|>=|like)");
        Matcher m=p.matcher(sql);

        while(m.find()) {
            String column = m.group().replace("and","").replace(">=","")
                    .replace("(","").replace("=","").replace("<=","")
                    .replace("or","").replace("like","").replace(")","");
            keys.add(column.trim());
        }
        Iterator<String> colIterator = keys.iterator();
        while (colIterator.hasNext()){

            String column = colIterator.next();
            column = column.trim();
            System.out.println("column:"+column);
            sql = sql.replace(" "+column," "+tableName+"."+column);
        }
        System.out.println(sql);
    }
}
