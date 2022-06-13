package com.test.uyiban.freshman.controller.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NoticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoticeApplication.class, args);
    }

    @RequestMapping("/freshman/admin/notice/detail")
    public String detail()
    {
        System.out.println("first java api");
//        $batch = BatchModel::getInstance()->findOneBy([
//            'UniversityId' => $this->universityId,
//            'Id' => $batchId,
//        ]);
//        if (empty($batch)) {
//            throw new OutputException('批次不存在');
//        }
//        $batch['EducationLevel'] = json_decode($batch['EducationLevel'], true);
//
//        $notice = NoticeModel::getInstance()->findBy([
//            'UniversityId' => $this->universityId,
//            'BatchId' => $batchId,
//        ], 'EducationLevel, Title, Content, Attachments');
//
//        foreach ($notice as &$item) {
//        if (!empty($item['Attachments'])) {
//            $item['Attachments'] = json_decode($item['Attachments'], true);
//        }
//    }
//        $batch['Notice'] = $notice;
        return "batchId";
    }
}
