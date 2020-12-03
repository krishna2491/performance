/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.organisastion.dao.EvaluationDao;
import com.gomap.performance.organisastion.dto.EmployeePerformanceMasterDto;
import com.gomap.performance.organisastion.dto.EvalutionPeriodMasterDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.model.EmployeePerformanceMaster;
import com.gomap.performance.organisastion.model.EvalutionPeriodMaster;
import com.gomap.performance.organisastion.service.EvalutionService;

/**
 * @author Fujitsu
 *
 */
@Service
public class EvalutionServiceImpl implements EvalutionService{
	private static final Logger logger = LoggerFactory.getLogger(EvalutionServiceImpl.class);
	
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#createEvaluationPeriod(com.gomap.performance.organisastion.dto.EvalutionPeriodMasterDto)
	 */
	
	@Autowired
	private EvaluationDao evaluationDao;
	
	@Override
	@Transactional
	public ResponseDTO createEvaluationPeriod(EvalutionPeriodMasterDto evalutionPeriodMasterDto) throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl createEvaluationPeriod");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			if(evalutionPeriodMasterDto.getPeriodName()!=null && evalutionPeriodMasterDto.getStartDate()!=null
				&& evalutionPeriodMasterDto.getEndDate()!=null)
			{
				EvalutionPeriodMaster evalutionPeriodMaster=new EvalutionPeriodMaster();
				evalutionPeriodMaster.setActivateFlag(AppConstants.ACTIVE_FLAG);
				evalutionPeriodMaster.setCreatedBy(evalutionPeriodMasterDto.getCreatedBy());
				evalutionPeriodMaster.setPeriodName(evalutionPeriodMasterDto.getPeriodName());
				evalutionPeriodMaster.setEndDate(evalutionPeriodMasterDto.getEndDate());
				evalutionPeriodMaster.setStartDate(evalutionPeriodMasterDto.getStartDate());
				evalutionPeriodMaster.setCreatedDate(new Date());
				List<EvalutionPeriodMaster> periodList=evaluationDao.getPeriod(evalutionPeriodMaster);
				if(periodList==null || periodList.isEmpty())
				{
					evaluationDao.createPeriod(evalutionPeriodMaster);
					responseDTO.setDataObj(evalutionPeriodMaster);
					responseDTO.setSuccessMsg("Evaluation period created");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				}else {
					responseDTO.setDataObj(evalutionPeriodMasterDto);
					responseDTO.setErrorMsg("Period already availalbe");
					responseDTO.setErrorCode(411);
				}
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Error EvalutionServiceImpl createEvaluationPeriod",e);
			responseDTO.setDataObj(null);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#getCurrentEvaluationPeriod()
	 */
	@Override
	@Transactional
	public ResponseDTO getCurrentEvaluationPeriod() throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl getCurrentEvaluationPeriod");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			EvalutionPeriodMaster evalutionPeriodMaster=new EvalutionPeriodMaster();
			evalutionPeriodMaster.setStartDate(new Date());
			evalutionPeriodMaster.setEndDate(new Date());
			
			List<EvalutionPeriodMaster> periodList=evaluationDao.getPeriod(evalutionPeriodMaster);
			
			//List<EvalutionPeriodMaster> periodList=evaluationDao.getPeriodHql(evalutionPeriodMaster);
			if(periodList==null || periodList.isEmpty())
			{
				responseDTO.setDataObj(null);
				responseDTO.setErrorMsg("Period not available in system");
				responseDTO.setErrorCode(411);
				
				
			}else {
				responseDTO.setDataObj(periodList);
				responseDTO.setSuccessMsg("Evaluation period created");
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Error EvalutionServiceImpl getCurrentEvaluationPeriod",e);
			responseDTO.setDataObj(null);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#getAllEvaluationPeriod()
	 */
	@Override
	@Transactional
	public ResponseDTO getAllEvaluationPeriod() throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl getAllEvaluationPeriod");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			EvalutionPeriodMaster evalutionPeriodMaster=new EvalutionPeriodMaster();
			
			
			List<EvalutionPeriodMaster> periodList=evaluationDao.getPeriod(evalutionPeriodMaster);
			if(periodList==null || periodList.isEmpty())
			{
				responseDTO.setDataObj(null);
				responseDTO.setErrorMsg("Period not available in system");
				responseDTO.setErrorCode(411);
				
				
			}else {
				responseDTO.setDataObj(periodList);
				responseDTO.setSuccessMsg("Evaluation period created");
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Error EvalutionServiceImpl getAllEvaluationPeriod",e);
			responseDTO.setDataObj(null);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#updateEvaluationPeriod(com.gomap.performance.organisastion.dto.EvalutionPeriodMasterDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateEvaluationPeriod(EvalutionPeriodMasterDto evalutionPeriodMasterDto) throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl updateEvaluationPeriod");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			if(evalutionPeriodMasterDto.getPeriodName()!=null && evalutionPeriodMasterDto.getStartDate()!=null
				&& evalutionPeriodMasterDto.getEndDate()!=null && evalutionPeriodMasterDto.getPerformancePeriodId()!=null)
			{
				EvalutionPeriodMaster evalutionPeriodMaster=new EvalutionPeriodMaster();
				
				evalutionPeriodMaster.setPerformancePeriodId(evalutionPeriodMasterDto.getPerformancePeriodId());
			
				
				List<EvalutionPeriodMaster> periodList=evaluationDao.getPeriod(evalutionPeriodMaster);
				if(periodList==null || periodList.isEmpty())
				{
					
					
					responseDTO.setDataObj(evalutionPeriodMasterDto);
					responseDTO.setErrorMsg("Period not availalbe");
					responseDTO.setErrorCode(411);
				}else {
					evalutionPeriodMaster=periodList.get(0);
					if(evalutionPeriodMasterDto.getCreatedBy()!=null)
					{
						evalutionPeriodMaster.setCreatedBy(evalutionPeriodMasterDto.getCreatedBy());	
					}if(evalutionPeriodMasterDto.getPeriodName()!=null)
					{
						evalutionPeriodMaster.setPeriodName(evalutionPeriodMasterDto.getPeriodName());
					}if(evalutionPeriodMasterDto.getEndDate()!=null)
					{
						evalutionPeriodMaster.setEndDate(evalutionPeriodMasterDto.getEndDate());	
					}if(evalutionPeriodMasterDto.getStartDate()!=null)
					{
						evalutionPeriodMaster.setStartDate(evalutionPeriodMasterDto.getStartDate());
					}
					
					
					
					
					evalutionPeriodMaster.setUpdatedDate(new Date());
					evaluationDao.updatePeriod(evalutionPeriodMaster);
					responseDTO.setDataObj(evalutionPeriodMaster);
					responseDTO.setSuccessMsg("Evaluation period updated");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					
					
				}
				
				
			}else
			{
				responseDTO.setDataObj(evalutionPeriodMasterDto);
				responseDTO.setErrorMsg("Please put all mandatory information");
				responseDTO.setErrorCode(411);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Error EvalutionServiceImpl updateEvaluationPeriod",e);
			responseDTO.setDataObj(null);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#storeRating(com.gomap.performance.organisastion.dto.EmployeePerformanceMasterDto)
	 */
	@Override
	@Transactional
	public ResponseDTO storeRating(List<EmployeePerformanceMasterDto> employeePerformanceMasterDtoList) throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl storeRating");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			EmployeePerformanceMaster employeePerformanceMaster = new EmployeePerformanceMaster();
			if(employeePerformanceMasterDtoList!=null && !employeePerformanceMasterDtoList.isEmpty())
			{
				for(EmployeePerformanceMasterDto employeePerformanceMasterDto:employeePerformanceMasterDtoList)
				{
					employeePerformanceMaster = new EmployeePerformanceMaster();
					if (employeePerformanceMasterDto.getPerformancePeriodId() != null) {
						employeePerformanceMaster.setPerformancePeriodId(employeePerformanceMasterDto.getPerformancePeriodId());
					}
					if (employeePerformanceMasterDto.getEmployeeId() != null) {
						employeePerformanceMaster.setEmployeeId(employeePerformanceMasterDto.getEmployeeId());
					}
					if (employeePerformanceMasterDto.getEvaluaterId() != null) {
						employeePerformanceMaster.setEvaluaterId(employeePerformanceMasterDto.getEvaluaterId());

					}
					if (employeePerformanceMasterDto.getTaskId() != null) {
						employeePerformanceMaster.setTaskId(employeePerformanceMasterDto.getTaskId());

					}
					if (employeePerformanceMasterDto.getProjectId() != null) {
						employeePerformanceMaster.setProjectId(employeePerformanceMasterDto.getProjectId());

					}
					if (employeePerformanceMasterDto.getGoalId() != null) {
						employeePerformanceMaster.setGoalId(employeePerformanceMasterDto.getGoalId());
					}
					if (employeePerformanceMasterDto.getRating() != null) {
						employeePerformanceMaster.setRating(employeePerformanceMasterDto.getRating());
					}
					if (employeePerformanceMasterDto.getComment() != null) {
						employeePerformanceMaster.setComment(employeePerformanceMasterDto.getComment());
					}
					employeePerformanceMaster.setActivateFlag(AppConstants.ACTIVE_FLAG);
					employeePerformanceMaster.setCreatedDate(new Date());
					
					evaluationDao.storeEvalution(employeePerformanceMaster);
				}
				
				responseDTO.setDataObj(employeePerformanceMasterDtoList);
				responseDTO.setSuccessMsg("Evaluation completed for employee ");
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}
			

		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error EvalutionServiceImpl storeRating", e);
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#getEmployeeRating(com.gomap.performance.organisastion.dto.EmployeePerformanceMasterDto)
	 */
	@Override
	@Transactional
	public ResponseDTO getEmployeeRating(EmployeePerformanceMasterDto employeePerformanceMasterDto) throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl getEmployeeRating");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
		
			responseDTO.setDataObj(evaluationDao.getEvalution(employeePerformanceMasterDto.getEmployeeId(),
					employeePerformanceMasterDto.getEvaluaterId(),employeePerformanceMasterDto.getPerformancePeriodId(),null));
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setSuccessMsg("Employee rating data sent");
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error EvalutionServiceImpl getEmployeeRating",e);
			responseDTO.setDataObj(e);
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#updateRating(com.gomap.performance.organisastion.dto.EmployeePerformanceMasterDto)
	 */
	@Override
	public ResponseDTO updateRating(List<EmployeePerformanceMasterDto> employeePerformanceMasterDtoList) throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl storeRating");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			boolean allOk=true;
			EmployeePerformanceMaster employeePerformanceMaster = new EmployeePerformanceMaster();
			if(employeePerformanceMasterDtoList!=null && !employeePerformanceMasterDtoList.isEmpty())
			{
				for(EmployeePerformanceMasterDto employeePerformanceMasterDto:employeePerformanceMasterDtoList)
				{
					employeePerformanceMaster = new EmployeePerformanceMaster();
					if(employeePerformanceMasterDto.getPerformaceMstId()!=null)
					{
						List<EmployeePerformanceMaster> DbList=evaluationDao.getEvalution(null, null, null,employeePerformanceMasterDto.getPerformaceMstId());
						{
							if(DbList!=null && !DbList.isEmpty())
							{
								employeePerformanceMaster=DbList.get(0);
								if (employeePerformanceMasterDto.getPerformancePeriodId() != null) {
									employeePerformanceMaster.setPerformancePeriodId(employeePerformanceMasterDto.getPerformancePeriodId());
								}
								if (employeePerformanceMasterDto.getEmployeeId() != null) {
									employeePerformanceMaster.setEmployeeId(employeePerformanceMasterDto.getEmployeeId());
								}
								if (employeePerformanceMasterDto.getEvaluaterId() != null) {
									employeePerformanceMaster.setEvaluaterId(employeePerformanceMasterDto.getEvaluaterId());

								}
								if (employeePerformanceMasterDto.getTaskId() != null) {
									employeePerformanceMaster.setTaskId(employeePerformanceMasterDto.getTaskId());

								}
								if (employeePerformanceMasterDto.getProjectId() != null) {
									employeePerformanceMaster.setProjectId(employeePerformanceMasterDto.getProjectId());

								}
								if (employeePerformanceMasterDto.getGoalId() != null) {
									employeePerformanceMaster.setProjectId(employeePerformanceMasterDto.getGoalId());
								}
								if (employeePerformanceMasterDto.getRating() != null) {
									employeePerformanceMaster.setRating(employeePerformanceMasterDto.getRating());
								}
								if (employeePerformanceMasterDto.getComment() != null) {
									employeePerformanceMaster.setComment(employeePerformanceMasterDto.getComment());
								}
								employeePerformanceMaster.setActivateFlag(AppConstants.ACTIVE_FLAG);
								employeePerformanceMaster.setUpdatedDate(new Date());
								
								evaluationDao.updateEvalution(employeePerformanceMaster);	
							}else {
								allOk=false;
								responseDTO.setDataObj(employeePerformanceMasterDtoList);
								responseDTO.setErrorMsg("PerformaceMstId is mandatory");
								responseDTO.setErrorCode(411);
								break;
							}
						}
						
						
						
						
					}
					
				}
				if(allOk) {
					responseDTO.setDataObj(employeePerformanceMasterDtoList);
					responseDTO.setSuccessMsg("Evaluation update for employee ");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				}
				
			}
			

		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error EvalutionServiceImpl storeRating", e);
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}
	private static Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();}
	private static Date tommorw() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, 1);
	    return cal.getTime();
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EvalutionService#checkEvalution(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO checkEvalution(Integer employeeId, Integer evaluterId) throws Exception {
		// TODO Auto-generated method stub
		logger.info("start EvalutionServiceImpl checkEvalution");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			if(employeeId!=null && evaluterId!=null)
			{
				List<EvalutionPeriodMaster> evalutionPeriodMasters=evaluationDao.getCurrentPeriod();
				if(evalutionPeriodMasters!=null && !evalutionPeriodMasters.isEmpty())
				{
					List<EmployeePerformanceMaster> employeePerformanceMasters=evaluationDao.getEvalution(employeeId, evaluterId, evalutionPeriodMasters.get(0).getPerformancePeriodId(),null);
					if(employeePerformanceMasters!=null && !employeePerformanceMasters.isEmpty())
					{
						
						responseDTO.setDataObj(true);
						responseDTO.setSuccessMsg("Evalution already completed");
						responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					}else
					{
						responseDTO.setDataObj(false);
						responseDTO.setSuccessMsg("Evalution not completed");
						responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					}
				}else
				{
					responseDTO.setDataObj(null);
					responseDTO.setErrorMsg("Please create a valid period");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				}
				
			}else
			{
				responseDTO.setDataObj(null);
				responseDTO.setErrorMsg("employeeId and evaluterId are mandatory");
				responseDTO.setErrorCode(411);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(" EvalutionServiceImpl checkEvalution",e);
			responseDTO.setDataObj(null);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}

}
