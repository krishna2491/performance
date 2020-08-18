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
import com.gomap.performance.organisastion.dto.EmGoalDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.service.GoalService;
import com.gomap.performance.organisastion.util.ResponseWriter;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class GoalController {

	private static final Logger logger = LoggerFactory.getLogger(GoalController.class);

	@Autowired
	private GoalService goalService;
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_GOAL}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getGoal(@RequestBody EmGoalDto emGoalDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=goalService.getGoal(emGoalDto);
				
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_GOAL}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addGoal(@RequestBody EmGoalDto emGoalDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=goalService.createGoal(emGoalDto);
				//responseDTO.setDataObj(emGoalDto);
				//responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_UPDATE_GOAL}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateGoal(@RequestBody EmGoalDto emGoalDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=goalService.updateGoal(emGoalDto);
				
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_DELETE_GOAL}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO deleteGoal(@RequestBody EmGoalDto emGoalDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO=goalService.deleteGoal(emGoalDto.getGoalId(), emGoalDto.getEmployeeId(),null);
				
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	
	
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_MY_TEAM_GOAL}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getMyTeamGoal1(@RequestParam Integer createdBy,Integer projectId) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=goalService.getMyTeamGoals(createdBy,projectId);
				
			
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error getMyTeamGoal",e);
		} 
		return responseDTO;
	}
	

}
