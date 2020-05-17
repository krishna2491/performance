/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.controller;


import javax.servlet.http.HttpSession;

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
import com.gomap.performance.master.dto.LoginDTO;
import com.gomap.performance.master.dto.RequestDTO;
import com.gomap.performance.master.dto.ResponseDTO;
import com.gomap.performance.master.enums.ErrorCodeEnums;
import com.gomap.performance.master.service.AdminLoginService;
import com.gomap.performance.master.util.ResponseWriter;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class LoginController {


	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private AdminLoginService loginService;
	
	@Autowired
	private HttpSession httpSession;
	
	/*
	 * This method authenticate the user
	 * @param loginDTO
	 */
	@RequestMapping(value = {UrlConstants.API_LOGIN_AUTHENTICATE}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO authenticate(@RequestBody LoginDTO loginDTO, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = loginService.authenticate(loginDTO);
				logger.info("here");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	
	/*
	 * This method validate session of login user
	 */
	@RequestMapping(value = {UrlConstants.API_VALIDATE_SESSION}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO validateSession(@RequestBody RequestDTO requestDTO, BindingResult bindingResult) {
		return null;
	}
	
	/*
	 * This method logout the user
	 */
	@RequestMapping(value = {UrlConstants.API_LOGOUT}, method = RequestMethod.POST)
	public void logOut() {
		 try {
			loginService.logout();
		} catch (Exception e) {
			logger.error("efregt");
		}
	}
	
	/*
	 * Method for captcha generation 
	*/
	

}
