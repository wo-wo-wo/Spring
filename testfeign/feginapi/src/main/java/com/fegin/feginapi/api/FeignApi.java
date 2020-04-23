package com.fegin.feginapi.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface FeignApi {
    @GetMapping({"helloWorld"})
    String helloWorld();

}
