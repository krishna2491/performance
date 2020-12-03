/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service;




import com.gomap.performance.organisastion.dto.EmEmployeeDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.model.EmEmployee;
import com.gomap.performance.organisastion.model.Person;

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
	public ResponseDTO getEmployeeList(Integer employeeId,String emailId) throws Exception;
	public ResponseDTO updateEmployee(EmEmployeeDto employeeDto) throws Exception;
	public ResponseDTO getAllEmployee() throws Exception;
	public ResponseDTO getEmployeeWithElements(Integer employeeId) throws Exception;
	public ResponseDTO storeFiles(Person pp,byte[] bb) throws Exception;
	public ResponseDTO getFiles(Person pp) throws Exception;
	public EmEmployee mapEmployeeFile(Integer fileId,Integer employeeId) throws Exception;
	
	/**
	 * @param employeeId
	 * @param emailIdn
	 * @return
	 * @throws Exception
	 */

}
