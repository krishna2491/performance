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

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.organisastion.dao.AuditLogDao;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.model.AuditLog;
import com.gomap.performance.organisastion.model.OperationMaster;
import com.gomap.performance.organisastion.service.AuditLogService;

/**
 * @author Fujitsu
 *
 */
@Service
public class AuditLogServiceImpl implements AuditLogService{
	private static final Logger logger = LoggerFactory.getLogger(AuditLogServiceImpl.class);

	@Autowired
	private AuditLogDao auditLogDao;
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.AuditLogService#saveAuditLog(java.lang.String, java.lang.String, java.lang.String, java.util.Date)
	 */
	@Override
	@Transactional
	public ResponseDTO saveAuditLog(String action, String action_Type, String createdBy, Date createdDate)
			throws Exception {
		// TODO Auto-generated method stub\
		ResponseDTO responseDTO = new ResponseDTO();
		logger.info("here saveAuditLog");
		try {
			AuditLog log=new AuditLog(action, action_Type, createdBy, new Date());
			auditLogDao.storeAuditLog(log);
			
			responseDTO.setDataObj(log);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setDataObj(null);
			responseDTO.setErrorCode(411);
			logger.error("here saveAuditLog ",e);
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.AuditLogService#getAuditLog(java.lang.String, java.lang.String, java.lang.String, java.util.Date)
	 */
	@Override
	@Transactional
	public ResponseDTO getAuditLog(String action, String action_Type, String createdBy, Date createdDate)
			throws Exception {
		ResponseDTO responseDTO = new ResponseDTO();
		logger.info("here getAuditLog");
		try {
			AuditLog log=new AuditLog(action, action_Type, createdBy, createdDate);
		
			responseDTO.setDataObj(	auditLogDao.getAuditLogData(log));
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setSuccessMsg("audit log sent.");
			
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setDataObj(null);
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg("some error to get audit log");
			
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}

}
