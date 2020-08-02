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
import com.gomap.performance.organisastion.dao.SkillDao;
import com.gomap.performance.organisastion.dto.EmEmployeeSkillMpgDto;
import com.gomap.performance.organisastion.dto.EmSkillDto;
import com.gomap.performance.organisastion.dto.ResponseDTO;
import com.gomap.performance.organisastion.enumorg.ErrorCodeEnums;
import com.gomap.performance.organisastion.model.EmEmployeeSkillMpg;
import com.gomap.performance.organisastion.model.EmSkill;
import com.gomap.performance.organisastion.service.SkillService;

/**
 * @author krishnakant.bairagi
 *
 */
@Service
public class SkillServiceImpl implements SkillService {
	private static final Logger logger = LoggerFactory.getLogger(SkillServiceImpl.class);
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#createSkill(com.gomap.performance.organisastion.dto.EmSkillDto)
	 */
	@Autowired
	private SkillDao skillDao;
	
	
	@Override
	@Transactional
	public ResponseDTO createSkill(EmSkillDto emSkillDto) throws Exception {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO=new ResponseDTO();
		logger.info("Skill Creation started");
		try {
		
		if(emSkillDto!=null && emSkillDto.getSkillName()!=null)
		{
			EmSkill emSkill=new EmSkill();
			emSkill.setSkillCreatedDate(new Date());
			emSkill.setSkillName(emSkillDto.getSkillName());
			emSkill.setActivateFlag(AppConstants.ACTIVE_FLAG);
			skillDao.createSkill(emSkill);
			responseDTO.setDataObj(emSkill);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setSuccessMsg("Skill successfully created");
			logger.info("Skil creation done---");
			
			
		}else
		{
			responseDTO.setDataObj(null);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setErrorMsg("Skill not created, please put skill Name");
			logger.error("Skil creation fail---");
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while creating Task");
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#updateSkill(com.gomap.performance.organisastion.dto.EmSkillDto)
	 */
	@Override
	@Transactional
	public ResponseDTO updateSkill(EmSkillDto emSkillDto) throws Exception {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO = new ResponseDTO();
		logger.info("Skill Creation started");
		try {

			EmSkill emSkill = new EmSkill();
			if (emSkillDto != null) {
				if (emSkillDto.getSkillId() != null) {
					emSkill.setSkillId(emSkillDto.getSkillId());
				}
				List<EmSkill> skillList = skillDao.getSkill(emSkill);
				if (skillList.isEmpty()) {
					responseDTO.setDataObj(skillDao.getSkill(emSkill));
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					responseDTO.setErrorMsg("Data is not available in system");

				} else {
					emSkill = skillList.get(0);
					if (emSkillDto.getSkillName() != null) {
						emSkill.setSkillName(emSkillDto.getSkillName());
					}
					emSkill.setSkillUpdatedDate(new Date());
					skillDao.updateSkill(emSkill);
					responseDTO.setDataObj(emSkill);
					responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
					responseDTO.setSuccessMsg("Data updated in system");

				}

			} else {
				responseDTO.setDataObj(null);
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg("Please provide skill id");
			}
			logger.info("Skill update done---");

		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while updating skill");
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#deleteSkill(com.gomap.performance.organisastion.dto.EmSkillDto)
	 */
	@Override
	@Transactional
	public ResponseDTO deleteSkill(EmSkillDto emSkillDto) throws Exception {
		logger.debug("start  deleteSkill for skillId=" + emSkillDto.getSkillId());
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			EmSkill emSkill = new EmSkill();
			if (emSkillDto == null && emSkillDto.getSkillId() == null) {
				responseDTO.setErrorCode(411);
				responseDTO.setErrorMsg("Team parameter can not be null");
			} else {
				emSkill.setSkillId(emSkillDto.getSkillId());
				List<EmSkill> skillList = skillDao.getSkill(emSkill);
						
				if (skillList.isEmpty()) {
					responseDTO.setErrorCode(412);
					responseDTO.setErrorMsg(" data is not availabe in system");
				} else {
					 emSkill = skillList.get(0);
				
					 emSkill.setActivateFlag(AppConstants.IN_ACTIVE_FLAG);
					 emSkill.setSkillUpdatedDate(new Date());
					 skillDao.deleteSkill(emSkill);
						responseDTO.setDataObj(emSkill);
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
	 * @see com.gomap.performance.organisastion.service.SkillService#getSkill(com.gomap.performance.organisastion.dto.EmSkillDto)
	 */
	@Override
	@Transactional
	public ResponseDTO getSkill(EmSkillDto emSkillDto) throws Exception {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO = new ResponseDTO();
		logger.info("Skill Creation started");
		try {
			EmSkill emSkill = new EmSkill();
			if (emSkillDto != null) {
				if (emSkillDto.getSkillId() != null) {
					emSkill.setSkillId(emSkillDto.getSkillId());
				}
				if (emSkillDto.getSkillName() != null) {
					emSkill.setSkillName(emSkillDto.getSkillName());
				}
				responseDTO.setDataObj(skillDao.getSkill(emSkill));
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				responseDTO.setSuccessMsg("Skill list sent");

			} else {
				responseDTO.setDataObj(skillDao.getSkill(null));
				responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
				responseDTO.setSuccessMsg("Skill list sent");
			}
			logger.info("Skill list done---");

		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while getting Skill");
		}
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#mapEmployeeSkill(com.gomap.performance.organisastion.dto.EmEmployeeSkillMpgDto)
	 */
	@Override
	@Transactional
	public ResponseDTO mapEmployeeSkill(EmEmployeeSkillMpgDto emEmployeeSkillMpgDto) throws Exception {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO=new ResponseDTO();
		logger.info("Skill Creation started");
		
		if(emEmployeeSkillMpgDto!=null && emEmployeeSkillMpgDto.getSkillId()!=null && emEmployeeSkillMpgDto.getEmployeeId()!=null)
		{
			EmEmployeeSkillMpg emEmployeeSkillMpg=new EmEmployeeSkillMpg();
			
			if(emEmployeeSkillMpgDto.getSkillMpgId()!=null)
			{
				emEmployeeSkillMpg.setSkillMpgId(emEmployeeSkillMpgDto.getSkillMpgId());
				emEmployeeSkillMpg.setCreatedDate(emEmployeeSkillMpgDto.getCreatedDate());
				emEmployeeSkillMpg.setUpdatedDate(new Date());
			}else {emEmployeeSkillMpg.setCreatedDate(new Date());}
			emEmployeeSkillMpg.setSkillId(emEmployeeSkillMpgDto.getSkillId());
			emEmployeeSkillMpg.setEmployeeId(emEmployeeSkillMpgDto.getEmployeeId());
			if(emEmployeeSkillMpgDto.getActivateFlag()!=null) {
				emEmployeeSkillMpg.setActivateFlag(emEmployeeSkillMpgDto.getActivateFlag());
					
			}
			skillDao.mapEmployeeSkill(emEmployeeSkillMpg);
			responseDTO.setDataObj(emEmployeeSkillMpg);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setSuccessMsg("Skill successfully Maped");
			logger.info("Skil creation done---");
			
			
		}else
		{
			responseDTO.setDataObj(null);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setErrorMsg("Skill not created, please put skillId and employeeId");
			logger.error("Skill mapping fail---");
			
		}
		
		
		return responseDTO;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#updateEmployeeSkill(com.gomap.performance.organisastion.dto.EmEmployeeSkillMpgDto)
	 */
	@Override
	public ResponseDTO updateEmployeeSkill(EmEmployeeSkillMpgDto emEmployeeSkillMpgDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#deleteEmployeeSkill(com.gomap.performance.organisastion.dto.EmEmployeeSkillMpgDto)
	 */
	@Override
	public ResponseDTO deleteEmployeeSkill(EmEmployeeSkillMpgDto emEmployeeSkillMpgDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#getEmployeeSkill(com.gomap.performance.organisastion.dto.EmEmployeeSkillMpgDto)
	 */
	@Override
	@Transactional
	public ResponseDTO getEmployeeSkill(EmEmployeeSkillMpgDto emEmployeeSkillMpgDto) throws Exception {

		// TODO Auto-generated method stub
		ResponseDTO responseDTO = new ResponseDTO();
		logger.info("getEmployeeSkill started");
		try {
			responseDTO.setDataObj(skillDao.getEMployeeSkill(emEmployeeSkillMpgDto.getEmployeeId(),
					emEmployeeSkillMpgDto.getSkillId()));
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setSuccessMsg("Employee skill mapping retrieved successfully");
		} catch (Exception e) {
			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
			logger.error("Getting Error while calling getEmployeeSkill",e);
		}
		return responseDTO;

	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.service.SkillService#processSkilList(java.util.List)
	 */
	@Override
	@Transactional
	public ResponseDTO processSkilList(List<EmEmployeeSkillMpgDto> emEmployeeSkillMpgDtoList) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Start processSkilList");
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			if(emEmployeeSkillMpgDtoList!=null && !emEmployeeSkillMpgDtoList.isEmpty())
			{
				for(EmEmployeeSkillMpgDto emEmployeeSkillMpgDto:emEmployeeSkillMpgDtoList)
				{
					mapEmployeeSkill(emEmployeeSkillMpgDto);
				}
			}
			
			responseDTO.setDataObj(null);
			responseDTO.setErrorCode(ErrorCodeEnums.NO_ERROR.getErrorCode());
			responseDTO.setErrorMsg("Skill Maped with employee successfully");
			
			
		} catch (Exception e) {
			// TODO: handle exception

			// TODO: handle exception
			responseDTO.setErrorCode(411);
			responseDTO.setErrorMsg(e.getMessage());
	
			logger.error("Error in processSkilList",e);
		}
		return responseDTO;
	}

}
