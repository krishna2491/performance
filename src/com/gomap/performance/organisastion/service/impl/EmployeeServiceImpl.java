/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.organisastion.dao.EmployeeDao;
import com.gomap.performance.organisastion.dto.DesignationDto;
import com.gomap.performance.organisastion.dto.DesignationElementMapingDto;
import com.gomap.performance.organisastion.dto.EmEmployeeDto;
import com.gomap.performance.organisastion.dto.EmployeeDto;
import com.gomap.performance.organisastion.dto.EmployeeElementMpgDto;
import com.gomap.performance.organisastion.dto.EmployeeElementOperationDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.dto.RoleElementOperationMpgDto;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.model.DesignationElementMaping;
import com.gomap.performance.organisastion.model.EmDepartment;
import com.gomap.performance.organisastion.model.EmDesignation;
import com.gomap.performance.organisastion.model.EmEmployee;
import com.gomap.performance.organisastion.model.EmployeeElementMpg;
import com.gomap.performance.organisastion.model.EmployeeElementOperationMpg;
import com.gomap.performance.organisastion.model.RoleElementOperationMpg;
import com.gomap.performance.organisastion.service.EmployeeService;


/**
 * @author krishnakant.bairagi
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeDao empDao;
	@Autowired
	private HttpSession httpSession;
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#addEmployee(com.gomap.performance.organisastion.dto.EmEmployeeDto)
	 */
	@Override
	@Transactional
	public ResponseDTO addEmployee(EmEmployeeDto employeeDto) throws Exception {
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			logger.debug("addEmployee ");
			EmEmployee emEmployee=new EmEmployee();
			if(employeeDto.getDesignationId()!=null)
			{
				emEmployee.setDesignationId(employeeDto.getDesignationId());
			}
			if(employeeDto.getGender()!=null)
			{
				emEmployee.setGender(employeeDto.getGender());
			}
			if(employeeDto.getEmployeeEmail()!=null)
			{
				emEmployee.setEmployeeEmail(employeeDto.getEmployeeEmail());
			}
			if(employeeDto.getEmployeeFname()!=null)
			{
				emEmployee.setEmployeeFname(employeeDto.getEmployeeFname());
			}
			if(employeeDto.getEmployeeMname()!=null)
			{
				emEmployee.setEmployeeMname(employeeDto.getEmployeeMname());
			}
			if(employeeDto.getEmployeeMobileNo()!=null)
			{
				emEmployee.setEmployeeMobileNo(employeeDto.getEmployeeMobileNo());
			}
			if(employeeDto.getEmployeePassword()!=null)
			{
				emEmployee.setEmployeePassword(employeeDto.getEmployeePassword());
			}
			if(employeeDto.getEmployeeProfileImg()!=null)
			{
				emEmployee.setEmployeeProfileImg(employeeDto.getEmployeeProfileImg());
			}
			if(employeeDto.getEmployeeCode()!=null)
			{
				emEmployee.setEmployeeCode(employeeDto.getEmployeeCode());
			}
			emEmployee.setActivateFlag(AppConstants.ACTIVE_FLAG);
			emEmployee.setEmployeeCreatedDate(new Date());
			
			empDao.storeEmployeeData(emEmployee);
			
			if(employeeDto.getEmployeeElementMappingList()!=null)
			{
				EmployeeElementMpg employeeElementMpg=null;
				for(EmployeeElementMpgDto employeeElementMpgDto:employeeDto.getEmployeeElementMappingList())
				{
					employeeElementMpg=new EmployeeElementMpg();
					employeeElementMpg.setElementId(employeeElementMpgDto.getElementId());
					employeeElementMpg.setEmployeeId(emEmployee.getEmployeeId());
					
					
					employeeElementMpg.setActivateFlag(AppConstants.ACTIVE_FLAG);
					employeeElementMpg.setCreatedDate(new Date());
					empDao.mapEmployeeElement(employeeElementMpg);
					
					if(employeeElementMpgDto.getEmployeeElementOprationList()!=null)
					{
						//for(OperationMaster)
						for(EmployeeElementOperationDto employeeElementOperationDto:employeeElementMpgDto.getEmployeeElementOprationList())
						{
							EmployeeElementOperationMpg employeeElementOperationMpg=new EmployeeElementOperationMpg();
							employeeElementOperationMpg.setOperationId(employeeElementOperationDto.getOperationId());
							employeeElementOperationMpg.setActivateFlag(AppConstants.ACTIVE_FLAG);
							employeeElementOperationMpg.setEmployeeElementMpgId(employeeElementMpg.getEmployeeElementMpgId());
							employeeElementOperationMpg.setCreatedDate(new Date());
							//departmentAndDesignationDao.mapOperation(roleElementOperationMpg);
							empDao.mapOperation(employeeElementOperationMpg);
							
						}
						
					}
				}
			}
			
			
			responseDTO.setSuccessMsg("Employee created Successfully");
			responseDTO.setDataObj(emEmployee);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while creating Employee");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#employeeRoleMapping(com.gomap.performance.organisastion.dto.EmEmployeeDto)
	 */
	@Override
	public ResponseDTO employeeRoleMapping(EmEmployeeDto employeeDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#employeeDepratmentMapping(com.gomap.performance.organisastion.dto.EmEmployeeDto)
	 */
	@Override
	public ResponseDTO employeeDepratmentMapping(EmEmployeeDto employeeDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#getMySkill()
	 */
	@Override
	public ResponseDTO getMySkill() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#getMyTask()
	 */
	@Override
	public ResponseDTO getMyTask() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#getMyGoal()
	 */
	@Override
	public ResponseDTO getMyGoal() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#getEmployeeList(java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO getEmployeeList(Integer employeeId) throws Exception {

		ResponseDTO responseDTO=new ResponseDTO();
		try {
			logger.debug("getting getEmployeeList employeeId="+employeeId);
			List<EmEmployee> employeeList=empDao.getEmployeeList(employeeId);
			responseDTO.setDataObj(employeeList);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error(" Error while getting EmployeeList");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#updateEmployee(com.gomap.performance.organisastion.dto.EmEmployeeDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateEmployee(EmEmployeeDto employeeDto) throws Exception {
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			logger.debug("updateEmployee ");
			if(employeeDto!=null && employeeDto.getEmployeeId()!=null)
			{
				List<EmEmployee> employeeList=empDao.getEmployeeList(employeeDto.getEmployeeId());
				if(employeeList.isEmpty())
				{
					responseDTO.setDataObj(null);
					responseDTO.setErrorMsg("Employee data is not available in system");
					responseDTO.setErrorCode(411);
					return 	responseDTO;				
				}else {
					EmEmployee emEmployee=employeeList.get(0);
							if(employeeDto.getDesignationId()!=null)
							{
								emEmployee.setDesignationId(employeeDto.getDesignationId());
							}
							if(employeeDto.getGender()!=null)
							{
								emEmployee.setGender(employeeDto.getGender());
							}
							if(employeeDto.getEmployeeEmail()!=null)
							{
								emEmployee.setEmployeeEmail(employeeDto.getEmployeeEmail());
							}
							if(employeeDto.getEmployeeFname()!=null)
							{
								emEmployee.setEmployeeFname(employeeDto.getEmployeeFname());
							}
							if(employeeDto.getEmployeeMname()!=null)
							{
								emEmployee.setEmployeeMname(employeeDto.getEmployeeMname());
							}
							if(employeeDto.getEmployeeMobileNo()!=null)
							{
								emEmployee.setEmployeeMobileNo(employeeDto.getEmployeeMobileNo());
							}
							if(employeeDto.getEmployeePassword()!=null)
							{
								emEmployee.setEmployeePassword(employeeDto.getEmployeePassword());
							}
							if(employeeDto.getEmployeeProfileImg()!=null)
							{
								emEmployee.setEmployeeProfileImg(employeeDto.getEmployeeProfileImg());
							}
							if(employeeDto.getEmployeeCode()!=null)
							{
								emEmployee.setEmployeeCode(employeeDto.getEmployeeCode());
							}
							if(employeeDto.getActivateFlag()!=null)
							{
								emEmployee.setActivateFlag(employeeDto.getActivateFlag());
							}else {
								emEmployee.setActivateFlag(AppConstants.ACTIVE_FLAG);
							}
							
							emEmployee.setEmployeeUpdatedDate(new Date());
							empDao.updateEmployee(emEmployee);
							// permisson start

							EmployeeElementMpg employeeElementMpg=null;
							
							for(EmployeeElementMpgDto employeeElementMpgDto:employeeDto.getEmployeeElementMappingList())
							{
								if(employeeElementMpgDto.getEmployeeElementMpgId()==null)
								{
									// insert new element
									// then store data for operation

									employeeElementMpg=new EmployeeElementMpg();
										
									employeeElementMpg.setEmployeeId(emEmployee.getEmployeeId());
									
									employeeElementMpg.setElementId(employeeElementMpgDto.getElementId());
									employeeElementMpg.setActivateFlag(AppConstants.ACTIVE_FLAG);
									employeeElementMpg.setCreatedDate(new Date());
										empDao.mapEmployeeElement(employeeElementMpg);
										
										if(employeeElementMpgDto.getEmployeeElementOprationList()!=null)
										{
											//for(OperationMaster)
											for(EmployeeElementOperationDto employeeElementOperationDto:employeeElementMpgDto.getEmployeeElementOprationList())
											{
												EmployeeElementOperationMpg employeeElementOperationMpg=new EmployeeElementOperationMpg();
												employeeElementOperationMpg.setOperationId(employeeElementOperationDto.getOperationId());
												employeeElementOperationMpg.setActivateFlag(AppConstants.ACTIVE_FLAG);
												employeeElementOperationMpg.setEmployeeElementMpgId(employeeElementMpgDto.getEmployeeElementMpgId());
												employeeElementOperationMpg.setCreatedDate(new Date());
												empDao.mapOperation(employeeElementOperationMpg);
												
											}
											
										}
									
								
								}else {
									if(employeeElementMpgDto.getEmployeeElementOprationList()!=null)
									{
										for(EmployeeElementOperationDto emploElementOperationDto:employeeElementMpgDto.getEmployeeElementOprationList())
										{
											if(emploElementOperationDto.getEmployeeElementOperationId()==null)
											{
												EmployeeElementOperationMpg employeeElementOperationMpg=new EmployeeElementOperationMpg();
												employeeElementOperationMpg.setOperationId(emploElementOperationDto.getOperationId());
												employeeElementOperationMpg.setActivateFlag(AppConstants.ACTIVE_FLAG);
												employeeElementOperationMpg.setEmployeeElementMpgId(emploElementOperationDto.getEmployeeElementMpgId());
												employeeElementOperationMpg.setCreatedDate(new Date());
												empDao.mapOperation(employeeElementOperationMpg);
												
												// insert new  operation
											}else
											{
												if(emploElementOperationDto.getEmployeeElementOperationId()!=null && emploElementOperationDto.getActivateFlag().equals(AppConstants.IN_ACTIVE_FLAG))
												{
													//inactive operation here
													EmployeeElementOperationMpg employeeElementOperationMpg=new EmployeeElementOperationMpg();
													employeeElementOperationMpg.setEmployeeElementOperationId(emploElementOperationDto.getEmployeeElementOperationId());
													employeeElementOperationMpg.setOperationId(emploElementOperationDto.getOperationId());
													employeeElementOperationMpg.setActivateFlag(AppConstants.IN_ACTIVE_FLAG);
													employeeElementOperationMpg.setEmployeeElementMpgId(emploElementOperationDto.getEmployeeElementMpgId());
													employeeElementOperationMpg.setUpdatedDate(new Date());
													empDao.updateOperation(employeeElementOperationMpg);
													
												}
											}
										}
									}
								}
							}
						
							
							// permisson end
							
							responseDTO.setDataObj(emEmployee);
							responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
							responseDTO.setSuccessMsg("Employee data updated successfully!!");
							
				}
			}
			else {
				responseDTO.setDataObj(null);
				responseDTO.setErrorMsg("Employee id can not be null");
				responseDTO.setErrorCode(411);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while updating Employee");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#getAllEmployee()
	 */
	@Override
	@Transactional
	public ResponseDTO getAllEmployee() throws Exception {
		// TODO Auto-generated method stub
		logger.info("getAllEmployee ");
		ResponseDTO responseDTO=null;
		try {
			responseDTO=new ResponseDTO();
			responseDTO.setDataObj(empDao.getAllEmplyeeData());
			responseDTO.setSuccessMsg("Employee sent successfully");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			;
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error in getAllEmployee",e);
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.EmployeeService#getEmployeeWithElements(java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO getEmployeeWithElements(Integer employeeId) throws Exception {
		// TODO Auto-generated method stub
		logger.info("getting getEmployeeWithElements employeeId="+employeeId);
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			
			List<EmployeeElementMpg> employeeElementMpg=empDao.getEmployeeElement(employeeId);
			EmployeeElementMpgDto employeeElementMpgDto=new EmployeeElementMpgDto();
			//List<EmployeeElementOperationDto> employeeElementOperationDtos=new ArrayList<EmployeeElementOperationDto>();
			List<EmployeeElementMpgDto> employeeElementMpgDtos=new ArrayList<EmployeeElementMpgDto>();
			//EmployeeElementMpgDto employeeElementMpgDto2=new EmployeeElementMpgDto();
			EmployeeElementOperationDto elementOperationMpgDto=new EmployeeElementOperationDto();
			EmEmployeeDto employeeDto=new EmEmployeeDto();
			List<EmEmployee> employeeList=empDao.getEmployeeList(employeeId);
			employeeDto.setEmployeeId(employeeId);
			employeeDto.setEmployeeEmail(employeeList.get(0).getEmployeeEmail());
			//hhdesignationDto.setDepartmentId(desigList.get(0).getDepartmentId());
			List<EmployeeElementOperationDto> operationMasterDtos=null;
			for(EmployeeElementMpg employeeElementMpg2:employeeElementMpg)
			{
				operationMasterDtos = new ArrayList<EmployeeElementOperationDto>();
				employeeElementMpgDto=new EmployeeElementMpgDto();
				List<EmployeeElementOperationMpg> masterDtos = empDao.getEmployeeElementOperation(employeeElementMpg2.getEmployeeElementMpgId());
						
				if (masterDtos != null && !masterDtos.isEmpty()) {
					for (EmployeeElementOperationMpg elementOperationMpg : masterDtos) {

						elementOperationMpgDto = new EmployeeElementOperationDto();
						elementOperationMpgDto
								.setEmployeeElementMpgId(elementOperationMpg.getEmployeeElementMpgId());
						elementOperationMpgDto.setOperationId(elementOperationMpg.getOperationId());
						elementOperationMpgDto
								.setEmployeeElementOperationId(elementOperationMpg.getEmployeeElementOperationId());
						operationMasterDtos.add(elementOperationMpgDto);
					}
					employeeElementMpgDto.setEmployeeElementOprationList(operationMasterDtos);
					employeeElementMpgDto.setEmployeeId(employeeElementMpg2.getEmployeeId());
					employeeElementMpgDto.setElementId(employeeElementMpg2.getElementId());
					employeeElementMpgDto.setEmployeeElementMpgId(employeeElementMpg2.getEmployeeElementMpgId());
							
					employeeElementMpgDtos.add(employeeElementMpgDto);
				}
			}
			employeeDto.setEmployeeElementMappingList(employeeElementMpgDtos);
			responseDTO.setDataObj(employeeDto);
			responseDTO.setSuccessMsg("Data sent");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
		}
		return responseDTO;
	}
	
		}
