package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2017/5/6.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
