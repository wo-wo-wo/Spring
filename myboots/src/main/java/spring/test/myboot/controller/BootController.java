package spring.test.myboot.controller;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.util.concurrent.RateLimiter;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.alibaba.fastjson.JSON;
import spring.test.myboot.annotation.AgrumentTest;
import spring.test.myboot.handler.TestHandler;
import spring.test.myboot.model.PeopelModle;
import spring.test.myboot.service.SpringBootService;


//@Controller
@RestController
@RequestMapping("test/")
public class BootController {

    private final  static Logger logger = LoggerFactory.getLogger(TestHandler.class);

    private final static RateLimiter rateLimiter = RateLimiter.create(10); 
    @Autowired
    private SpringBootService services;

    @GetMapping("getSucess")
    public String getSucess(){


        return "我终于成功了";

    }

    public static void main(String[] args) {
        HashFunction hs = Hashing.murmur3_128();

        Hasher s = hs.newHasher().putString("https://h5.dingtalk.com/open-market/skuInApp.html?dtaction=os&corpId=dinged4828346906753435c2f4657eb6378f&articleCode=DD_GOODS-373001&token=9b72dcd890a8414794b42c9bbeaf7084&", Charsets.UTF_8);

        HashCode c = s.hash();

        long l = c.asLong();

        System.out.println(Long.toUnsignedString(l,64));




    }

}
