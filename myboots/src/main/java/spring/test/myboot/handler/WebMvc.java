package spring.test.myboot.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * 1 用@Configuration注解使用方式 去掉HandlerMethodArgumentResolver 实现的@service注解，argumentResolvers.add(new HandlerAgrument())
 * 2 使用@Component 注解 使用方式 在HandlerMethodArgumentResolver 实现类中加上@Service注解 在WebMvc 中使用@Autowired 注入,
 *
 *
 *
 */

//@Configuration
//@EnableWebMvc
@Component
public class WebMvc extends WebMvcConfigurerAdapter {

    @Autowired
    private HandlerMethodArgumentResolver ss;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        //new HandlerAgrument()
        argumentResolvers.add(ss);
    }


}



