package com.imooc.sm.service;

import com.imooc.sm.entity.Log;

import java.util.List;

/**
 * Created by qyh on 2019/4/28.
 */
public interface LogService {
    void addSystemLog(Log log);
    void addLoginLog(Log log);
    void addOperationLog(Log log);

    List<Log> getSystemLog();
    List<Log> getLoginLog();
    List<Log> getOperationLog();
}
