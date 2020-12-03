/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.dao;

import java.util.List;

import com.gomap.performance.organisastion.model.DesignationElementMaping;
import com.gomap.performance.organisastion.model.EmEmployee;
import com.gomap.performance.organisastion.model.EmployeeElementMpg;
import com.gomap.performance.organisastion.model.EmployeeElementOperationMpg;
import com.gomap.performance.organisastion.model.Person;
import com.gomap.performance.organisastion.model.RoleElementOperationMpg;

/**
 * @author krishnakant.bairagi
 *
 */
public interface EmployeeDao {
	public EmEmployee getUserByUserId(String userId) throws Exception;
	public EmEmployee storeEmployeeData(EmEmployee employeeMaster) throws Exception;
	public List<EmEmployee> getEmployeeList(Integer employeeId,String email) throws Exception;
	public EmEmployee updateEmployee(EmEmployee employeeMaster) throws Exception;
	public List<Object> getAllEmplyeeData() throws Exception;
	public EmployeeElementMpg mapEmployeeElement(EmployeeElementMpg employeeElementMpg) throws Exception;
	public EmployeeElementOperationMpg mapOperation(EmployeeElementOperationMpg  employeeElementOperationMpg) throws Exception;
	
	public EmployeeElementMpg updateEmployeeElement(EmployeeElementMpg employeeElementMpg) throws Exception;
	public EmployeeElementOperationMpg updateOperation(EmployeeElementOperationMpg  employeeElementOperationMpg) throws Exception;
	
	public List<EmployeeElementMpg> getEmployeeElement(Integer employeeId ) throws Exception;
	public List<EmployeeElementOperationMpg> getEmployeeElementOperation(Integer employeeElementMpgId) throws Exception;
	public Person storePerson(Person person);
	public List<Person> getPerson(Integer id);
	
}
