package com.prosigmaka.tabel.controller;


import com.prosigmaka.tabel.model.Personal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    @GetMapping("/")
    public List<Personal> getListPersonal(){
        List<Personal> list = listData();
        return list;

    }
    @GetMapping("/{fname}")
    public Personal getByFname(@PathVariable String fname){
        List<Personal> list = listData();
        Personal personal = new Personal();
        for(Personal p : list){
            if(p.getfName().equalsIgnoreCase(fname)){
                personal = p;
            }
        }
        return personal;
    }
    public List<Personal> listData(){
        List<Personal> list = new ArrayList<>();
            Personal p1 = new Personal();
            p1.setIdPersonal("1");
            p1.setfName("adi");
            p1.setlName("munadi");
            p1.setbDate(null);
            p1.setAddress("jakarta");
            p1.setIdDept("1");
            list.add(p1);

            Personal p2 = new Personal();
            p2.setIdPersonal("2");
            p2.setfName("andika");
            p2.setlName("santoso");
            p2.setbDate(null);
            p2.setAddress("jakarta");
            p2.setIdDept("3");
            list.add(p2);

            Personal p3 = new Personal();
            p3.setIdPersonal("3");
            p3.setfName("fajar");
            p3.setlName("kurniawati");
            p3.setbDate(null);
            p3.setAddress("jakarta");
            p3.setIdDept("5");
            list.add(p3);

            Personal p4 = new Personal();
            p4.setIdPersonal("4");
            p4.setfName("fauzan");
            p4.setlName("umsohi");
            p4.setbDate(null);
            p4.setAddress("jakarta");
            p4.setIdDept("4");
            list.add(p4);

            Personal p5 = new Personal();
            p5.setIdPersonal("5");
            p5.setfName("magriby");
            p5.setlName("farmadi");
            p5.setbDate(null);
            p5.setAddress("jakarta");
            p5.setIdDept("5");
            list.add(p5);

            Personal p6 = new Personal();
            p6.setIdPersonal("6");
            p6.setfName("fajar");
            p6.setlName("ramadhan");
            p6.setbDate(null);
            p6.setAddress("bandung");
            p6.setIdDept("5");
            list.add(p6);

            Personal p7 = new Personal();
            p7.setIdPersonal("7");
            p7.setfName("ade");
            p7.setlName("nurusani");
            p7.setbDate(null);
            p7.setAddress("bandung");
            p7.setIdDept("4");
            list.add(p7);

            Personal p8 = new Personal();
            p8.setIdPersonal("8");
            p8.setfName("al");
            p8.setlName("ayyubi");
            p8.setbDate(null);
            p8.setAddress("bandung");
            p8.setIdDept("4");
            list.add(p8);

            Personal p9 = new Personal();
            p9.setIdPersonal("9");
            p9.setfName("reja");
            p9.setlName("nugraha");
            p9.setbDate(null);
            p9.setAddress("bogor");
            p9.setIdDept("3");
            list.add(p9);

            Personal p10 = new Personal();
            p10.setIdPersonal("10");
            p10.setfName("setyanto");
            p10.setlName("putra");
            p10.setbDate(null);
            p10.setAddress("bogor");
            p10.setIdDept("1");
            list.add(p10);

            Personal p11 = new Personal();
            p11.setIdPersonal("11");
            p11.setfName("teguh");
            p11.setlName("wijoseno");
            p11.setbDate(null);
            p11.setAddress("bogor");
            p11.setIdDept("3");
            list.add(p11);

            Personal p12 = new Personal();
            p12.setIdPersonal("12");
            p12.setfName("vincencius");
            p12.setlName("gultom");
            p12.setbDate(null);
            p12.setAddress("bogor");
            p12.setIdDept("4");
            list.add(p12);

            Personal p13 = new Personal();
            p13.setIdPersonal("13");
            p13.setfName("yustar");
            p13.setlName("pramudana");
            p13.setbDate(null);
            p13.setAddress("bogor");
            p13.setIdDept("5");
            list.add(p13);

            return list;

    }
}
