/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.model;

import java.io.Serializable;

/**
 * @author Fujitsu
 *
 */
public class TeamTask implements Serializable {
	private EmEmployee employee;
	private EmTeam team;
	private EmTask task;
	/**
	 * @return the employee
	 */
	public EmEmployee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(EmEmployee employee) {
		this.employee = employee;
	}
	/**
	 * @return the team
	 */
	public EmTeam getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(EmTeam team) {
		this.team = team;
	}
	/**
	 * @return the task
	 */
	public EmTask getTask() {
		return task;
	}
	/**
	 * @param task the task to set
	 */
	public void setTask(EmTask task) {
		this.task = task;
	}
	/**
	 * @param employee
	 * @param team
	 * @param task
	 */
	public TeamTask(EmEmployee employee, EmTeam team, EmTask task) {
		super();
		this.employee = employee;
		this.team = team;
		this.task = task;
	}
public TeamTask() {}
}
