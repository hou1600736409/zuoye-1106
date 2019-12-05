package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/11/6 17:09
 * @Version     : 1.0
 */
@Controller
public class UploadController {
    @PostMapping("/uploadFile")
    public String fileUpload(@RequestParam("user_name") String userName, @RequestParam("upload_file") List<MultipartFile> fileList) {
        /**
         * 1,文件上传的存放目录
         * 2，给文件重新命名
         */
        if (!fileList.isEmpty() && fileList.size() > 0) {

            String dirPath = "C:/Users/cat/Desktop/";
            File file = new File(dirPath);

            if (!file.exists()) {
                file.mkdirs();
            }
            for (MultipartFile multipartFile : fileList) {
                //拿到文件的原始名
                String originalFileName = multipartFile.getOriginalFilename();
                //文件新的名字
                String newFileName = UUID.randomUUID() + "_" + originalFileName;

                try {
                    if(!multipartFile.isEmpty()) {
                        multipartFile.transferTo(new File(dirPath + userName + "_" + newFileName));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return "error";
        } else {
            return "error";
        }
    }
}
