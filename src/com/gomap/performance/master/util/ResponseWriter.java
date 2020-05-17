/**
 * 
 */
package com.gomap.performance.master.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.master.dto.ResponseDTO;
import com.gomap.performance.organisastion.exception.PerformanceException;

/**
 * @author Krishnakant Bairagi
 *
 */
public final class ResponseWriter {
	
	private static ResourceBundle userMsgBundle =  ResourceBundle.getBundle(AppConstants.USR_MESSAGE_PROPERTY_FILE_NAME);
	
	private static final Logger logger = LoggerFactory.getLogger(ResponseWriter.class);
	
	public static ResponseDTO writeResponse(ResponseDTO responseDTO, PerformanceException e){
		try{
			responseDTO.setErrorCode(e.getErrorCode());
			responseDTO.setErrorMsg((userMsgBundle.getString(Integer.toString(e.getErrorCode()))));
		} catch (NullPointerException | MissingResourceException ex){
			responseDTO.setErrorMsg(null);
			logger.error(StackTraceUtil.getStackTrace(ex));
		}
		return responseDTO;
	}
	
	public static ResponseDTO writeResponse(ResponseDTO responseDTO){
		try{
			responseDTO.setErrorMsg((userMsgBundle.getString(Integer.toString(responseDTO.getErrorCode()))));	
		} catch (NullPointerException | MissingResourceException ex){
			responseDTO.setErrorMsg(null);
			logger.error(StackTraceUtil.getStackTrace(ex));
		}
		return responseDTO;
	}

	/**
	 * @param cause
	 * @param e
	 * @return
	 */
	public static ResponseDTO writeResponse(Throwable cause, Exception e) {
		// TODO Auto-generated method stub
		return null;
	}
}
