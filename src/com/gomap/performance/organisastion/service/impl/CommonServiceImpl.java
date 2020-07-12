/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomap.performance.organisastion.dao.CommonDao;
import com.gomap.performance.organisastion.dto.DepartmentDto;
import com.gomap.performance.organisastion.dto.ElementMasterDto;
import com.gomap.performance.organisastion.dto.EmParamsConfigDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.model.ElementMaster;
import com.gomap.performance.organisastion.model.EmDepartment;
import com.gomap.performance.organisastion.model.EmParamsConfig;
import com.gomap.performance.organisastion.service.CommonService;

/**
 * @author Fujitsu
 *
 */

@Service
public class CommonServiceImpl implements CommonService {
	private static final Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);

	@Autowired
	private CommonDao cmnDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gomap.performance.organisastion.service.CommonService#getElements()
	 */
	@Override
	@Transactional
	public ResponseDTO getElements() throws Exception {
		// TODO Auto-generated method stub
		logger.info("here getElements");
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			responseDTO.setDataObj(cmnDao.getElements());
			responseDTO.setSuccessMsg("Element data sent");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());

		} catch (Exception e) {
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			;
			responseDTO.setErrorCode(411);
			logger.error("Error getElements", e);
		}
		return responseDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gomap.performance.organisastion.service.CommonService#getOperation()
	 */
	@Override
	@Transactional
	public ResponseDTO getOperation() throws Exception {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO = new ResponseDTO();
		logger.info("here getOperation");
		try {
			responseDTO.setDataObj(cmnDao.getOperations());
			responseDTO.setSuccessMsg("Operation data sent");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());

		} catch (Exception e) {
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			;
			responseDTO.setErrorCode(411);
			logger.error("Error getOperation", e);
		}
		return responseDTO;
	}

	@Override
	@Transactional
	public ResponseDTO createElement(ElementMasterDto elementMasterDto) throws Exception {
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			logger.debug("createElement");
			ElementMaster elementMaster = new ElementMaster();
			elementMaster.setActivateFlag(1);
			elementMaster.setElementName(elementMasterDto.getElementName());
			elementMaster.setCreatedDate(new Date());
			responseDTO.setDataObj(cmnDao.createElement(elementMaster));

			responseDTO.setSuccessMsg("Element created");

			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setDataObj(e);
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while creating Element",e);
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.CommonService#createParameter(com.gomap.performance.organisastion.dto.EmParamsConfigDto)
	 */
	@Override
	@Transactional
	public ResponseDTO createParameter(EmParamsConfigDto emParamsConfigDto) throws Exception {
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			logger.debug("createParameter");
			EmParamsConfig emParamsConfig = new EmParamsConfig();
			emParamsConfig.setActivateFlag(1);
			emParamsConfig.setParamName(emParamsConfigDto.getParamName());
			emParamsConfig.setParamType(emParamsConfigDto.getParamType());
			emParamsConfig.setCreatedDate(new Date());
			responseDTO.setDataObj(cmnDao.createParams(emParamsConfig));

			responseDTO.setSuccessMsg("Parameter created");

			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			responseDTO.setDataObj(e);
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while creating Parameter",e);
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.CommonService#getParamter(java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO getParameter(Integer type) throws Exception {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO = new ResponseDTO();
		logger.info("here getParamter"+type);
		try {
			responseDTO.setDataObj(cmnDao.getParameter(type));
			responseDTO.setSuccessMsg("Parameter data sent");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());

		} catch (Exception e) {
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			;
			responseDTO.setErrorCode(411);
			logger.error("Error getParamter", e);
		}
		return responseDTO;
	}

}
