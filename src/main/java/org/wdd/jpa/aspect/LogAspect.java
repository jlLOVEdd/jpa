package org.wdd.jpa.aspect;

import jdk.nashorn.internal.ir.JoinPredecessor;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.JoinPointSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

/**
 * @Description LogAspect
 * @Author weidongdong
 * @Date 2020/5/14 15:16
 * @Version 1.0
 */
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
         if(args.length>0) {
             for (int i = 0; i < args.length; i++) {
                 Object arg = args[i];
                 logger.info("param_" + i + "----------" + (arg == null ? "" : arg.toString()));
             }
         }
        logger.info("before..............................");
    }

    public  void after(){
        logger.info("after..............................");
    }
    public void afterReturn(){
        logger.info("afterReturn..............................");
    }


}
