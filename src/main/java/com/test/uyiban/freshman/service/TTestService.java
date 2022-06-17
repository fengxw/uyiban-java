package com.test.uyiban.freshman.service;

import com.test.uyiban.freshman.dao.TestMapper;
import com.test.uyiban.freshman.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTestService {

//    private TestMapper testMapper;
//
//    @Autowired
//    public void setTestMapper (TestMapper testMapper) {
//        this.testMapper = testMapper;
//    }

    final TestMapper testMapper;

    public TTestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public List<TestModel> getAll() {
        return testMapper.getAll();
    }

    public int insert(String name) {
        return testMapper.insert(name);
    }
}
