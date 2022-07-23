package com.uyiban.freshman.controller;

import com.github.pagehelper.PageInfo;
import com.uyiban.freshman.model.DormitoryModel;
import com.uyiban.freshman.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/freshman/dormitories")
public class DormitoryController {

    @Autowired
    DormitoryService dormitoryService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/{id}")
    public DormitoryModel getDormitory(@PathVariable("id") Integer id) {
        return dormitoryService.getDormitoryById(id);
    }
    @GetMapping("/fetchList")
    public PageInfo<DormitoryModel> getDormitories(
            @RequestParam(value = "page",defaultValue = "1", required = false) int page,
            @RequestParam(value = "pageSize",defaultValue = "10", required = false) int pageSize,
            @RequestParam(value = "number",defaultValue = "", required = false) String number
    ) {

        return dormitoryService.getDormitories(page, pageSize, number);
    }

    @PostMapping("/{id}")
    public Object updateStudentNo(@PathVariable("id") int id, @RequestBody Map payload) {
        dormitoryService.updateStudentNoById(id, (String) payload.get("StudentNo"));
        
        return null;
    }

    @GetMapping("/redis/string")
    public String StringRedisTest() {

        stringRedisTemplate.opsForValue().set("test_redis", "fuck java");

        return stringRedisTemplate.opsForValue().get("test_redis");
    }

    @GetMapping("/redis/template")
    public Object RedisTest() {
        redisTemplate.opsForValue().set("test_redis_1", "fuck java again");

        return redisTemplate.opsForValue().get("test_redis_1");
    }

    @RequestMapping("/test")
    public String test() {
        return "cccc";
    }
}
