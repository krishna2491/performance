/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gomap.performance.master.constant.AppConstants;
import com.gomap.performance.master.dao.CompanyDao;
import com.gomap.performance.master.model.CompanyMaster;

/**
 * @author krishnakant.bairagi
 *
 */
@Repository
public class CompanyDaoImpl implements CompanyDao {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gomap.performance.master.dao.CompanyDao#storeCompanyData(com.gomap.
	 * performance.master.model.CompanyMaster)
	 */

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public CompanyMaster updateCompany(CompanyMaster companyMaster) throws Exception {
		sessionFactory.getCurrentSession().update(companyMaster);
		return companyMaster;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gomap.performance.master.dao.CompanyDao#getCompanyDetails(com.gomap.
	 * performance.master.model.CompanyMaster)
	 */
	@Override
	public List<CompanyMaster> getCompanyDetails(CompanyMaster companyMaster) throws Exception {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CompanyMaster.class);
		if (companyMaster.getCompanyId() != null) {
			criteria.add(Restrictions.eq("companyId", companyMaster.getCompanyId()));
		}
		if (companyMaster.getCompanyName() != null) {
			criteria.add(Restrictions.like("companyName", companyMaster.getCompanyName()));
		}
//			if(companyMaster.getCompanyName()!=null)
//			{
//				criteria.add(Restrictions.eq("companyName", companyMaster.getCompanyId()));
//			}
//			if(companyMaster.getCompanyName()!=null)
//			{
//				criteria.add(Restrictions.eq("companyName", companyMaster.getCompanyId()));
//			}
		criteria.add(Restrictions.eq("activateFlag", AppConstants.ACTIVE_FLAG));
		return criteria.list();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gomap.performance.master.dao.CompanyDao#storeCompanyData(com.gomap.
	 * performance.master.model.CompanyMaster)
	 */
	@Override
	public CompanyMaster storeCompanyData(CompanyMaster companyMaster) throws Exception {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(companyMaster);
		return companyMaster;
	}

}
