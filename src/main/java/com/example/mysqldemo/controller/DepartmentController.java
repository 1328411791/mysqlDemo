package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Department;
import com.example.mysqldemo.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/department")
public class DepartmentController {

        @Resource
        private DepartmentService departmentService;


        @GetMapping("/{id}")
        public Result getDepartment(@PathVariable  Integer id) {
            return Result.ok(departmentService.getById(id));
        }


        @GetMapping("/all")
        public Result getAllDepartment() {
            return Result.ok(departmentService.list());
        }

        @PostMapping
        public Result addDepartment(@RequestBody Department department) {
            return Result.ok(departmentService.save(department));
        }

        @PutMapping
        public Result updateDepartment(@RequestBody Department department) {
            return Result.ok(departmentService.updateById(department));
        }

        @DeleteMapping
        public Result deleteDepartment(@RequestParam Integer id) {
            return Result.ok(departmentService.removeById(id));
        }
}
