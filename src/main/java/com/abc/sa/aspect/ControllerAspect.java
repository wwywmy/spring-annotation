package com.abc.sa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class ControllerAspect {
	
//	@Pointcut("execution(public * com.abc.sa.controller.*.*(..))")
//	public void weblog() {
//	}

	@Around("execution(public * com.abc.sa.controller.*Controller.*(..))")
//	@Around("weblog()")
	public Object process(ProceedingJoinPoint point) throws Throwable {

		String strClassName = point.getTarget().getClass().getName();
		String strMethodName = point.getSignature().getName();
		log.debug("[类名]:{},[方法]:{}", strClassName, strMethodName);

		// 发送异步日志事件
		Long startTime = System.currentTimeMillis();
		Object obj;

		try {
			obj = point.proceed();
		} catch (Exception e) {
			throw e;
		} finally {
			Long endTime = System.currentTimeMillis();
			log.info("{}.{} cost {} ms", strClassName, strMethodName, (endTime - startTime));
		}

		return obj;
	}

}
