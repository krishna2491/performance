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
import com.gomap.performance.organisastion.dto.EmEmployeeDto;
import com.gomap.performance.organisastion.dto.EmployeeDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.exception.PerformanceException;
import com.gomap.performance.organisastion.service.EmployeeService;
import com.gomap.performance.organisastion.util.ResponseWriter;




/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class EmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService employeeService;
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_EMPLOYEE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addEmployee(@RequestBody EmEmployeeDto employeeDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
			//	responseDTO.setDataObj(employeeDto);
				responseDTO=(ResponseDTO) employeeService.addEmployee(employeeDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_UPDATE_EMPLOYEE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateEmployee(@RequestBody EmEmployeeDto employeeDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
			//	responseDTO.setDataObj(employeeDto);
				responseDTO=(ResponseDTO) employeeService.updateEmployee(employeeDto);
				
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	
	@RequestMapping(value = {UrlConstants.API_GET_EMPLOYEE}, method = RequestMethod.POST)
	
	public @ResponseBody ResponseDTO getEmployee(@RequestBody EmEmployeeDto emEmployeeDto,BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=employeeService.getEmployeeList(emEmployeeDto.getEmployeeId(),emEmployeeDto.getEmployeeEmail());
			}
			
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_EMPLOYEE_LIST}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getEmployee() {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=employeeService.getAllEmployee();
			
			
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_EMPLOYEE_ELEMETNS}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getEmployeeWithElements(@RequestParam Integer employeeId) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=new ResponseDTO();
				
				responseDTO=employeeService.getEmployeeWithElements(employeeId);
				
			//	responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			
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
	@RequestMapping(value = {UrlConstants.API_DELETE_EMPLOYEE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO deleteEmployee(@RequestBody EmEmployeeDto employeeDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
			//	responseDTO.setDataObj(employeeDto);
				responseDTO=(ResponseDTO) employeeService.deleteEmployee(employeeDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
}
