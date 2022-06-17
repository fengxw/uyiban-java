package com.test.uyiban.freshman.controller.admin;

import com.test.uyiban.freshman.model.TestModel;
import com.test.uyiban.freshman.service.TTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("prototype")
//@RequestMapping("/my/test")
public class TestController {

    private TTestService tTestService;

    @RequestMapping("/select")
    public List<TestModel> select() throws Exception {
        return tTestService.getAll();
    }

    @RequestMapping(value = "/insert")
    public int insert(@RequestParam(value = "name") String name) throws Exception {
        return tTestService.insert(name);
    }
}
