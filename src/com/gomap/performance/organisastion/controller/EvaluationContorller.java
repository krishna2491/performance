/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.controller;

import java.util.List;

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
import com.gomap.performance.organisastion.dto.EmployeePerformanceMasterDto;
import com.gomap.performance.organisastion.dto.EvalutionPeriodMasterDto;
import com.gomap.performance.organisastion.dto.ExitInterviewParamDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.exception.PerformanceException;
import com.gomap.performance.organisastion.service.EvalutionService;
import com.gomap.performance.organisastion.service.impl.EvalutionServiceImpl;
import com.gomap.performance.organisastion.util.ResponseWriter;

/**
 * @author Fujitsu
 *
 */
@RestController
public class EvaluationContorller {

	private static final Logger logger = LoggerFactory.getLogger(EvaluationContorller.class);
	
	@Autowired
	private EvalutionService evalutionService;
	
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_CURRENT_PERIOD}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getCurrentPeriod() {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=evalutionService.getCurrentEvaluationPeriod();
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
	@RequestMapping(value = {UrlConstants.API_GET_ALL_PERIOD}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getAllPeriod() {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=evalutionService.getAllEvaluationPeriod();
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
	@RequestMapping(value = {UrlConstants.API_ADD_EVALUATION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO evaluteEmployee(@RequestBody List<EmployeePerformanceMasterDto> employeePerformanceMasterDtos, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=evalutionService.storeRating(employeePerformanceMasterDtos);
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
	@RequestMapping(value = {UrlConstants.API_UPDATE_EVALUATION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateevaluteEmployee(@RequestBody List<EmployeePerformanceMasterDto> employeePerformanceMasterDtos, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=evalutionService.updateRating(employeePerformanceMasterDtos);
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
	@RequestMapping(value = {UrlConstants.API_ADD_PERIOD}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO createPeriod(@RequestBody EvalutionPeriodMasterDto evalutionPeriodMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=evalutionService.createEvaluationPeriod(evalutionPeriodMasterDto);
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
	@RequestMapping(value = {UrlConstants.API_UPDATE_PERIOD}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updatePeriod(@RequestBody EvalutionPeriodMasterDto evalutionPeriodMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=evalutionService.updateEvaluationPeriod(evalutionPeriodMasterDto);
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
	@RequestMapping(value = {UrlConstants.API_GET_EVALUATION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getEmployeeEvalution(@RequestBody EmployeePerformanceMasterDto employeePerformanceMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=evalutionService.getEmployeeRating(employeePerformanceMasterDto);
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
	@RequestMapping(value = {UrlConstants.API_CHECK_EVALUATION}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO checkEvalution(@RequestParam("employeeId") Integer employeeId,
			@RequestParam("evaluaterId") Integer evaluaterId) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=evalutionService.checkEvalution(employeeId, evaluaterId);
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
