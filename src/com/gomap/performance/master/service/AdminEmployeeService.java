/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.service;

import com.gomap.performance.master.dto.EmployeeDto;
import com.gomap.performance.master.dto.EmployeeMasterDto;
import com.gomap.performance.master.dto.ResponseDTO;
import com.gomap.performance.master.dto.UserDto;

/**
 * @author krishnakant.bairagi
 *
 */
public interface AdminEmployeeService {
	public ResponseDTO addEmployee(EmployeeMasterDto employeeDto);
	public ResponseDTO updateEmployee(EmployeeMasterDto employeeDto);
	public ResponseDTO employeeRoleMapping(EmployeeMasterDto employeeDto);
	public ResponseDTO employeeDepratmentMapping(EmployeeMasterDto employeeDto);
	public ResponseDTO getAdminEmployeeDetails(EmployeeMasterDto employeeDto);
	public ResponseDTO addUser(UserDto userDto);
}
