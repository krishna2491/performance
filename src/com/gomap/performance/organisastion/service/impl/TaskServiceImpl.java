/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.organisastion.dao.TaskDao;
import com.gomap.performance.organisastion.dto.EmTaskDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.model.EmTask;
import com.gomap.performance.organisastion.service.TaskService;

/**
 * @author krishnakant.bairagi
 *
 */
@Service
public class TaskServiceImpl implements TaskService {
	private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);
	
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.TaskService#createTask(com.gomap.performance.organisastion.dto.EmTaskDto)
	 */
	@Autowired
	private TaskDao taskDao;
	
	@Override
	@Transactional
	public ResponseDTO createTask(EmTaskDto emTaskDto) throws Exception {
		ResponseDTO responseDTO=new ResponseDTO();
		logger.info("Task Creation started");
		try {
			EmTask emTask=new EmTask();
			emTask.setActivateFlag(AppConstants.ACTIVE_FLAG);
			if(emTaskDto.getAssignedById()!=null)
			{
				emTask.setAssignedById(emTaskDto.getAssignedById());
			}
			if(emTaskDto.getAssignedToId()!=null)
			{
				emTask.setAssignedToId(emTaskDto.getAssignedToId());
			}
			if(emTaskDto.getDepartmentId()!=null)
			{
				emTask.setDepartmentId(emTaskDto.getDepartmentId());
			}
			if(emTaskDto.getProjectId()!=null)
			{
				emTask.setProjectId(emTaskDto.getProjectId());
			}
			if(emTaskDto.getTaskAttachment()!=null)
			{
				emTask.setTaskAttachment(emTaskDto.getTaskAttachment());
			}
			if(emTaskDto.getTaskDescription()!=null)
			{
				emTask.setTaskDescription(emTaskDto.getTaskDescription());
			}
			if(emTaskDto.getTaskDueDate()!=null)
			{
				emTask.setTaskDueDate(emTaskDto.getTaskDueDate());
			}
			if(emTaskDto.getTaskHeading()!=null)
			{
				emTask.setTaskHeading(emTaskDto.getTaskHeading());
			}
			if(emTaskDto.getTaskPriority()!=null)
			{
				emTask.setTaskPriority(emTaskDto.getTaskPriority());
			}
			if(emTaskDto.getTaskStartDate()!=null)
			{
				emTask.setTaskStartDate(emTaskDto.getTaskStartDate());
			}
			if(emTaskDto.getTaskStatus()!=null)
			{
				emTask.setTaskStatus(emTaskDto.getTaskStatus());
			}
			emTask.setTaskCreatedDate(new Date());
			
			taskDao.createTask(emTask);
			responseDTO.setDataObj(emTask);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setSuccessMsg("Task successfully created");
			logger.info("Task creation done---");
			
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while creating Task");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.TaskService#updateTask(com.gomap.performance.organisastion.dto.EmTaskDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateTask(EmTaskDto emTaskDto) throws Exception {
		ResponseDTO responseDTO=new ResponseDTO();
		logger.info("updateTask started");
		try {
			if(emTaskDto!=null && emTaskDto.getTaskId()!=null)
			{
				EmTask emTask=new EmTask();
				emTask.setTaskId(emTaskDto.getTaskId());
				List<EmTask> taskList=taskDao.getTask(emTask);
				if(taskList.isEmpty()) {
					responseDTO.setDataObj(null);
					responseDTO.setErrorCode(411);
					responseDTO.setErrorMsg("Task details not avaialbe in system");
				}else {
					 emTask=taskList.get(0);
							if(emTaskDto.getAssignedById()!=null)
							{
								emTask.setAssignedById(emTaskDto.getAssignedById());
							}
							if(emTaskDto.getAssignedToId()!=null)
							{
								emTask.setAssignedToId(emTaskDto.getAssignedToId());
							}
							if(emTaskDto.getDepartmentId()!=null)
							{
								emTask.setDepartmentId(emTaskDto.getDepartmentId());
							}
							if(emTaskDto.getProjectId()!=null)
							{
								emTask.setProjectId(emTaskDto.getProjectId());
							}
							if(emTaskDto.getTaskAttachment()!=null)
							{
								emTask.setTaskAttachment(emTaskDto.getTaskAttachment());
							}
							if(emTaskDto.getTaskDescription()!=null)
							{
								emTask.setTaskDescription(emTaskDto.getTaskDescription());
							}
							if(emTaskDto.getTaskDueDate()!=null)
							{
								emTask.setTaskDueDate(emTaskDto.getTaskDueDate());
							}
							if(emTaskDto.getTaskHeading()!=null)
							{
								emTask.setTaskHeading(emTaskDto.getTaskHeading());
							}
							if(emTaskDto.getTaskPriority()!=null)
							{
								emTask.setTaskPriority(emTaskDto.getTaskPriority());
							}
							if(emTaskDto.getTaskStartDate()!=null)
							{
								emTask.setTaskStartDate(emTaskDto.getTaskStartDate());
							}
							if(emTaskDto.getTaskStatus()!=null)
							{
								emTask.setTaskStatus(emTaskDto.getTaskStatus());
							}
							emTask.setTaskUpdatedDate(new Date());
							
							taskDao.createTask(emTask);
							responseDTO.setDataObj(emTask);
							responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
							responseDTO.setSuccessMsg("Task successfully created");
							logger.info("Task creation done---");
						
				}
					
						
			}
			else
			{
				responseDTO.setDataObj(null);
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg("Task id is mandatory");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while updating Task");
		}
		// TODO Auto-generated method stub
		return responseDTO;
	}

		@Override
		@Transactional
	public ResponseDTO getTask(EmTaskDto emTaskDto) throws Exception {

			ResponseDTO responseDTO=new ResponseDTO();
			logger.info("getTask started");
			try {
				EmTask emTask=new EmTask();
				if(emTaskDto.getAssignedById()!=null)
				{
					emTask.setAssignedById(emTaskDto.getAssignedById());
				}
				if(emTaskDto.getAssignedToId()!=null)
				{
					emTask.setAssignedToId(emTaskDto.getAssignedToId());
				}
				if(emTaskDto.getDepartmentId()!=null)
				{
					emTask.setDepartmentId(emTaskDto.getDepartmentId());
				}
				if(emTaskDto.getProjectId()!=null)
				{
					emTask.setProjectId(emTaskDto.getProjectId());
				}
				if(emTaskDto.getTaskAttachment()!=null)
				{
					emTask.setTaskAttachment(emTaskDto.getTaskAttachment());
				}
				if(emTaskDto.getTaskDescription()!=null)
				{
					emTask.setTaskDescription(emTaskDto.getTaskDescription());
				}
				if(emTaskDto.getTaskDueDate()!=null)
				{
					emTask.setTaskDueDate(emTaskDto.getTaskDueDate());
				}
				if(emTaskDto.getTaskHeading()!=null)
				{
					emTask.setTaskHeading(emTaskDto.getTaskHeading());
				}
				if(emTaskDto.getTaskPriority()!=null)
				{
					emTask.setTaskPriority(emTaskDto.getTaskPriority());
				}
				if(emTaskDto.getTaskStartDate()!=null)
				{
					emTask.setTaskStartDate(emTaskDto.getTaskStartDate());
				}
				if(emTaskDto.getTaskStatus()!=null)
				{
					emTask.setTaskStatus(emTaskDto.getTaskStatus());
				}
				
				
				List<EmTask> taskList=taskDao.getTask(emTask);
				responseDTO.setDataObj(taskList);
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				responseDTO.setSuccessMsg("Task list sent successfully ");
				logger.info("Task list done---");
				
			} catch (Exception e) {
				// TODO: handle exception
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg(e.getMessage());
				logger.error("Getting Error while retrieving Task");
			}
			// TODO Auto-generated method stub
			return responseDTO;
		
			
		}

}
