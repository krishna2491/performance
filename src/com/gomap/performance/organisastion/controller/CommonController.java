/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gomap.performance.master.aop.logging.EmailTest;
import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.master.constant.UrlConstants;
import com.gomap.performance.organisastion.dto.DepartmentDto;
import com.gomap.performance.organisastion.dto.ElementMasterDto;
import com.gomap.performance.organisastion.dto.EmParamsConfigDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.exception.PerformanceException;
import com.gomap.performance.organisastion.service.CommonService;
import com.gomap.performance.organisastion.util.ResponseWriter;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class CommonController {
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	
	@Autowired
	private CommonService cmnService;
	
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_ELEMENT}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getElementList() {
		ResponseDTO  responseDTO = null;
		try {  
			EmailTest emailTest=new EmailTest();
			emailTest.sendEmail();
				responseDTO=cmnService.getElements();
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			
		} catch (PerformanceException ex) {
			responseDTO = ResponseWriter.writeResponse(responseDTO, ex);
			logger.error("error",ex);
		} 
		catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_ELEMENT}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addDepartment(@RequestBody ElementMasterDto elementMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=cmnService.createElement(elementMasterDto);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (PerformanceException ex) {
			responseDTO = ResponseWriter.writeResponse(responseDTO, ex);
			logger.error("error",ex);
		} 
		catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_OPERATION}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getOperationList() {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=cmnService.getOperation();
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			
		} catch (PerformanceException ex) {
			responseDTO = ResponseWriter.writeResponse(responseDTO, ex);
			logger.error("error",ex);
		} 
		catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_PARAMETER}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addCommonParameter(@RequestBody EmParamsConfigDto emParamsConfigDto, BindingResult result) {
			ResponseDTO  responseDTO = null;
			try {  
				if(result.hasErrors()){
					responseDTO = new ResponseDTO();
					responseDTO.setErrorCode(300);
					responseDTO = ResponseWriter.writeResponse(responseDTO);
				} else {
					responseDTO=cmnService.createParameter(emParamsConfigDto);
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				}
			} catch (PerformanceException ex) {
				responseDTO = ResponseWriter.writeResponse(responseDTO, ex);
				logger.error("error",ex);
			} 
			catch (Exception e) {
				responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
				logger.error("error",e);
			} 
			return responseDTO;
		}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_PARAMETER}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getparameter(@RequestParam String type) {
		ResponseDTO  responseDTO = null;
		try { 
			int paramType=0;
			if(type.equals("feedback"))
			{
				paramType=1;
			}
				responseDTO=cmnService.getParameter(paramType);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			
		} catch (PerformanceException ex) {
			responseDTO = ResponseWriter.writeResponse(responseDTO, ex);
			logger.error("error",ex);
		} 
		catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}

}
