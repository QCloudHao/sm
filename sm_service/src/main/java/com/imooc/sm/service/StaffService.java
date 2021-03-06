package com.imooc.sm.service;

import com.imooc.sm.entity.Staff;

import java.util.List;

/**
 * Created by qyh on 2019/4/27.
 */
public interface StaffService {
    void add(Staff staff);
    void remove(Integer id);
    void edit(Staff staff);
    Staff get(Integer id);
    List<Staff> getAll();
}
