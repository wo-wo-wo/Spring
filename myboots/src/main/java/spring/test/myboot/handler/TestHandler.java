package spring.test.myboot.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestHandler extends HandlerInterceptorAdapter {

    private final  static Logger logger = LoggerFactory.getLogger(TestHandler.class);

    public TestHandler() {
        super();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        logger.info("开始执行preHandle方法");



        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


        logger.info("开始执行postHandle方法");
       // request.getRequestDispatcher("sucess").forward(request, response);


        return;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("开始执行afterCompletion方法");
       // response.sendRedirect("/sucess?");
    }


}
