package com.uyiban.freshman.controller;

import com.github.pagehelper.PageInfo;
import com.uyiban.freshman.model.DormitoryModel;
import com.uyiban.freshman.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/freshman/dormitories")
public class DormitoryController {

    @Autowired
    DormitoryService dormitoryService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/fetchList")
    public PageInfo<DormitoryModel> getDormitories(
            @RequestParam(value = "page",defaultValue = "1", required = false) Integer page,
            @RequestParam(value = "pageSize",defaultValue = "10", required = false) Integer pageSize,
            @RequestParam(value = "number",defaultValue = "", required = false) String number
    ) {

        return dormitoryService.getDormitories(page, pageSize, number);
//        $params = $this -> di -> request -> get();
//        $page = intval($params['page'] ? ? 1);
//        $pageSize = intval($params['pageSize'] ? ? 10);
//
//        $condition = $this -> getCondition($params);
//        if ($condition == false) {
//            return $this -> di -> utils -> pagination([],0, $page, $pageSize);
//        }
//        // 公寓查询
//        $dormitoryModel = DormitoryModel::getInstance ();
//        $field = 'StudentId, BuildingNo, BunkNo, DormitoryNo';
//        list($list, $total) = $dormitoryModel -> pagingDormitoryList($condition, $field, $page, $pageSize,[['CreatedAt', 'Desc'], [
//        'StudentId', 'Asc']]);
//
//        return $this -> di -> utils -> pagination($list, $total, $page, $pageSize);
//        return ;
//        return null;
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
