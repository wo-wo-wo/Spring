package com.feign.service.controller;

import com.fegin.feginapi.api.FeignApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("remote/")
public class RemoteClientController implements FeignApi {
    @Override
    public String helloWorld() {
        System.err.println("简单粗暴的feign调用成功了");
        return "成功远程到服务端了";
    }
}
