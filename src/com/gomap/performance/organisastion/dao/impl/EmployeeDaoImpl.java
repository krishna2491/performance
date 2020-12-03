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
import com.gomap.performance.organisastion.dao.EmployeeDao;
import com.gomap.performance.organisastion.model.DesignationElementMaping;
import com.gomap.performance.organisastion.model.EmDepartment;
import com.gomap.performance.organisastion.model.EmDesignation;
import com.gomap.performance.organisastion.model.EmEmployee;
import com.gomap.performance.organisastion.model.EmployeeElementMpg;
import com.gomap.performance.organisastion.model.EmployeeElementOperationMpg;
import com.gomap.performance.organisastion.model.Person;
import com.gomap.performance.organisastion.model.RoleElementOperationMpg;

/**
 * @author krishnakant.bairagi
 *
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#getUserByUserId(java.lang.String)
	 */
	@Override
	public EmEmployee getUserByUserId(String userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#storeEmployeeData(com.gomap.performance.organisastion.model.EmployeeMaster)
	 */
	@Override
	public EmEmployee storeEmployeeData(EmEmployee employeeMaster) throws Exception {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(employeeMaster);
		return employeeMaster;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#getEmployeeList(java.lang.Integer)
	 */
	@Override
	public List<EmEmployee> getEmployeeList(Integer employeeId,String email) throws Exception {
		// TODO Auto-generated method stub
		Criteria criteria=this.sessionFactory.getCurrentSession().createCriteria(EmEmployee.class);
		if(employeeId!=null)
		{
			criteria.add(Restrictions.eq("employeeId", employeeId));
		}
		if(email!=null)
		{
			criteria.add(Restrictions.eq("employeeEmail", email));
		}
		criteria.add(Restrictions.eq("activateFlag", AppConstants.ACTIVE_FLAG));
		criteria.addOrder(Order.desc("employeeCreatedDate"));
		return criteria.list();
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#updateEmployee(com.gomap.performance.organisastion.model.EmEmployee)
	 */
	@Override
	public EmEmployee updateEmployee(EmEmployee employeeMaster) throws Exception {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(employeeMaster);
		return employeeMaster;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#getAllEmplyeeData()
	 */
	@Override
	public List<Object> getAllEmplyeeData() throws Exception {
		// TODO Auto-generated method stub
	
	String empQuery="select new com.gomap.performance.organisastion.dto.EmployeeList(emp,des,dept) from EmEmployee as emp"+
				 ",EmDesignation des" +
		 ",EmDepartment dept where dept.departmentId=emp.departmentId and des.designationId=emp.designationId "
		 + "and emp.activateFlag=1 and des.activateFlag=1 and dept.activateFlag=1";
	
	List<Object> objList=this.sessionFactory.getCurrentSession().createQuery(empQuery).list();
		return objList;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#mapEmployeeElement(com.gomap.performance.organisastion.model.EmployeeElementMpg)
	 */
	@Override
	public EmployeeElementMpg mapEmployeeElement(EmployeeElementMpg employeeElementMpg) throws Exception {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(employeeElementMpg);
		return employeeElementMpg;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#mapOperation(com.gomap.performance.organisastion.model.EmployeeElementOperationMpg)
	 */
	@Override
	public EmployeeElementOperationMpg mapOperation(EmployeeElementOperationMpg employeeElementOperationMpg)
			throws Exception {
		this.sessionFactory.getCurrentSession().save(employeeElementOperationMpg);
		return employeeElementOperationMpg;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#getEmployeeElement(java.lang.Integer)
	 */
	@Override
	public List<EmployeeElementMpg> getEmployeeElement(Integer employeeId) throws Exception {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Criteria criteria=this.sessionFactory.getCurrentSession().createCriteria(EmployeeElementMpg.class);
		if(employeeId!=null)
		{
			criteria.add(Restrictions.eq("employeeId", employeeId));
		}
		criteria.add(Restrictions.eq("activateFlag", AppConstants.ACTIVE_FLAG));
		return criteria.list();
	
		
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#getEmployeeElementOperation(java.lang.Integer)
	 */
	@Override
	public List<EmployeeElementOperationMpg> getEmployeeElementOperation(Integer employeeElementMpgId)
			throws Exception {
		Criteria criteria=this.sessionFactory.getCurrentSession().createCriteria(EmployeeElementOperationMpg.class);
		if(employeeElementMpgId!=null)
		{
			criteria.add(Restrictions.eq("employeeElementMpgId", employeeElementMpgId));
		}
		criteria.add(Restrictions.eq("activateFlag", AppConstants.ACTIVE_FLAG));
		return criteria.list();
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#updateEmployeeElement(com.gomap.performance.organisastion.model.EmployeeElementMpg)
	 */
	@Override
	public EmployeeElementMpg updateEmployeeElement(EmployeeElementMpg employeeElementMpg) throws Exception {
		this.sessionFactory.getCurrentSession().update(employeeElementMpg);
		return employeeElementMpg;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#updateOperation(com.gomap.performance.organisastion.model.EmployeeElementOperationMpg)
	 */
	@Override
	public EmployeeElementOperationMpg updateOperation(EmployeeElementOperationMpg employeeElementOperationMpg)
			throws Exception {
		this.sessionFactory.getCurrentSession().update(employeeElementOperationMpg);
		return employeeElementOperationMpg;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#storePerson(com.gomap.performance.organisastion.model.Person)
	 */
	@Override
	public Person storePerson(Person person) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(person);
		return person;
	}

	/* (non-Javadoc)
	 * @see com.gomap.performance.organisastion.dao.EmployeeDao#getPerson()
	 */
	@Override
	public List<Person> getPerson(Integer id){
		// TODO Auto-generated method stub
		Criteria crit=this.sessionFactory.getCurrentSession().createCriteria(Person.class);
		crit.add(Restrictions.eq("id", id));
		return crit.list();
	}

	
	

}
