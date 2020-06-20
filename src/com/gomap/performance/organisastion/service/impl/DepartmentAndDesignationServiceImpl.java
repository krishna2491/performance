/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service.impl;


import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.organisastion.dao.DepartmentAndDesignationDao;
import com.gomap.performance.organisastion.dao.impl.DepartmentAndDesignationDaoImpl;
import com.gomap.performance.organisastion.dto.DepartmentDto;
import com.gomap.performance.organisastion.dto.DesignationDto;
import com.gomap.performance.organisastion.dto.ElementMasterDto;

import com.gomap.performance.organisastion.model.DesignationElementMaping;
import com.gomap.performance.organisastion.model.EmDepartment;
import com.gomap.performance.organisastion.model.EmDesignation;
import com.gomap.performance.organisastion.service.DepartmentAndDesignationService;

/**
 * @author krishnakant.bairagi
 *
 */
@Service
public class DepartmentAndDesignationServiceImpl implements DepartmentAndDesignationService {
	private static final Logger logger = LoggerFactory.getLogger(DepartmentAndDesignationServiceImpl.class);

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#createDepartment(DepartmentDto)
	 */
	@Autowired
	private DepartmentAndDesignationDao departmentAndDesignationDao;
	@Override
	@Transactional
	public ResponseDTO createDepartment(DepartmentDto departmentDto)
			throws Exception {
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			logger.debug("creating department");
			EmDepartment emDepartment=new EmDepartment();
			
			emDepartment.setActivateFlag(1);
			emDepartment.setDepartmentCreatedDate(new Date());
			emDepartment.setDepartmentName(departmentDto.getDepartmentName());
			
			departmentAndDesignationDao.createDepartment(emDepartment);
			responseDTO.setDataObj(emDepartment);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while creating department");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#createDesignation(com.gomap.performance.organisastion.dto.DesignationDto)
	 */
	@Override
	@Transactional
	public ResponseDTO createDesignation(DesignationDto designationDto) throws Exception {
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			logger.debug("createDesignation");
			EmDesignation emDesignation=new EmDesignation();
			
			emDesignation.setDesignationCreatedDate(new Date());
			if(designationDto.getCanAddEmployeeToTeam()!=null)
			{
				emDesignation.setCanAddEmployeeToTeam(designationDto.getCanAddEmployeeToTeam());	
			}
			if(designationDto.getCanApproveGoal()!=null)
			{
				emDesignation.setCanApproveGoal(designationDto.getCanApproveGoal());
			}
			if(designationDto.getCanCreateEmployee()!=null)
			{
				emDesignation.setCanCreateEmployee(designationDto.getCanCreateEmployee());
			}
			if(designationDto.getCanCreateFeedbackReq()!=null)
			{
				emDesignation.setCanCreateFeedbackReq(designationDto.getCanCreateFeedbackReq());
			}
			if(designationDto.getCanCreateProject()!=null)
			{
				emDesignation.setCanCreateProject(designationDto.getCanCreateProject());
			}
			if(designationDto.getCanCreateRateSkill()!=null)
			{
				emDesignation.setCanCreateRateSkill(designationDto.getCanCreateRateSkill());
			}
			
			
			if(designationDto.getCanCreateTask()!=null)
			{
				emDesignation.setCanCreateTask(designationDto.getCanCreateTask());
			}
			if(designationDto.getCanCreateTeam()!=null)
			{
				emDesignation.setCanCreateTeam(designationDto.getCanCreateTeam());
			}
			if(designationDto.getCanEvaluateSkill()!=null)
			{
				emDesignation.setCanEvaluateSkill(designationDto.getCanEvaluateSkill());
			}
			if(designationDto.getCanViewTeam()!=null)
			{
				emDesignation.setCanViewTeam(designationDto.getCanViewTeam());
			}
			
			if(designationDto.getDesignationLevelNo()!=null)
			{
				emDesignation.setDesignationLevelNo(designationDto.getDesignationLevelNo());
			}
			if(designationDto.getCanViewAllTask()!=null)
			{
				emDesignation.setCanViewAllTask(designationDto.getCanViewAllTask());
			}
			if(designationDto.getDesignationName()!=null)
			{
				emDesignation.setDesignationName(designationDto.getDesignationName());
			}
			if(designationDto.getParentDesignationId()!=null)
			{
				emDesignation.setParentDesignationId(designationDto.getParentDesignationId());
			}
			if(designationDto.getDepartmentId()!=null)
			{
				emDesignation.setDepartmentId(designationDto.getDepartmentId());
					
			}else {
				responseDTO.setErrorMsg("Department id can not be blank");
				
			}
			if(designationDto.getElementMasterDtoList()!=null)
			{
				DesignationElementMaping designationElementMaping=null;
				for(ElementMasterDto elementMasterDto:designationDto.getElementMasterDtoList())
				{
					designationElementMaping=new DesignationElementMaping();
					
					if(elementMasterDto.getOperationList()!=null)
					{
						//for(OperationMaster)
					}
				}
			}
			
			emDesignation.setActivateFlag(AppConstants.ACTIVE_FLAG);	
			departmentAndDesignationDao.createDesignation(emDesignation);
			responseDTO.setDataObj(emDesignation);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while creating Designation");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#updateDepartment(com.gomap.performance.organisastion.dto.DepartmentDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateDepartment(DepartmentDto departmentDto) throws Exception {
		// TODO Auto-generated method stub

		logger.debug("start  updateDepartment for departmentId="+departmentDto.getDepartmentId());
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			if(departmentDto!=null && departmentDto.getDepartmentId()!=null)
			{
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg("Department parameter can not be null");
			}else
			{
				List<EmDepartment> deptList=departmentAndDesignationDao.getDepartment(departmentDto.getDepartmentId());
				if(deptList.isEmpty())
				{
					responseDTO.setErrorCode(412);
					responseDTO.setErrorMsg("Department data is not availabe in system");
				}else
				{
					EmDepartment department=deptList.get(0);
					if(departmentDto.getDepartmentName()!=null && !("").equals(departmentDto.getDepartmentName()))
					{
						department.setDepartmentName(departmentDto.getDepartmentName());
						department.setDepartmentUpdatedDate(new Date());
						departmentAndDesignationDao.updateDepartment(department);
						responseDTO.setDataObj(department);
						responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					}
						
				}
				
				
			}
			
			
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error(" Error while updating department");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	
	
	
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#updateDesignation(com.gomap.performance.organisastion.dto.DesignationDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateDesignation(DesignationDto designationDto) throws Exception {
		logger.debug("start  updateDesignation for designationId=" + designationDto.getDesignationId());
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			if (designationDto != null && designationDto.getDesignationId() != null) {
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg("Designation parameter can not be null");
			} else {
				List<EmDesignation> designalationList = departmentAndDesignationDao
						.getDesignation(designationDto.getDesignationId(),null);
				if (designalationList.isEmpty()) {
					responseDTO.setErrorCode(412);
					responseDTO.setErrorMsg("Designation data is not availabe in system");
				} else {
					EmDesignation emDesignation = designalationList.get(0);
					if (emDesignation!=null) {
						
						
						if(designationDto.getCanAddEmployeeToTeam()!=null)
						{
							emDesignation.setCanAddEmployeeToTeam(designationDto.getCanAddEmployeeToTeam());	
						}
						if(designationDto.getCanApproveGoal()!=null)
						{
							emDesignation.setCanApproveGoal(designationDto.getCanApproveGoal());
						}
						if(designationDto.getCanCreateEmployee()!=null)
						{
							emDesignation.setCanCreateEmployee(designationDto.getCanCreateEmployee());
						}
						if(designationDto.getCanCreateFeedbackReq()!=null)
						{
							emDesignation.setCanCreateFeedbackReq(designationDto.getCanCreateFeedbackReq());
						}
						if(designationDto.getCanCreateProject()!=null)
						{
							emDesignation.setCanCreateProject(designationDto.getCanCreateProject());
						}
						if(designationDto.getCanCreateRateSkill()!=null)
						{
							emDesignation.setCanCreateRateSkill(designationDto.getCanCreateRateSkill());
						}
						
						
						if(designationDto.getCanCreateTask()!=null)
						{
							emDesignation.setCanCreateTask(designationDto.getCanCreateTask());
						}
						if(designationDto.getCanCreateTeam()!=null)
						{
							emDesignation.setCanCreateTeam(designationDto.getCanCreateTeam());
						}
						if(designationDto.getCanEvaluateSkill()!=null)
						{
							emDesignation.setCanEvaluateSkill(designationDto.getCanEvaluateSkill());
						}
						if(designationDto.getCanViewTeam()!=null)
						{
							emDesignation.setCanViewTeam(designationDto.getCanViewTeam());
						}
						
						if(designationDto.getDesignationLevelNo()!=null)
						{
							emDesignation.setDesignationLevelNo(designationDto.getDesignationLevelNo());
						}
						if(designationDto.getCanViewAllTask()!=null)
						{
							emDesignation.setCanViewAllTask(designationDto.getCanViewAllTask());
						}
						if(designationDto.getDesignationName()!=null)
						{
							emDesignation.setDesignationName(designationDto.getDesignationName());
						}
						if(designationDto.getParentDesignationId()!=null)
						{
							emDesignation.setParentDesignationId(designationDto.getParentDesignationId());
						}
						if(designationDto.getDepartmentId()!=null)
						{
							emDesignation.setDepartmentId(designationDto.getDepartmentId());
								
						}else {
							responseDTO.setErrorMsg("Department id can not be blank");
							
						}
				
						emDesignation.setDesignationUpdatedDate(new Date());
						departmentAndDesignationDao.updateDesignation(emDesignation);
						responseDTO.setDataObj(emDesignation);
						responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					}

				}

			}

			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error(" Error while updating department");
		}
		// TODO Auto-generated method stub
		return responseDTO;

	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#deleteDepartment(com.gomap.performance.organisastion.dto.DepartmentDto)
	 */
	@Override
	@Transactional
	public ResponseDTO deleteDepartment(DepartmentDto departmentDto) throws Exception {
		logger.debug("start  deleteDepartment for departmentId=" + departmentDto.getDepartmentId());
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			if (departmentDto != null && departmentDto.getDepartmentId() != null) {
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg("Department parameter can not be null");
			} else {
				List<EmDepartment> deptList = departmentAndDesignationDao
						.getDepartment(departmentDto.getDepartmentId());
				if (deptList.isEmpty()) {
					responseDTO.setErrorCode(412);
					responseDTO.setErrorMsg("Department data is not availabe in system");
				} else {
					EmDepartment department = deptList.get(0);
					if (departmentDto.getDepartmentName() != null && !("").equals(departmentDto.getDepartmentName())) {
						department.setActivateFlag(AppConstants.IN_ACTIVE_FLAG);
						department.setDepartmentUpdatedDate(new Date());
						departmentAndDesignationDao.updateDepartment(department);
						responseDTO.setDataObj(department);
						responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					}

				}

			}

			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error(" Error while updating department");
		}
		// TODO Auto-generated method stub
		return responseDTO;

	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#deleteDesignation(com.gomap.performance.organisastion.dto.DesignationDto)
	 */
	@Override
	@Transactional
	public ResponseDTO deleteDesignation(DesignationDto designationDto) throws Exception {
		logger.debug("start  deleteDesignation for designationId=" + designationDto.getDesignationId());
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			if (designationDto != null && designationDto.getDesignationId() != null) {
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg("Designation parameter can not be null");
			} else {
				List<EmDesignation> designalationList = departmentAndDesignationDao
						.getDesignation(designationDto.getDesignationId(),null);
				if (designalationList.isEmpty()) {
					responseDTO.setErrorCode(412);
					responseDTO.setErrorMsg("Designation data is not availabe in system");
				} else {
					EmDesignation emDesignation = designalationList.get(0);
					if (emDesignation!=null) {
						emDesignation.setActivateFlag(AppConstants.IN_ACTIVE_FLAG);
						emDesignation.setDesignationUpdatedDate(new Date());
						departmentAndDesignationDao.updateDesignation(emDesignation);
						responseDTO.setDataObj(emDesignation);
						responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					}

				}

			}

			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error(" Error while updating department");
		}
		// TODO Auto-generated method stub
		return responseDTO;

	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#getDepartment(java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO getDepartment(Integer departmentId) throws Exception {

		ResponseDTO responseDTO=new ResponseDTO();
		try {
			logger.debug("getting department departmentId="+departmentId);
			List<EmDepartment> departmetList=departmentAndDesignationDao.getDepartment(departmentId);
			responseDTO.setDataObj(departmetList);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error(" Error while getting department");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.DepartmentAndDesignationService#getDesignation(java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO getDesignation(Integer designationId,Integer departmentId) throws Exception {

		ResponseDTO responseDTO=new ResponseDTO();
		try {
			logger.debug("getting Designation designationId="+designationId);
			List<EmDesignation> designationList=departmentAndDesignationDao.getDesignation(designationId, departmentId);
			responseDTO.setDataObj(designationList);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error(" Error while getting Designation");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	
	}
		}
