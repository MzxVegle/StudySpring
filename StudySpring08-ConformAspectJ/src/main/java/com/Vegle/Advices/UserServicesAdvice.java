package com.Vegle.Advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 在Aspect中可以不实现任何接口，直接定义出增强方法即可
 */
public class UserServicesAdvice {
    /**
     *      前置通知，可带参数JoinPoint
     *      前置通知实现日志记录和权限控制
     * */
    public void before(JoinPoint jp){
        System.out.println(jp.getSignature().getDeclaringTypeName() +" "+jp.getSignature().getName());
        System.out.println("前置通知...");
    }

    /**  后置通知，可带参数：JoinPoint和Object（Object的返回值需要在配置文件中配置）
     *   后置通知也可以实现日志功能
     */
    public void afterReturing(JoinPoint jp,Object value){
        System.out.println(value);
        System.out.println("后置通知...");
    }

    /**  环绕通知
     *   日常开发中使用最多（执行方法前后都增强） ，
     *   可以实现日志功能、权限操作、性能监控和事务管理
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前...");
        Object proceed = pjp.proceed();
        System.out.println("环绕后...");
        return proceed;
    }

    /**
     *  抛出通知，可带参数：JoinPoint和Throwable，Throwable用于接收抛出的异常（需要在配置文件中配置）
     *
     */
    public void throwing(JoinPoint jp,Throwable ex){
        System.out.println("捕获到异常："+ex);
    }
    /**
     * 最终通知after
     * 可以使用最终通知完成资源的释放
     */
    public void after(){
        System.out.println("最终通知...");
    }
}
