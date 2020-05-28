/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gomap.performance.master.constant.UrlConstants;
import com.gomap.performance.master.dto.CompanyMasterDto;
import com.gomap.performance.master.dto.EmployeeMasterDto;
import com.gomap.performance.master.dto.ResponseDTO;
import com.gomap.performance.master.service.AdminEmployeeService;
import com.gomap.performance.master.util.ResponseWriter;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class AdminEmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(AdminEmployeeController.class);
	@Autowired
	private AdminEmployeeService adminEmployeeSrvc;
	
	@RequestMapping(value = {UrlConstants.API_ADD_ADMIN_MASTER}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addEmployee(@RequestBody EmployeeMasterDto employeeMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = adminEmployeeSrvc.addEmployee(employeeMasterDto);
				logger.info("here");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@RequestMapping(value = {UrlConstants.API_UPDATE_ADMIN_MASTER}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateEmployee(@RequestBody EmployeeMasterDto employeeMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = adminEmployeeSrvc.updateEmployee(employeeMasterDto);
				logger.info("here updateCompany");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}

	@RequestMapping(value = {UrlConstants.API_GET_ADMIN_MASTER}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getAdminEmployees(@RequestBody EmployeeMasterDto employeeMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
				responseDTO.setDataObj(employeeMasterDto);
				
				responseDTO = adminEmployeeSrvc.getAdminEmployeeDetails(employeeMasterDto);
				logger.info("here getAdminEmployees");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}

}
