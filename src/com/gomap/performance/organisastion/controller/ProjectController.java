/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.controller;

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

import com.gomap.performance.organisastion.dto.ProjectDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.service.ProjectService;
import com.gomap.performance.organisastion.util.ResponseWriter;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class ProjectController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	@Autowired
	private ProjectService projectSrvc;
	
	@RequestMapping(value = {UrlConstants.API_ADD_PROJECT}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO authenticate(@RequestBody ProjectDto projectDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=projectSrvc.addProject(projectDto);
				//responseDTO.setErrorCode(200);
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@RequestMapping(value = {UrlConstants.API_UPADTE_PROJECT}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateproject(@RequestBody ProjectDto projectDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=projectSrvc.updateProject(projectDto);
				//responseDTO.setErrorCode(200);
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}

	@RequestMapping(value = {UrlConstants.API_GET_PROJECT_LIST}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getProjectList() {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=projectSrvc.getProjectList(null);
				//responseDTO.setErrorCode(200);
			
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}

}
