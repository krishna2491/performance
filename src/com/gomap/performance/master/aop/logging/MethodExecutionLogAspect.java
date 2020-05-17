/**
 * 
 */
package com.gomap.performance.master.aop.logging;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.gomap.performance.master.constant.AppConstants;

/**
 * @author 1056082
 *
 */
@Component
@Aspect
public class MethodExecutionLogAspect {

	private static final Logger logger = LoggerFactory.getLogger(MethodExecutionLogAspect.class);
	
	@Autowired
	private HttpSession httpSession;

	@Before("within(com.gomap.performance.organisastion.controller.*)")
	public void logControllerEntry(JoinPoint joinPoint) {
		System.out.println("coming here");
	}
	
	@Before("within(com.gomap.performance.organisastion.service..*) || within(com.gomap.performance.organisastion.dao..*)")
	public void logEntry(JoinPoint joinPoint) {
		logger.info("Entering to the method - {} of the class - {}", joinPoint.getSignature().getName(),
				joinPoint.getSignature().getDeclaringTypeName());
	}
	
	@Around("within(com.gomap.performance.organisastion.web.controller..*)|| within(com.gomap.performance.organisastion.service..*) || within(com.gomap.performance.organisastion.dao..*)")
	public Object logTimeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object retVal = joinPoint.proceed();
		stopWatch.stop();
		String exeTime = String.valueOf(stopWatch.getTotalTimeMillis());
		logger.info("Execution completed for the method - {} of the class - {}", joinPoint.getSignature().getName(),
				joinPoint.getSignature().getDeclaringTypeName().concat(" - ").concat(exeTime).concat("ms"));
		return retVal;
	}
	
	@After("within(com.gomap.performance.organisastion.web.controller..*)|| within(com.gomap.performance.organisastion.service..*) || within(com.gomap.performance.organisastion.dao..*)")
	public void logExit(JoinPoint joinPoint) {
		logger.info("Exiting from method - {} of the class - {}", joinPoint.getSignature().getName(),
				joinPoint.getSignature().getDeclaringTypeName());
	}
	
	
	
	

}
