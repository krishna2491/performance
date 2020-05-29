/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.OneToMany;

/**
 *
 * @author Palash
 */
@Entity
@Table(name = "em_designation")
@XmlRootElement
public class EmDesignation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "designation_id")
    private Integer designationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "designation_name")
    private String designationName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "department_id")
    private Integer departmentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_designation_id")
    private Integer parentDesignationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "designation_level_no")
    private Integer designationLevelNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_create_employee")
    private Integer canCreateEmployee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_create_feedback_req")
    private Integer canCreateFeedbackReq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_create_rate_skill")
    private Integer canCreateRateSkill;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_create_task")
    private Integer canCreateTask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_create_project")
    private Integer canCreateProject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_create_team")
    private Integer canCreateTeam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_add_employee_to_team")
    private Integer canAddEmployeeToTeam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_evaluate_skill")
    private Integer canEvaluateSkill;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_view_team")
    private Integer canViewTeam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_view_all_task")
    private Integer canViewAllTask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_approve_goal")
    private Integer canApproveGoal;
    @Column(name = "designation_created_date")
    @Temporal(TemporalType.DATE)
    private Date designationCreatedDate;
    @Column(name = "designation_updated_date")
    @Temporal(TemporalType.DATE)
    private Date designationUpdatedDate;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "activate_flag")
    private Integer activateFlag;
    
    public EmDesignation() {
    }

    public EmDesignation(Integer designationId) {
        this.designationId = designationId;
    }

    public EmDesignation(Integer designationId, String designationName, Integer departmentId, Integer parentDesignationId, Integer designationLevelNo, Integer canCreateEmployee, Integer canCreateFeedbackReq, Integer canCreateRateSkill, Integer canCreateTask, Integer canCreateProject, Integer canCreateTeam, Integer canAddEmployeeToTeam, Integer canEvaluateSkill, Integer canViewTeam, Integer canViewAllTask, Integer canApproveGoal) {
        this.designationId = designationId;
        this.designationName = designationName;
        this.departmentId = departmentId;
        this.parentDesignationId = parentDesignationId;
        this.designationLevelNo = designationLevelNo;
        this.canCreateEmployee = canCreateEmployee;
        this.canCreateFeedbackReq = canCreateFeedbackReq;
        this.canCreateRateSkill = canCreateRateSkill;
        this.canCreateTask = canCreateTask;
        this.canCreateProject = canCreateProject;
        this.canCreateTeam = canCreateTeam;
        this.canAddEmployeeToTeam = canAddEmployeeToTeam;
        this.canEvaluateSkill = canEvaluateSkill;
        this.canViewTeam = canViewTeam;
        this.canViewAllTask = canViewAllTask;
        this.canApproveGoal = canApproveGoal;
    }

    public Integer getDesignationId() {
        return designationId;
    }

    public void setDesignationId(Integer designationId) {
        this.designationId = designationId;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getParentDesignationId() {
        return parentDesignationId;
    }

    public void setParentDesignationId(Integer parentDesignationId) {
        this.parentDesignationId = parentDesignationId;
    }

    public Integer getDesignationLevelNo() {
        return designationLevelNo;
    }

    public void setDesignationLevelNo(Integer designationLevelNo) {
        this.designationLevelNo = designationLevelNo;
    }

    public Integer getCanCreateEmployee() {
        return canCreateEmployee;
    }

    public void setCanCreateEmployee(Integer canCreateEmployee) {
        this.canCreateEmployee = canCreateEmployee;
    }

    public Integer getCanCreateFeedbackReq() {
        return canCreateFeedbackReq;
    }

    public void setCanCreateFeedbackReq(Integer canCreateFeedbackReq) {
        this.canCreateFeedbackReq = canCreateFeedbackReq;
    }

    public Integer getCanCreateRateSkill() {
        return canCreateRateSkill;
    }

    public void setCanCreateRateSkill(Integer canCreateRateSkill) {
        this.canCreateRateSkill = canCreateRateSkill;
    }

    public Integer getCanCreateTask() {
        return canCreateTask;
    }

    public void setCanCreateTask(Integer canCreateTask) {
        this.canCreateTask = canCreateTask;
    }

    public Integer getCanCreateProject() {
        return canCreateProject;
    }

    public void setCanCreateProject(Integer canCreateProject) {
        this.canCreateProject = canCreateProject;
    }

    public Integer getCanCreateTeam() {
        return canCreateTeam;
    }

    public void setCanCreateTeam(Integer canCreateTeam) {
        this.canCreateTeam = canCreateTeam;
    }

    public Integer getCanAddEmployeeToTeam() {
        return canAddEmployeeToTeam;
    }

    public void setCanAddEmployeeToTeam(Integer canAddEmployeeToTeam) {
        this.canAddEmployeeToTeam = canAddEmployeeToTeam;
    }

    public Integer getCanEvaluateSkill() {
        return canEvaluateSkill;
    }

    public void setCanEvaluateSkill(Integer canEvaluateSkill) {
        this.canEvaluateSkill = canEvaluateSkill;
    }

    public Integer getCanViewTeam() {
        return canViewTeam;
    }

    public void setCanViewTeam(Integer canViewTeam) {
        this.canViewTeam = canViewTeam;
    }

    public Integer getCanViewAllTask() {
        return canViewAllTask;
    }

    public void setCanViewAllTask(Integer canViewAllTask) {
        this.canViewAllTask = canViewAllTask;
    }

    public Integer getCanApproveGoal() {
        return canApproveGoal;
    }

    public void setCanApproveGoal(Integer canApproveGoal) {
        this.canApproveGoal = canApproveGoal;
    }

    public Date getDesignationCreatedDate() {
        return designationCreatedDate;
    }

    public void setDesignationCreatedDate(Date designationCreatedDate) {
        this.designationCreatedDate = designationCreatedDate;
    }

    public Date getDesignationUpdatedDate() {
        return designationUpdatedDate;
    }

    public void setDesignationUpdatedDate(Date designationUpdatedDate) {
        this.designationUpdatedDate = designationUpdatedDate;
    }

   
   
    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmDesignation[ designationId=" + designationId + " ]";
    }
    @PrePersist
	public void prePersist() {
	    if(activateFlag == null) //We set default value in case if the value is not set yet.
	        activateFlag = 1;
	    System.out.println("coming here");
	}

	/**
	 * @return the activateFlag
	 */
	public Integer getActivateFlag() {
		return activateFlag;
	}

	/**
	 * @param activateFlag the activateFlag to set
	 */
	public void setActivateFlag(Integer activateFlag) {
		this.activateFlag = activateFlag;
	}

	/**
	 * @return the designationElementMaping
	 */
		
	    
}
