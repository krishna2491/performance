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
import com.gomap.performance.organisastion.dto.DepartmentDto;
import com.gomap.performance.organisastion.dto.DesignationDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.exception.PerformanceException;
import com.gomap.performance.organisastion.model.EmDesignation;
import com.gomap.performance.organisastion.service.DepartmentAndDesignationService;
import com.gomap.performance.organisastion.util.ResponseWriter;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class DepartmentAndDesignationController {
private static final Logger logger = LoggerFactory.getLogger(DepartmentAndDesignationController.class);
	
	@Autowired
	private DepartmentAndDesignationService departmentAndDesignationService;
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_DEPARTMENT}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addDepartment(@RequestBody DepartmentDto departmentDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=departmentAndDesignationService.createDepartment(departmentDto);
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
	@RequestMapping(value = {UrlConstants.API_GET_DEPARTMENT}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getDepartment(@RequestParam Integer departmentId) {
		ResponseDTO  responseDTO = null;
		try {  
			//	
			if(departmentId.equals(-1))
			{
				departmentId=null;
			}
				responseDTO=departmentAndDesignationService.getDepartment(departmentId);
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
	@RequestMapping(value = {UrlConstants.API_UPDATE_DEPARTMENT}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateDepartment(@RequestBody DepartmentDto departmentDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
			//
				responseDTO=departmentAndDesignationService.updateDepartment(departmentDto);
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
	@RequestMapping(value = {UrlConstants.API_DELETE_DEPARTMENT}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO deleteDepartment(@RequestBody DepartmentDto departmentDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=departmentAndDesignationService.deleteDepartment(departmentDto);
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
	@RequestMapping(value = {UrlConstants.API_ADD_DESIGNATION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addDesignation(@RequestBody DesignationDto designationDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = new ResponseDTO();
				responseDTO.setDataObj(designationDto);
				responseDTO=departmentAndDesignationService.createDesignation(designationDto);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_DESIGNATION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getDesignation(@RequestBody DesignationDto designationDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
				
				responseDTO=departmentAndDesignationService.getDesignation(designationDto.getDesignationId(),designationDto.getDepartmentId());
				DesignationDto dd=new DesignationDto();
				
				//responseDTO.setDataObj(dd);
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
	@RequestMapping(value = {UrlConstants.API_DESIGNATION_ELEMETNS}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getDesignationWithElements(@RequestParam Integer designationId) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=new ResponseDTO();
				
				responseDTO=departmentAndDesignationService.getDesignationWithElements(designationId);
				
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
	@RequestMapping(value = {UrlConstants.API_DELETE_DESIGNATION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO deleteDesignation(@RequestBody DesignationDto designationDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=departmentAndDesignationService.deleteDesignation(designationDto);
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
	@RequestMapping(value = {UrlConstants.API_UPDATE_DESIGNATION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateDesignation(@RequestBody DesignationDto designationDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = new ResponseDTO();
				responseDTO.setDataObj(designationDto);
				responseDTO=departmentAndDesignationService.updateDesignation(designationDto);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
}
