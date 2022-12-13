package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Department;
import com.example.mysqldemo.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "学院管理")
@RestController
@RequestMapping("/department")
public class DepartmentController {

        @Resource
        private DepartmentService departmentService;


        @GetMapping("/{id}")
        @ApiOperation(value = "查询学院")
        public Result getDepartment(@PathVariable  Integer id) {
            return Result.ok(departmentService.getById(id));
        }


        @GetMapping("/all")
        @ApiOperation(value = "查询全部学院")
        public Result getAllDepartment() {
            return Result.ok(departmentService.list());
        }

        @PostMapping
        @ApiOperation(value = "增加学院")
        public Result addDepartment(@RequestBody Department department) {
            return Result.ok(departmentService.save(department));
        }

        @PutMapping
        @ApiOperation(value = "更新学院")
        public Result updateDepartment(@RequestBody Department department) {
            return Result.ok(departmentService.updateById(department));
        }

        @DeleteMapping
        @ApiOperation(value = "删除学院")
        public Result deleteDepartment(@RequestParam Integer id) {
            return Result.ok(departmentService.removeById(id));
        }
}
