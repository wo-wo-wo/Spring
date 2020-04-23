package com.fegin.client.controller;

import com.fegin.feginapi.api.RemoteApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client/")
public class ClientController {

    @Autowired
    private RemoteApi remoteApi;

    @GetMapping("getRequestService")
    public  String getRequestService(){

      return   remoteApi.helloWorld();

    }


    @GetMapping("getLocal")
    public String getLocal(){

        return "本地调用成功了";
    }

}
