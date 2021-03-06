/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.dao;

import java.util.List;

import com.gomap.performance.organisastion.model.EmTask;
import com.gomap.performance.organisastion.model.EmployeeTaskMpg;
import com.gomap.performance.organisastion.model.TeamTask;

/**
 * @author krishnakant.bairagi
 *
 */
public interface TaskDao {
	public void createTask(EmTask emTask) throws Exception;
	public void updateTask(EmTask emTask)  throws Exception;
	public void deleteTask(EmTask emTask) throws Exception;
	public List<EmTask> getTask(EmTask emTask) throws Exception;
	public void mapEMployeeTask(EmployeeTaskMpg employeeTaskMpg) throws Exception;
	public void updateEmplyeeTaskMpg(EmployeeTaskMpg employeeTaskMpg) throws Exception;
	public List<EmployeeTaskMpg> getEmployeeTask(Integer employeeId,Integer taskId) throws Exception;
public List<TeamTask> getMyTeamTask(Integer createdBy, Integer assignToId, Integer asssignById, Integer projectId,
		Integer teamId);
}
