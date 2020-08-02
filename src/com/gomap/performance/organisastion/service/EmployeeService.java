/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service;




import com.gomap.performance.organisastion.dto.EmEmployeeDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;

/**
 * @author krishnakant.bairagi
 *
 */
public interface EmployeeService {
	public Object addEmployee(EmEmployeeDto employeeDto) throws Exception;
	public ResponseDTO employeeRoleMapping(EmEmployeeDto employeeDto) throws Exception;
	public ResponseDTO deleteEmployee(EmEmployeeDto employeeDto) throws Exception;
	public ResponseDTO employeeDepratmentMapping(EmEmployeeDto employeeDto) throws Exception;
	public ResponseDTO getMySkill() throws Exception;
	public ResponseDTO getMyTask() throws Exception;
	public ResponseDTO getMyGoal() throws Exception;
	public ResponseDTO getEmployeeList(Integer employeeId) throws Exception;
	public ResponseDTO updateEmployee(EmEmployeeDto employeeDto) throws Exception;
	public ResponseDTO getAllEmployee() throws Exception;
	public ResponseDTO getEmployeeWithElements(Integer employeeId) throws Exception;

}
