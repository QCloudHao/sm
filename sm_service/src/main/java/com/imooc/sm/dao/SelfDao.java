package com.imooc.sm.dao;

import com.imooc.sm.entity.Staff;
import org.springframework.stereotype.Repository;

/**
 * Created by qyh on 2019/4/28.
 */
@Repository("selfDao")
public interface SelfDao {
    Staff selectByAccount(String account);
}
