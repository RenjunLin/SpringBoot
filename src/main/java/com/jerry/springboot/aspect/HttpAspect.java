package com.jerry.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Before("execution(public * com.jerry.springboot.controller.StudentController.getStudentList(..))")
    public void log(){
        logger.info("before get list");
    }

    @Pointcut("execution(public * com.jerry.springboot.controller.StudentController.*(..))")  //定义一个切面
    public void doLog(){

    }

    @Before("doLog()")   //使用定义好的切面
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url = {}", request.getRequestURL());

        //method
        logger.info("method = {}", request.getMethod());

        //ip
        logger.info("ip = {}", request.getRemoteAddr());

        //类方法
        logger.info("class_method = {}", joinPoint.getSignature().getDeclaringType() + "." + joinPoint.getSignature().getName());

        //参数
        logger.info("args = {}", joinPoint.getArgs());
    }

    @After("doLog()")
    public void doAfter(){
        logger.info("do after");
    }

    @AfterReturning(returning = "object", pointcut = "doLog()")
    public void doAfterReturning(Object object){
        logger.info("response = {}", object.toString());
    }
}
