package com.prosigmaka.tabel.controller;


import com.prosigmaka.tabel.model.DeptLoc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/department_location")
public class DeptLocController {

    @GetMapping("/")
    public List<DeptLoc> getListDeptLoc(){
        List<DeptLoc> list = listData();
        return list;
    }

    @GetMapping("/{idLoc}")
    public DeptLoc getByDeptLoc(@PathVariable int idLoc){
        List<DeptLoc> list = listData();
        DeptLoc deptloc = new DeptLoc();
        for(DeptLoc d : list){
            if(d.getIdLocation() == idLoc){
                deptloc = d;
            }
        }
        return deptloc;
    }

    public List<DeptLoc> listData(){
        List<DeptLoc> list = new ArrayList<>();
        DeptLoc d1 =new DeptLoc();
        d1.setIdLocation(1);
        d1.setDeptLocation("lantai 6");
        list.add(d1);

        DeptLoc d2 =new DeptLoc();
        d2.setIdLocation(2);
        d2.setDeptLocation("lantai 5");
        list.add(d2);

        DeptLoc d3 =new DeptLoc();
        d3.setIdLocation(3);
        d3.setDeptLocation("lantai 4");
        list.add(d3);

        DeptLoc d4 =new DeptLoc();
        d4.setIdLocation(5);
        d4.setDeptLocation("lantai 2");
        list.add(d4);

        return list;
    }
}
