package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jingwang on 22/4/18.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
