package spring.test.myboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import spring.test.myboot.handler.TestHandler;

import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        CopyOnWriteArrayList<String> ss = new CopyOnWriteArrayList<>();

        InterceptorRegistration  registration = registry.addInterceptor(new TestHandler());

        registration.addPathPatterns("/**");
        registration.excludePathPatterns("/");


        super.addInterceptors(registry);
    }
}
