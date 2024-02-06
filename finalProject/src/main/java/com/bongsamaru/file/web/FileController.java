package com.bongsamaru.file.web;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bongsamaru.file.service.FileService;

@Controller
public class FileController {
	
    @Autowired
    private FileService fileService;
    
    
    @PostMapping("/uploadsAjax")
    @ResponseBody
    public List<String> uploadFile(@RequestPart MultipartFile[] uploadFiles, String code, int codeNo, String user) {
        try {
            return fileService.uploadFiles(uploadFiles, code, codeNo, user);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // 혹은 적절한 에러 메시지와 함께 응답을 반환
        }
        
    }
}
