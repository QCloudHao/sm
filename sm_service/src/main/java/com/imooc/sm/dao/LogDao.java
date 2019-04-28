package com.imooc.sm.dao;

import com.imooc.sm.entity.Log;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qyh on 2019/4/28.
 */
@Repository("logDao")
public interface LogDao {
    void insert(Log log);
    List<Log> selectByType(String type);
}
