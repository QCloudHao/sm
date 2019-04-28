package com.imooc.sm.service;

import com.imooc.sm.entity.Staff;

/**
 * Created by qyh on 2019/4/28.
 */
public interface SelfService {
    Staff login(String account, String password);
    void changePassword(Integer id, String password);
}
