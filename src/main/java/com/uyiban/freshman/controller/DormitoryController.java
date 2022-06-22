package com.uyiban.freshman.controller;

import com.uyiban.freshman.model.DormitoryModel;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DormitoryController {

    public List<DormitoryModel> fetchList() {


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
        return ;
    }
}
