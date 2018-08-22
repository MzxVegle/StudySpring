package com.Vegle.Advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 在Aspect中可以不实现任何接口，直接定义出增强方法即可
 */
public class UserServicesAdvice {
    //  前置通知，可带参数JoinPoint
    public void before(JoinPoint jp){
        System.out.println(jp.getSignature().getDeclaringTypeName() +" "+jp.getSignature().getName());
        System.out.println("前置通知...");
    }
    //  后置通知，可带参数：JoinPoint和Object（Object的返回值需要在配置文件中配置）
    public void afterReturing(JoinPoint jp,Object value){
        System.out.println(value);
        System.out.println("后置通知...");
    }
    //  环绕通知
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前...");
        Object proceed = pjp.proceed();
        System.out.println("环绕后...");
        return proceed;
    }
    //  最终通知after
    public void after(){
        System.out.println("最终通知...");
    }
}
