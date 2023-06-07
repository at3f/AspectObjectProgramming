package com.example.aspectobjectprogramming.aspect;

import com.example.aspectobjectprogramming.repository.TestRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {
//    @AfterThrowing(value="execution(* com.example.aspectobjectprogramming.repository.TestRepository.*(..))",throwing="exec")
    @AfterThrowing(value = "@annotation(ThrowGlobalError)",throwing="exec")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exec)
    {
        System.out.println("After Throwing Exception in method:"+joinPoint.getSignature().toString());
        System.out.println("Exception is:"+exec.getMessage());
    }
}
