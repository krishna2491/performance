/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.controller;

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
import com.gomap.performance.master.dto.CompanyMasterDto;
import com.gomap.performance.master.dto.ResponseDTO;
import com.gomap.performance.master.service.CompanyService;
import com.gomap.performance.master.util.ResponseWriter;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.exception.PerformanceException;

/**
 * @author krishnakant.bairagi
 *
 */
@RestController
public class CompanyController {
	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	@Autowired
	private CompanyService companyServc;
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_ADD_COMPANY}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO addCompany(@RequestBody CompanyMasterDto companyMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = companyServc.addCompany(companyMasterDto);
				logger.info("here");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_UPDATE_COMPANY}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO updateCompany(@RequestBody CompanyMasterDto companyMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = companyServc.updateCompany(companyMasterDto);
				logger.info("here updateCompany");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_COMPANY}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO getCompany(@RequestBody CompanyMasterDto companyMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = companyServc.getCompanyDetails(companyMasterDto);
				logger.info("here");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_CHECK_PORTALNAME}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO checkPortalName(@RequestParam String portalName) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=new ResponseDTO();
				
				responseDTO=companyServc.searchForPortalName(portalName);
				
				
			
		}
		catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_GET_INDUSTRY}, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getIndustry(@RequestParam Integer industryId) {
		ResponseDTO  responseDTO = null;
		try {  
			
				responseDTO=new ResponseDTO();
				
				responseDTO=companyServc.getIndustry(industryId);
				
				
			
		}
		catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
	@CrossOrigin(origins = AppConstants.CORS)
	@RequestMapping(value = {UrlConstants.API_DELETE_COMPANY}, method = RequestMethod.POST)
	public @ResponseBody ResponseDTO deleteCompany(@RequestBody CompanyMasterDto companyMasterDto, BindingResult result) {
		ResponseDTO  responseDTO = null;
		try {  
			if(result.hasErrors()){
				responseDTO = new ResponseDTO();
				responseDTO.setErrorCode(300);
				responseDTO = ResponseWriter.writeResponse(responseDTO);
			} else {
				responseDTO = companyServc.deleteCompany(companyMasterDto);
				logger.info("here");
			}
		} catch (Exception e) {
			responseDTO = ResponseWriter.writeResponse(e.getCause(), e);
			logger.error("error",e);
		} 
		return responseDTO;
	}
}
