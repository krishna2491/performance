/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.service.impl;

import java.util.ArrayList;
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
import com.gomap.performance.organisastion.dto.EmTeamMemberDto;
import com.gomap.performance.organisastion.dto.EmployeeTaskMpgDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.model.EmTask;
import com.gomap.performance.organisastion.model.EmTeamMember;
import com.gomap.performance.organisastion.model.EmployeeTaskMpg;
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
			if(emTaskDto.getComment()!=null)
			{
				emTask.setComment(emTaskDto.getComment());
			}
			if(emTaskDto.getReply()!=null)
			{
				emTask.setReply(emTaskDto.getReply());
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
							if(emTaskDto.getComment()!=null)
							{
								emTask.setComment(emTaskDto.getComment());
							}
							if(emTaskDto.getReply()!=null)
							{
								emTask.setReply(emTaskDto.getReply());
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
				if(emTaskDto.getTaskId()!=null)
				{
					emTask.setTaskId(emTaskDto.getTaskId());
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

		/* (non-Javadoc)
		 * @see com.gomap.performance.organisastion.service.TaskService#deleteTask(com.gomap.performance.organisastion.dto.EmTaskDto)
		 */
		@Override
		@Transactional
		public ResponseDTO deleteTask(EmTaskDto emTaskDto) throws Exception {
			logger.debug("start  deleteTask for =" + emTaskDto.getTaskId());
			ResponseDTO responseDTO = new ResponseDTO();
			try {
				EmTask emTask = new EmTask();
				if (emTaskDto == null && emTaskDto.getTaskId() == null) {
					responseDTO.setErrorCode(411);
					responseDTO.setErrorMsg("Task parameter can not be null");
				} else {
					emTask.setTaskId(emTaskDto.getTaskId());
					List<EmTask> taskList = taskDao.getTask(emTask);
							
					if (taskList.isEmpty()) {
						responseDTO.setErrorCode(412);
						responseDTO.setErrorMsg("Task data is not availabe in system");
					} else {
						 emTask = taskList.get(0);
					
						 emTask.setActivateFlag(AppConstants.IN_ACTIVE_FLAG);
						 emTask.setTaskUpdatedDate(new Date());
							taskDao.deleteTask(emTask);
							responseDTO.setDataObj(emTask);
							responseDTO.setSuccessMsg("Data deleted..");
							responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
						

					}

				}

				
			} catch (Exception e) {
				// TODO: handle exception
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg(e.getMessage());
				logger.error(" Error while deleting deleteTeam");
			}
			// TODO Auto-generated method stub
			return responseDTO;

		}

		/* (non-Javadoc)
		 * @see com.gomap.performance.organisastion.service.TaskService#mapEmployeeTask(com.gomap.performance.organisastion.dto.EmployeeTaskMpgDto)
		 */
		@Override
		@Transactional
		public ResponseDTO mapEmployeeTask(List<EmployeeTaskMpgDto> employeeTaskMpgDtoList) throws Exception {
			// TODO Auto-generated method stub
			ResponseDTO responseDTO =new ResponseDTO();
			logger.info("mapEmployeeTask...... ");
			try {
				EmployeeTaskMpg employeeTaskMpg=null;//new EmTeamMember();
				List<EmployeeTaskMpg> employeeTaskList=new ArrayList<EmployeeTaskMpg>();
				for(EmployeeTaskMpgDto dtEmployeeTaskMpgDto:employeeTaskMpgDtoList)
				{
					employeeTaskMpg=new EmployeeTaskMpg();
					if(dtEmployeeTaskMpgDto.getEmployeeTaskId()==null)
					{
						// create mapping
						employeeTaskMpg.setCreatedDate(new Date());
						employeeTaskMpg.setActivateFlag(AppConstants.ACTIVE_FLAG);
						if(dtEmployeeTaskMpgDto.getEmployeeId()!=null)
						{
							employeeTaskMpg.setEmployeeId(dtEmployeeTaskMpgDto.getEmployeeId());
						}
						if(dtEmployeeTaskMpgDto.getTaskId()!=null)
						{
							employeeTaskMpg.setTaskId(dtEmployeeTaskMpgDto.getTaskId());
						}
						//teamManagmentDao.addTeamMember(emTeamMember);
						taskDao.mapEMployeeTask(employeeTaskMpg);
					}else
					{
						// update mapping
						employeeTaskMpg.setEmployeeTaskId(dtEmployeeTaskMpgDto.getEmployeeTaskId());
						
						employeeTaskMpg.setUpdatedDate(new Date());
						if(dtEmployeeTaskMpgDto.getEmployeeId()!=null)
						{
							employeeTaskMpg.setEmployeeId(dtEmployeeTaskMpgDto.getEmployeeId());
						}
						if(dtEmployeeTaskMpgDto.getTaskId()!=null)
						{
							employeeTaskMpg.setTaskId(dtEmployeeTaskMpgDto.getTaskId());
						}
						if(dtEmployeeTaskMpgDto.getActivateFlag()!=null)
						{
							employeeTaskMpg.setActivateFlag(dtEmployeeTaskMpgDto.getActivateFlag());	
						}
						if(dtEmployeeTaskMpgDto.getCreatedDate()!=null)
						{
							employeeTaskMpg.setCreatedDate(dtEmployeeTaskMpgDto.getCreatedDate());	
						}
					
						taskDao.updateEmplyeeTaskMpg(employeeTaskMpg);
						
					}
					employeeTaskList.add(employeeTaskMpg);
							
				}
				responseDTO.setDataObj(employeeTaskList);
				responseDTO.setSuccessMsg("All mapping completed");
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				logger.info("add Task Member...... successfully completed ");
				
			} catch (Exception e) {
				// TODO: handle exception
				responseDTO.setDataObj(e);
				responseDTO.setErrorMsg("problem while adding employee and task");
				responseDTO.setErrorCode(411);
				
				logger.error("Error in mapEmployeeTask...... ",e);
				
			}
			return responseDTO;
		}

	

		/* (non-Javadoc)
		 * @see com.gomap.performance.organisastion.service.TaskService#getEmployeeTaskList(java.util.List)
		 */
		@Override
		@Transactional
		public ResponseDTO getEmployeeTaskList(Integer taskId,Integer employeeId) throws Exception {
			// TODO Auto-generated method stub
			ResponseDTO responseDTO =new ResponseDTO();
			logger.info("mapEmployeeTask...... ");
			try {
			
				List<EmployeeTaskMpg> employeeTaskList=new ArrayList<EmployeeTaskMpg>();
				employeeTaskList=taskDao.getEmployeeTask(employeeId, taskId);
				responseDTO.setDataObj(employeeTaskList);
				responseDTO.setSuccessMsg("Employee with task details sent");
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				logger.info("getEmployeeTaskList...... successfully completed ");
				
			} catch (Exception e) {
				// TODO: handle exception
				responseDTO.setDataObj(e);
				responseDTO.setErrorMsg("problem while getEmployeeTaskList");
				responseDTO.setErrorCode(411);
				
				logger.error("Error in getEmployeeTaskList...... ",e);
				
			}
			return responseDTO;
		}

		/* (non-Javadoc)
		 * @see com.gomap.performance.organisastion.service.TaskService#getMyTeamTask(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
		 */
		@Override
		@Transactional
		public ResponseDTO getMyTeamTask(Integer createdBy, Integer assignToId, Integer asssignById, Integer projectId,
				Integer teamId) throws Exception {
			ResponseDTO responseDTO =new ResponseDTO();
			logger.info("getMyTeamTask...... start ");
			try {
				if(createdBy==-1)
				{
					createdBy=null;
				}
				if(assignToId==-1)
				{
					assignToId=null;
				}
				if(asssignById==-1)
				{
					asssignById=null;
				}
				if(projectId==-1)
				{
					projectId=null;
				}
				if(teamId==-1)
				{
					teamId=null;
				}
				responseDTO.setDataObj(taskDao.getMyTeamTask(createdBy, assignToId, asssignById, projectId, teamId));
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				responseDTO.setSuccessMsg("Employee with task details sent");
			} catch (Exception e) {
				// TODO: handle exception
				logger.error("error in ");
				responseDTO.setDataObj(e);
				responseDTO.setErrorMsg("problem while getting team task");
				responseDTO.setErrorCode(411);
				
			}
			// TODO Auto-generated method stub
			return responseDTO;
		}

}
