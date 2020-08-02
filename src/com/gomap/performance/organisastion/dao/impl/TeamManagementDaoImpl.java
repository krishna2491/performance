/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.organisastion.dao.TeamManagmentDao;
import com.gomap.performance.organisastion.model.EmTeam;
import com.gomap.performance.organisastion.model.EmTeamMember;

/**
 * @author krishnakant.bairagi
 *
 */
@Repository
public class TeamManagementDaoImpl implements  TeamManagmentDao {

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.TeamManagmentDao#createTeam(com.gomap.performance.organisastion.model.EmTeam)
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createTeam(EmTeam emTeam) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(emTeam);
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.TeamManagmentDao#updateTeam(com.gomap.performance.organisastion.model.EmTeam)
	 */
	@Override
	public void updateTeam(EmTeam emTeam) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(emTeam);
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.TeamManagmentDao#deleteTeam(com.gomap.performance.organisastion.model.EmTeam)
	 */
	@Override
	public void deleteTeam(EmTeam emTeam) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(emTeam);
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.TeamManagmentDao#getTeam(com.gomap.performance.organisastion.model.EmTeam)
	 */
	@Override
	public List<EmTeam> getTeam(EmTeam emTeam) throws Exception {
		// TODO Auto-generated method stub
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(EmTeam.class);
		if(emTeam!=null)
		{
			if(emTeam.getTeamId()!=null)
			{
				criteria.add(Restrictions.eq("teamId", emTeam.getTeamId()));
			}	
			if(emTeam.getDepartmentId()!=null)
			{
				criteria.add(Restrictions.eq("departmentId", emTeam.getDepartmentId()));
			}
			if(emTeam.getProjectId()!=null)
			{
				criteria.add(Restrictions.eq("projectId", emTeam.getProjectId()));
			}
			if(emTeam.getTeamCreatedBy()!=null)
			{
				criteria.add(Restrictions.eq("teamCreatedBy", emTeam.getTeamCreatedBy()));
			}
			if(emTeam.getTeamUpdatedBy()!=null)
			{
				criteria.add(Restrictions.eq("teamUpdatedBy", emTeam.getTeamUpdatedBy()));
			}
			if(emTeam.getTeamName()!=null)
			{
				criteria.add(Restrictions.like("teamName", emTeam.getTeamName()));
			}
			
		}
		
		criteria.add(Restrictions.eq("activateFlag", AppConstants.ACTIVE_FLAG));
		criteria.addOrder(Order.desc("teamCreatedDate"));
		
		return criteria.list();
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.TeamManagmentDao#addTeamMember(com.gomap.performance.organisastion.model.EmTeamMember)
	 */
	@Override
	public void addTeamMember(EmTeamMember emTeamMember) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(emTeamMember);
		
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.TeamManagmentDao#updateTeamMember(com.gomap.performance.organisastion.model.EmTeamMember)
	 */
	@Override
	public void updateTeamMember(EmTeamMember emTeamMember) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.TeamManagmentDao#getTeamMember(com.gomap.performance.organisastion.model.EmTeamMember)
	 */
	@Override
	public List<EmTeamMember> getTeamMember(EmTeamMember emTeamMember) throws Exception {
		// TODO Auto-generated method stub
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(EmTeamMember.class);
		if(emTeamMember.getTeamMemberId()!=null)
		{
			criteria.add(Restrictions.eq("teamMemberId", emTeamMember.getTeamMemberId()));
		}
		if(emTeamMember.getTeamId()!=null)
		{
			criteria.add(Restrictions.eq("teamId", emTeamMember.getTeamId()));
		}
		if(emTeamMember.getEmployeeId()!=null)
		{
			criteria.add(Restrictions.eq("employeeId", emTeamMember.getEmployeeId()));
		}
		
			criteria.add(Restrictions.eq("activateFlag", AppConstants.ACTIVE_FLAG));
		return criteria.list();
	}

}
