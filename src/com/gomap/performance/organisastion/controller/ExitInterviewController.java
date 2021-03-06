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

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.master.constant.UrlConstants;
import com.gomap.performance.organisastion.dto.ElementMasterDto;
import com.gomap.performance.organisastion.dto.ExitInterviewParamDto;
import com.gomap.performance.organisastion.dto.ExitInterviewResponseDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.exception.PerformanceException;
import com.gomap.performance.organisastion.service.ExitInterviewService;
import com.gomap.performance.organisastion.service.impl.AuditLogServiceImpl;
import com.gomap.performance.organisastion.util.ResponseWriter;

/**
 * @author Fujitsu
 *
 */
@RestController
public class ExitInterviewController {
	private static final Logger logger = LoggerFactory.getLogger(ExitInterviewController.class);

	@Autowired
	private ExitInterviewService exitInterviewService;
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_EXIT_INETERVIEW_PARAM}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addParameter(@RequestBody ExitInterviewParamDto exitInterviewParamDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=exitInterviewService.createExitInterviewParameter(exitInterviewParamDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
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
	@RequestMapping(value = {UrlConstants.API_UPDATE_EXIT_INETERVIEW_PARAM}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateParameter(@RequestBody ExitInterviewParamDto exitInterviewParamDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=exitInterviewService.updateExitInterviewParameter(exitInterviewParamDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
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
	@RequestMapping(value = {UrlConstants.API_GET_EXIT_INETERVIEW_PARAM}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getParameter(@RequestBody ExitInterviewParamDto exitInterviewParamDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=exitInterviewService.getInterviewParam(exitInterviewParamDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
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
	@RequestMapping(value = {UrlConstants.API_ADD_INTERVIEW_RESPONSE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO storeInterviewResponse(@RequestBody ExitInterviewResponseDto exitInterviewResponseDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=exitInterviewService.storeInterviewResponse(exitInterviewResponseDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
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
	@RequestMapping(value = {UrlConstants.API_UPDATE_INTERVIEW_RESPONSE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateInterviewResponse(@RequestBody ExitInterviewResponseDto exitInterviewResponseDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=exitInterviewService.updateInterviewResponse(exitInterviewResponseDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
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
	@RequestMapping(value = {UrlConstants.API_GET_INTERVIEW_RESPONSE}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getInterviewResponse() {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=exitInterviewService.getInterviewResponse();
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			
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
	@RequestMapping(value = {UrlConstants.API_GET_INTERVIEW_RESPONSE_DETAIL}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getInterviewResponse(@RequestParam Long responseId) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=exitInterviewService.getInterviewResponseDetail(responseId);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			
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
