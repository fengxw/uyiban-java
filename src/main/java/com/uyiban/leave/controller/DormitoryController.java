package com.uyiban.leave.controller;

import com.github.pagehelper.PageInfo;
import com.uyiban.leave.model.DormitoryModel;
import com.uyiban.leave.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/freshman/dormitories")
public class DormitoryController {

    @Autowired
    DormitoryService dormitoryService;

    @GetMapping("/fetchList")
    public PageInfo<DormitoryModel> getDormitories(@RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {

//        int offset = (page - 1) * pageSize;
//        int limit = pageSize;
//
        return dormitoryService.getDormitories(page, pageSize);

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



    @RequestMapping("/test")
    public String test() {
        return "cccc";
    }
}
