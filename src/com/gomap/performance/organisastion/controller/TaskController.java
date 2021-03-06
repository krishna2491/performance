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

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.master.constant.UrlConstants;
import com.gomap.performance.organisastion.dto.EmTaskDto;
import com.gomap.performance.organisastion.dto.EmployeeTaskMpgDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.service.TaskService;
import com.gomap.performance.organisastion.util.ResponseWriter;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class TaskController {
	
	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	@Autowired
	private TaskService taskService;
	
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_TASK}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addEmployee(@RequestBody EmTaskDto emTaskDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=taskService.createTask(emTaskDto);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_TASK}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getTask(@RequestBody EmTaskDto emTaskDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=taskService.getTask(emTaskDto);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_UPDATE_TASK}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateTask(@RequestBody EmTaskDto emTaskDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=taskService.updateTask(emTaskDto);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_DELETE_TASK}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO deleteTask(@RequestBody EmTaskDto emTaskDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
				responseDTO=taskService.deleteTask(emTaskDto);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_MAP_TASK_EMPLOYEE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO mapEmployeeTask(@RequestBody List<EmployeeTaskMpgDto> emTaskMpgDtoList, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
				responseDTO=taskService.mapEmployeeTask(emTaskMpgDtoList);
				
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_TASK_EMPLOYEE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getEmployeeTask(@RequestBody EmployeeTaskMpgDto emTaskMpgDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=new ResponseDTO();
				responseDTO=taskService.getEmployeeTaskList(emTaskMpgDto.getTaskId(), emTaskMpgDto.getEmployeeId());
				
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_MY_TEAM_TASK}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getEmployeeTask(@RequestParam Integer createdBy,Integer assignToId,Integer asssignById,Integer projectId,Integer teamId) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=new ResponseDTO();
				responseDTO=taskService.getMyTeamTask(createdBy, assignToId, asssignById, projectId, teamId);
				
			
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
}
