/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service;


import com.gomap.performance.organisastion.dto.EmGoalDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;

/**
 * @author krishnakant.bairagi
 *
 */
public interface GoalService {
	public ResponseDTO createGoal(EmGoalDto emGoalDto) throws Exception;
	public ResponseDTO updateGoal(EmGoalDto emGoalDto) throws Exception;
	public ResponseDTO getGoal(EmGoalDto emGoalDto) throws Exception;
	public ResponseDTO deleteGoal(Integer goalId,Integer empId,Integer projetId) throws Exception;
	

}
