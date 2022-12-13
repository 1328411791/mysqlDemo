package com.example.mysqldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.entity.Department;
import com.example.mysqldemo.mapper.DepartmentMapper;
import com.example.mysqldemo.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {


}
