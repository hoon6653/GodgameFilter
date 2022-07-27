package com.cozi.ggfilter.web;


import com.cozi.ggfilter.domain.TestVO;
import com.cozi.ggfilter.mapper.TMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestController {
    @Autowired
    TMapper tmapper;

    @GetMapping("/Test1")
    public List<TestVO> Test1(){
        System.out.println(tmapper.testList1());
        System.out.println("성공 1");
        return tmapper.testList1();
    }

    @GetMapping("/Test2")
    public List<TestVO> Test2(){
        System.out.println(tmapper.testList2());
        System.out.println("성공 2");
        return tmapper.testList2();
    }

}