/**
 * 
 */
package com.gomap.performance.master.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.gomap.performance.master.util.StackTraceUtil;

/**
 * @author 1056082 
 * This class used to call some service on application start-up
 */

@Component
public class StartupLoaderListener implements ApplicationListener<ContextRefreshedEvent> {
	
	private static final Logger logger = LoggerFactory.getLogger(StartupLoaderListener.class);
	private static final String ROOT_WEBAPPLICATION_CONTEXT = "Root WebApplicationContext"; 

	
	/*
	 * This method will call on start-up
	 * fetch look up data from db
	 */
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			if(event.getApplicationContext().getDisplayName().equals(ROOT_WEBAPPLICATION_CONTEXT)){
				//lookUpDataService.getAllParamConfigValus();
			}
		} catch (Exception e) {
			logger.error(StackTraceUtil.getStackTrace(e));
		}
	}

}
