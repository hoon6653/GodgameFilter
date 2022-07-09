package com.cozi.poothrow.mapper;

import com.cozi.poothrow.domain.TestVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from TEST")
    public List<TestVO> testList1();

    public List<TestVO> testList2();

    public void insertTest(TestVO test);

    public void updateTest(TestVO test);

    public void deleteTest(int id);
}
