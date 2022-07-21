package com.uyiban.leave.controller;

import com.uyiban.leave.model.WorkflowModel;
import com.uyiban.leave.service.StudentService;
import com.uyiban.leave.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

@RestController
@RequestMapping("/leave/admin/offLeave")
public class OffLeaveController {

    @Autowired
    WorkflowService workflowService;

    @RequestMapping("/getLeaveTypes")
    public String getLeaveTypes(@RequestParam("Id") String Id) {
        System.out.println("ddd");

        WorkflowModel wfRow =  workflowService.findWF(Id);
        System.out.println(wfRow.getFormJson());

//        JsonObject formJsonObj = JsonParser.parseString(wfRow.getFormJson()).getAsJsonObject();
        JsonArray formJsonArr = JsonParser.parseString(wfRow.getFormJson()).getAsJsonArray();
//        formJsonObj.get()
//        System.out.println(formJsonArr);
        for (JsonElement spawnElement : formJsonArr) {
            JsonObject spawnJson = spawnElement.getAsJsonObject();
//            String spawnJsonStr = spawnElement.getAsString();

            if(spawnJson.getAsJsonObject().get("id").getAsString().equals("LeaveType")){
                System.out.println("dddd ");
                System.out.println(spawnJson.get("id"));
                System.out.println(spawnJson.getAsJsonObject("props"));
//                System.out.println(spawnJson.getAsString());

//                return "ddddddd";

            }

        }
        return "dddd";
    }
}
