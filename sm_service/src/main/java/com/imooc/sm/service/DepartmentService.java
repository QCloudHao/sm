package com.imooc.sm.service;

import com.imooc.sm.entity.Department;

import java.util.List;

/**
 * Created by qyh on 2019/4/26.
 */
public interface DepartmentService {
    void add(Department department);
    void remove(Integer id);
    void edit(Department department);
    Department get(Integer id);
    List<Department> getAll();
}
