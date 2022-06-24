package com.uyiban.freshman.controller;

import com.uyiban.freshman.model.DormitoryModel;
import com.uyiban.freshman.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/freshman/dormitories")
public class DormitoryController {

    @Autowired
    DormitoryService dormitoryService;

    @GetMapping("/fetchList")
    public List<DormitoryModel> getDormitories(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {


        int offset = (page - 1) * pageSize;
        int limit = pageSize;
        return dormitoryService.getDormitories(offset, limit);

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
}
