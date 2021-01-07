package com.abc.sa.aspect;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class ServiceAspect {

	@Pointcut("execution(public * com.abc.sa.service.*Service.*(..))")
	public void servicePointcutExpression() {

	}

	@Before("servicePointcutExpression()")
	public void serviceStart(JoinPoint joinPoint) {
		log.info("service start \t {}({})", joinPoint.getSignature().getName(), StringUtils.join(joinPoint.getArgs()));
	}

	@After("servicePointcutExpression()")
	public void serviceEnd(JoinPoint joinPoint) {
		log.info("service end \t {}", joinPoint.getSignature().getName());
	}

	@AfterReturning(value = "servicePointcutExpression()", returning = "ret")
	public void serviceReturn(JoinPoint joinPoint, Object ret) {
		log.info("service return \t {}, return [{}]", joinPoint.getSignature().getName(), ret);
	}

	@AfterThrowing(value = "servicePointcutExpression()", throwing = "e")
	public void serviceException(JoinPoint joinPoint, Exception e) {
		log.info("service exception \t {}, exception [{}]", joinPoint.getSignature().getName(), e.getMessage());
	}

	@Around("servicePointcutExpression()")
	@SneakyThrows
	public Object serviceAround(ProceedingJoinPoint joinPoint) {

		Long startTime = System.currentTimeMillis();
		Object obj;
		try {
			obj = joinPoint.proceed();
		} catch (Exception e) {
			throw e;
		} finally {
			Long endTime = System.currentTimeMillis();
			log.info("service around \t {}, cost {} ms", joinPoint.getSignature().getName(), (endTime - startTime));
		}
		
		return obj;

	}

}
