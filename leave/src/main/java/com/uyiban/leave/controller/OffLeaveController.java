package com.uyiban.leave.controller;

import com.uyiban.leave.config.ResultDto;
import com.uyiban.leave.model.WorkflowModel;
import com.uyiban.leave.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.redis.core.RedisTemplate;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/leave/admin/offLeave")
public class OffLeaveController {

    @Autowired
    WorkflowService workflowService;

    @RequestMapping("/test")
    public ResultDto<String> test(@RequestParam("Id") String Id) {
        return ResultDto.success(Id);
    }

    @RequestMapping("/getLeaveTypes")
    public List<String> getLeaveTypes(@RequestParam("Id") String Id) {

        WorkflowModel wfRow =  workflowService.findWF(Id);
//        System.out.println(wfRow.getFormJson());

//        JsonObject formJsonObj = JsonParser.parseString(wfRow.getFormJson()).getAsJsonObject();
        JsonArray formJsonArr = JsonParser.parseString(wfRow.getFormJson()).getAsJsonArray();
//        String result  = List<String>;
        ArrayList<String> result = new ArrayList();
//        result.add("test");
//        result.add("我");

        for (JsonElement spawnElement : formJsonArr) {
            JsonObject spawnJson = spawnElement.getAsJsonObject();
            if(spawnJson.getAsJsonObject().get("id").getAsString().equals("LeaveType")){
                System.out.println(spawnJson.get("id"));
                System.out.println(spawnJson.getAsJsonObject("props").getAsJsonArray("options").toString());
//                System.out.println(spawnJson.getAsString());
                JsonArray options = spawnJson.getAsJsonObject("props").getAsJsonArray("options");
                for (int i=0;i<options.size();i++){
                    System.out.println(options.get(i).toString());
                    String item = options.get(i).toString().replace("\"","");
                    result.add(item);

                }
            }

        }
        return result;
    }

}
