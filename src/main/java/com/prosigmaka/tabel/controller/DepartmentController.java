package com.prosigmaka.tabel.controller;


import com.prosigmaka.tabel.model.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping("/")
    public List<Department> getListDepartment(){
        List<Department> list = listData();
        return list;
    }
    @GetMapping("/{idDept}")
    public Department getByIdDept(@PathVariable int idDept){
        List<Department> list = listData();
        Department department = new Department();
        for (Department d : list){
            if(d.getIdDept() == idDept){
                department = d;
            }
        }
        return department;
    }
    public List<Department> listData(){
        List<Department> list = new ArrayList<>();
        Department d1 = new Department();
        d1.setIdDept(1);
        d1.setDeptName("hrd");
        d1.setIdLocation(1);
        list.add(d1);

        Department d2 = new Department();
        d2.setIdDept(2);
        d2.setDeptName("ob");
        d2.setIdLocation(2);
        list.add(d2);

        Department d3 = new Department();
        d3.setIdDept(3);
        d3.setDeptName("placement");
        d3.setIdLocation(3);
        list.add(d3);

        Department d4 = new Department();
        d4.setIdDept(4);
        d4.setDeptName("comdev");
        d4.setIdLocation(3);
        list.add(d4);

        Department d5 = new Department();
        d5.setIdDept(5);
        d5.setDeptName("recruitment");
        d5.setIdLocation(4);
        list.add(d5);

        return list;
    }

}
