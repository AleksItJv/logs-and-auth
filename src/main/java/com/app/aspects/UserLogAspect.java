package com.app.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;


@Component
public class UserLogAspect {

    public void beforeUserServiceMethodInvocation(JoinPoint joinPoint){
        System.out.println("**************************************************");
        System.out.println("***** LOG: Invocation of method " + joinPoint.getSignature());
    }

    public void afterUserServiceMethodInvocation(JoinPoint joinPoint){
        System.out.println("**************************************************");
    }

    public Object aroundUserServiceMethodInvocation(ProceedingJoinPoint jp) throws Throwable {
        long start = System.currentTimeMillis();
        Object res = jp.proceed();
        long end = System.currentTimeMillis();
        System.out.println("**************************************************");
        System.out.println("***** LOG: Execution of method " + jp.getSignature()
                + " took " + (end - start) + " msec.");
        return res;
    }
}
