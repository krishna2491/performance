/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomap.performance.master.dao.AdminEmployeeDao;
import com.gomap.performance.master.dto.LoginDTO;
import com.gomap.performance.master.dto.ResponseDTO;
import com.gomap.performance.master.model.EmployeeMaster;
import com.gomap.performance.master.service.AdminLoginService;
import com.gomap.performance.organisastion.model.EmEmployee;

/**
 * @author krishnakant.bairagi
 *
 */
@Service
public class LoginServiceImpl implements AdminLoginService {

	
	@Autowired
	private HttpSession httpSession;
	
	@Autowired
	private AdminEmployeeDao employeeDao;

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.LoginService#authenticate(com.gomap.performance.master.dto.LoginDTO)
	 */
	@Override
	public ResponseDTO authenticate(LoginDTO loginDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.LoginService#logout()
	 */
	@Override
	public void logout() throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.master.service.LoginService#isValidUserFeature(java.lang.String)
	 */
	@Override
	public ResponseDTO isValidUserFeature(String userFeatureId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
