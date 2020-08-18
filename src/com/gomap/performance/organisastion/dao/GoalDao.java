/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.dao;

import java.util.List;

import com.gomap.performance.organisastion.model.EmGoal;
import com.gomap.performance.organisastion.model.TeamGoals;

/**
 * @author krishnakant.bairagi
 *
 */
public interface GoalDao {
	public void createGoal(EmGoal emGoal) throws Exception;
	public void updateGoal(EmGoal emGoal)  throws Exception;
	public void deleteGoal(EmGoal emGoal) throws Exception;
	public List<EmGoal> getGoal(EmGoal emGoal) throws Exception;
	public List<TeamGoals> getTeamGoal(Integer teamId,Integer projectId) throws Exception;
	public List<EmGoal> getTeamGoalOnly(Integer teamId,Integer projectId) throws Exception;

}
