package com.practice.aoplog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

   private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

   @Before("execution(* com.practice.aoplog.service..*(..))")
   public void before(JoinPoint joinPoint) {
      log.info("[Before] {}", joinPoint.getSignature().toShortString());
   }

   @AfterReturning(pointcut = "execution(* com.practice.aoplog.service..*(..))", returning = "result")
   public void afterReturning(JoinPoint joinPoint, Object result) {
      log.info("[AfterReturning] {} → result: {}", joinPoint.getSignature().toShortString(), result);
   }
}
