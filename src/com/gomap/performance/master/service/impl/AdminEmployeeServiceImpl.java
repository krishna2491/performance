/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.master.dao.AdminEmployeeDao;
import com.gomap.performance.master.dto.EmployeeMasterDto;
import com.gomap.performance.master.dto.ResponseDTO;
import com.gomap.performance.master.dto.UserDto;
import com.gomap.performance.master.model.EmployeeMaster;
import com.gomap.performance.master.model.UserMaster;
import com.gomap.performance.master.service.AdminEmployeeService;
import com.gomap.performance.master.service.EmailService;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;

/**
 * @author krishnakant.bairagi
 *
 */
@Service
public class AdminEmployeeServiceImpl implements AdminEmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(AdminEmployeeServiceImpl.class);
	
	@Autowired
	private AdminEmployeeDao adminEmployeeDao;
	@Autowired
	private EmailService emailService;
	
	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#addEmployee(com.gomap.performance.master.dto.EmployeeMasterDto)
	 */
	@Override
	@Transactional
	public ResponseDTO addEmployee(EmployeeMasterDto employeeDto) {
		// TODO Auto-generated method stub
		logger.info("addEmployee.....");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			EmployeeMaster employeeMaster=new EmployeeMaster();
			if(employeeDto.getCompanyId()!=null)
			{
			employeeMaster.setCompanyId(employeeDto.getCompanyId());	
			}
			if(employeeDto.getEmail()!=null)
			{
			employeeMaster.setEmail(employeeDto.getEmail());	
			}
			if(employeeDto.getfName()!=null)
			{
			employeeMaster.setfName(employeeDto.getfName());	
			}
			if(employeeDto.getmName()!=null)
			{
			employeeMaster.setmName(employeeDto.getmName());	
			}
			if(employeeDto.getMobileNo()!=null)
			{
			employeeMaster.setMobileNo(employeeDto.getMobileNo());	
			}
			if(employeeDto.getPassword()!=null)
			{
			employeeMaster.setPassword(employeeDto.getPassword());	
			}
			UserDto user=new UserDto();
			user.setEmail(employeeMaster.getEmail());
			user.setName(employeeMaster.getfName());
			user.setPassword(employeeMaster.getPassword());
			//addUser(user);
			employeeMaster.setCreatedDate(new Date());
			employeeMaster.setActivateFlag(AppConstants.ACTIVE_FLAG);
			
			adminEmployeeDao.storeEmployeeData(employeeMaster);
			
			responseDTO.setDataObj(employeeMaster);
			responseDTO.setSuccessMsg("Employee Added");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				} catch (Exception e) {
					logger.error("Errro whhile adding employee");
					responseDTO.setDataObj(e);
					responseDTO.setErrorMsg(e.getMessage());
					responseDTO.setErrorCode(411);
			// TODO: handle exception
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#updateEmployee(com.gomap.performance.master.dto.EmployeeMasterDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateEmployee(EmployeeMasterDto employeeDto) {

		// TODO Auto-generated method stub
		logger.info("updateEmployee.....");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			
			if(employeeDto.getEmployeeId()!=null)
			{
				EmployeeMaster employeeMaster=new EmployeeMaster();
				employeeMaster.setEmployeeId(employeeDto.getEmployeeId());
				List<EmployeeMaster> employeeList=adminEmployeeDao.getAdminEmployee(employeeMaster);
				
				if(employeeList!=null && !employeeList.isEmpty())
				{
					 employeeMaster=employeeList.get(0);	
					if(employeeDto.getCompanyId()!=null)
					{
					employeeMaster.setCompanyId(employeeDto.getCompanyId());	
					}
					if(employeeDto.getEmail()!=null)
					{
					employeeMaster.setEmail(employeeDto.getEmail());	
					}
					if(employeeDto.getfName()!=null)
					{
					employeeMaster.setfName(employeeDto.getfName());	
					}
					if(employeeDto.getmName()!=null)
					{
					employeeMaster.setmName(employeeDto.getmName());	
					}
					if(employeeDto.getMobileNo()!=null)
					{
					employeeMaster.setMobileNo(employeeDto.getMobileNo());	
					}
					if(employeeDto.getPassword()!=null)
					{
					employeeMaster.setPassword(employeeDto.getPassword());	
					}
					
					employeeMaster.setUpdatedDate(new Date());
					if(employeeDto.getActivateFlag()!=null)
					{
						employeeMaster.setActivateFlag(employeeDto.getActivateFlag());
							
					}
					
					
					adminEmployeeDao.updateEmployee(employeeMaster);
					
					responseDTO.setDataObj(employeeMaster);
					responseDTO.setSuccessMsg("Employee updated");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					
				}else {
					responseDTO.setDataObj(employeeDto);
					responseDTO.setErrorMsg("Employee Details not available in System");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					
				}
				
				
					
					
			}else
			{
				responseDTO.setDataObj(employeeDto);
				responseDTO.setErrorMsg("Employee id can not be blank");
				responseDTO.setErrorCode(411);
				
			}
				} catch (Exception e) {
					logger.error("Errro whhile adding employee");
					responseDTO.setDataObj(e);
					responseDTO.setErrorMsg(e.getMessage());
					responseDTO.setErrorCode(411);
			// TODO: handle exception
		}
		return responseDTO;
	
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#employeeRoleMapping(com.gomap.performance.master.dto.EmployeeMasterDto)
	 */
	@Override
	public ResponseDTO employeeRoleMapping(EmployeeMasterDto employeeDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#employeeDepratmentMapping(com.gomap.performance.master.dto.EmployeeMasterDto)
	 */
	@Override
	public ResponseDTO employeeDepratmentMapping(EmployeeMasterDto employeeDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#getAdminEmployeeDetails(com.gomap.performance.master.dto.EmployeeMasterDto)
	 */
	@Override
	@Transactional
	public ResponseDTO getAdminEmployeeDetails(EmployeeMasterDto employeeDto) {

		// TODO Auto-generated method stub
		logger.info("getAdminEmployeeDetails");
		ResponseDTO responseDTO=new ResponseDTO();
		try {
			EmployeeMaster employeeMaster=new EmployeeMaster();
			if(employeeDto.getCompanyId()!=null)
			{
			employeeMaster.setCompanyId(employeeDto.getCompanyId());	
			}
			if(employeeDto.getEmployeeId()!=null)
			{
			employeeMaster.setEmployeeId(employeeDto.getEmployeeId());	
			}
			if(employeeDto.getfName()!=null)
			{
			employeeMaster.setfName(employeeDto.getfName());	
			}
			if(employeeDto.getmName()!=null)
			{
			employeeMaster.setmName(employeeDto.getmName());	
			}
			if(employeeDto.getMobileNo()!=null)
			{
			employeeMaster.setMobileNo(employeeDto.getMobileNo());	
			}
			
			
			
			List<EmployeeMaster> adminEmplList=adminEmployeeDao.getAdminEmployee(employeeMaster);
			
			
			responseDTO.setDataObj(adminEmplList);
			responseDTO.setSuccessMsg("Employee list sent successfully");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				} catch (Exception e) {
					logger.error("Errro whhile adding employee");
					responseDTO.setDataObj(e);
					responseDTO.setErrorMsg(e.getMessage());
					responseDTO.setErrorCode(411);
			// TODO: handle exception
		}
		return responseDTO;
	
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#addUser(com.gomap.performance.master.dto.UserDto)
	 */
	@Override
	@Transactional
	public ResponseDTO addUser(UserDto userDto) {
		// TODO Auto-generated method stub
		logger.info("addUser.....");
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			UserMaster userMaster = new UserMaster();
			if (userDto.getEmail() != null) {
				userMaster = adminEmployeeDao.getUserData(userDto.getEmail(), null, null);
				if (userMaster != null) {
					responseDTO.setDataObj(userDto);
					responseDTO.setErrorMsg("User is already available in system, please login");
					responseDTO.setErrorCode(411);
					return responseDTO;
				}
				userMaster = new UserMaster();
				userMaster.setEmail(userDto.getEmail());
			}

			if (userDto.getName() != null) {
				userMaster.setName(userDto.getName());
			}
			String pwd="Password@2020";
			userMaster.setPassword(pwd);
			userMaster.setFirstLogin("YES");
			
			if (userDto.getPassword() != null) {
				userMaster.setPassword(userDto.getPassword());
			}
			if (userDto.getUserRole() != null) {
				userMaster.setUserRole(userDto.getUserRole());
			}
			if (userDto.getCompanyInfo() != null) {
				userMaster.setCompanyInfo(userDto.getCompanyInfo());
			}

			userMaster.setCreatedDate(new Date());
			userMaster.setActivateFlag(AppConstants.ACTIVE_FLAG);
			userMaster.setEmailVerification(0);
			userMaster.setEmailToken("emf" + System.currentTimeMillis());
			adminEmployeeDao.storeUserData(userMaster);
			emailService.sendEmail(userMaster.getEmailToken(), userMaster.getEmail(),userMaster.getPassword(),userMaster.getName());
			responseDTO.setDataObj(userMaster);
			responseDTO.setSuccessMsg("User  Added");
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
		} catch (Exception e) {
			logger.error("Errro whhile adding User");
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
			// TODO: handle exception
		}
		return responseDTO;

	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#emailVerification(java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO emailVerification(String tokenId) {
		// TODO Auto-generated method stub
		logger.info("emailVerification.....");
		ResponseDTO responseDTO=new ResponseDTO();
		UserDto userDto=new UserDto();
		
		try {
			if(tokenId!=null && !("").equals(tokenId))
					{
				UserMaster userMaster=new UserMaster();
				userMaster=adminEmployeeDao.getUserDataByTokenId(tokenId);
				if(userMaster!=null)
				{
					userMaster.setEmailVerification(1);
					//adminEmployeeDao.getUserData();
					userMaster=adminEmployeeDao.updateUser(userMaster);
					userDto.setEmail(userMaster.getEmail());
					userDto.setUserId(userMaster.getUserId());
					userDto.setPassword(null);
					userDto.setName(userMaster.getName());
					userDto.setEmailVerification(userMaster.getEmailVerification());
					userDto.setEmailToken(userMaster.getEmailToken());
					userDto.setCompanyInfo(userMaster.getCompanyInfo());
					userDto.setUserRole(userMaster.getUserRole());
					responseDTO.setDataObj(userDto);
					responseDTO.setSuccessMsg("Email verification completed");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				
				}
				else {
					responseDTO.setDataObj(userMaster);
					responseDTO.setErrorMsg("This link is not valid");
					responseDTO.setErrorCode(411);
				}
				
				
						}else {
						
						responseDTO.setDataObj(null);
						responseDTO.setSuccessMsg("Please check your link with supprot admin");
						responseDTO.setErrorCode(411);
					}
			
				} catch (Exception e) {
					logger.error("Errro while adding User");
					responseDTO.setDataObj(e);
					responseDTO.setErrorMsg(e.getMessage());
					responseDTO.setErrorCode(411);
			// TODO: handle exception
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#getUserById(java.lang.Integer)
	 */
	@Override
	@Transactional
	public ResponseDTO getUserById(Integer userId) {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO=new ResponseDTO();
		
		try {
			UserMaster userMaster=adminEmployeeDao.getUserData(null, null, userId);
			if(userMaster!=null)
			{
				userMaster.setPassword(null);
				responseDTO.setDataObj(userMaster);
				responseDTO.setSuccessMsg("User info is available here");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			}else
			{
				responseDTO.setDataObj(null);
				responseDTO.setSuccessMsg("User info is not available here");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("getUserById-----",e);
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#getUserByTokenId(java.lang.String)
	 */
	@Override
	public ResponseDTO getUserByTokenId(String tokenId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.AdminEmployeeService#updateUser(com.gomap.performance.master.dto.UserDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateUser(UserDto userDto) {
		// TODO Auto-generated method stub
		logger.info("updateUser.....");
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			UserMaster userMaster = new UserMaster();
			if (userDto.getEmail() != null) {
				userMaster = adminEmployeeDao.getUserData(userDto.getEmail(), null, userDto.getUserId());
				if (userMaster != null) {
					if (userDto.getName() != null) {
						userMaster.setName(userDto.getName());
					}
					if (userDto.getPassword() != null) {
						userMaster.setPassword(userDto.getPassword());
						userMaster.setFirstLogin("NO");
					}
					userMaster.setUpdatedDate(new Date());

					adminEmployeeDao.updateUser(userMaster);
					responseDTO.setDataObj(userMaster);
					responseDTO.setErrorMsg("User data updated");
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());

				}

			}

		} catch (Exception e) {
			logger.error("Errro whhile adding User");
			responseDTO.setDataObj(e);
			responseDTO.setErrorMsg(e.getMessage());
			responseDTO.setErrorCode(411);
			// TODO: handle exception
		}
		return responseDTO;

	}

	
}

