/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service;


import com.gomap.performance.organisastion.dto.EmTaskDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;

/**
 * @author krishnakant.bairagi
 *
 */
public interface TaskService {
	public ResponseDTO createTask(EmTaskDto emTaskDto) throws Exception;
	public ResponseDTO updateTask(EmTaskDto emTaskDto) throws Exception;
	public ResponseDTO getTask(EmTaskDto emTaskDto) throws Exception;
	public ResponseDTO deleteTask(EmTaskDto emTaskDto) throws Exception;
	
}
