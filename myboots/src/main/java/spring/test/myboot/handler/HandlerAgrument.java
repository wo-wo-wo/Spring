package spring.test.myboot.handler;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import spring.test.myboot.annotation.AgrumentTest;
import spring.test.myboot.model.PeopelModle;


@Service
public class HandlerAgrument implements HandlerMethodArgumentResolver {


    @Override
    public boolean supportsParameter(MethodParameter parameter) {

        if(parameter.hasParameterAnnotation(AgrumentTest.class)){
            return  true;
        }


        return false;
    }


    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        PeopelModle test =    new PeopelModle();
        test.setAge(123);
        test.setName("测试");

        return test;
    }
}
