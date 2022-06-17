package com.test.uyiban.freshman.dao;

import com.test.uyiban.freshman.model.TestModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select id, name from test")
    List<TestModel> getAll();

    @Insert("insert into test(name) values(#{name})")
    int insert(@Param("name") String name);
}