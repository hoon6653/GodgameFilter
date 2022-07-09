package com.cozi.poothrow.web;


import com.cozi.poothrow.domain.TestVO;
import com.cozi.poothrow.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestController {

    @Autowired
    TestMapper testmapper;

    @GetMapping("/Test1")
    public List<TestVO> Test1(){
        System.out.println(testmapper.testList1());
        System.out.println("성공 1");
        return testmapper.testList1();
    }

    @GetMapping("/Test2")
    public List<TestVO> Test2(){
        System.out.println(testmapper.testList2());
        System.out.println("성공 2");
        return testmapper.testList2();
    }

}
