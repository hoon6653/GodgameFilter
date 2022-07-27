package com.cozi.ggfilter.mapper;

import com.cozi.ggfilter.domain.TestVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TMapper {

    @Select("select * from TEST")
    public List<TestVO> testList1();

    public List<TestVO> testList2();

}
