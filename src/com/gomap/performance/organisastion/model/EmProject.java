/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Palash
 */
@Entity
@Table(name = "em_project")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmProject.findAll", query = "SELECT e FROM EmProject e")
    , @NamedQuery(name = "EmProject.findByProjectId", query = "SELECT e FROM EmProject e WHERE e.projectId = :projectId")
    , @NamedQuery(name = "EmProject.findByDepartmentId", query = "SELECT e FROM EmProject e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmProject.findByProjectName", query = "SELECT e FROM EmProject e WHERE e.projectName = :projectName")
    , @NamedQuery(name = "EmProject.findByProjectStartDate", query = "SELECT e FROM EmProject e WHERE e.projectStartDate = :projectStartDate")
    , @NamedQuery(name = "EmProject.findByProjectDueDate", query = "SELECT e FROM EmProject e WHERE e.projectDueDate = :projectDueDate")
    , @NamedQuery(name = "EmProject.findByProjectCreatedBy", query = "SELECT e FROM EmProject e WHERE e.projectCreatedBy = :projectCreatedBy")
    , @NamedQuery(name = "EmProject.findByProjectPriority", query = "SELECT e FROM EmProject e WHERE e.projectPriority = :projectPriority")
    , @NamedQuery(name = "EmProject.findByProjectAttachment", query = "SELECT e FROM EmProject e WHERE e.projectAttachment = :projectAttachment")
    , @NamedQuery(name = "EmProject.findByProjectCreatedDate", query = "SELECT e FROM EmProject e WHERE e.projectCreatedDate = :projectCreatedDate")
    , @NamedQuery(name = "EmProject.findByProjectUpdatedDate", query = "SELECT e FROM EmProject e WHERE e.projectUpdatedDate = :projectUpdatedDate")})
public class EmProject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "project_id")
    private Integer projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "department_id")
    private Integer departmentId;
   

	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "project_start_date")
    @Temporal(TemporalType.DATE)
    private Date projectStartDate;
    @Column(name = "project_due_date")
    @Temporal(TemporalType.DATE)
    private Date projectDueDate;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "project_description")
    private String projectDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_created_by")
    private int projectCreatedBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "project_priority")
    private String projectPriority;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "project_attachment")
    private String projectAttachment;
    @Column(name = "project_created_date")
    @Temporal(TemporalType.DATE)
    private Date projectCreatedDate;
    @Column(name = "project_updated_date")
    @Temporal(TemporalType.DATE)
    private Date projectUpdatedDate;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "activate_flag")
    private Integer activateFlag;

    public EmProject() {
    }

    public EmProject(Integer projectId) {
        this.projectId = projectId;
    }

    public EmProject(Integer projectId, int departmentId, String projectName, int projectCreatedBy, String projectPriority, String projectAttachment) {
        this.projectId = projectId;
        this.departmentId = departmentId;
        this.projectName = projectName;
        this.projectCreatedBy = projectCreatedBy;
        this.projectPriority = projectPriority;
        this.projectAttachment = projectAttachment;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectDueDate() {
        return projectDueDate;
    }

    public void setProjectDueDate(Date projectDueDate) {
        this.projectDueDate = projectDueDate;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public int getProjectCreatedBy() {
        return projectCreatedBy;
    }

    public void setProjectCreatedBy(int projectCreatedBy) {
        this.projectCreatedBy = projectCreatedBy;
    }

    public String getProjectPriority() {
        return projectPriority;
    }

    public void setProjectPriority(String projectPriority) {
        this.projectPriority = projectPriority;
    }

    public String getProjectAttachment() {
        return projectAttachment;
    }

    public void setProjectAttachment(String projectAttachment) {
        this.projectAttachment = projectAttachment;
    }

    public Date getProjectCreatedDate() {
        return projectCreatedDate;
    }

    public void setProjectCreatedDate(Date projectCreatedDate) {
        this.projectCreatedDate = projectCreatedDate;
    }

    public Date getProjectUpdatedDate() {
        return projectUpdatedDate;
    }

    public void setProjectUpdatedDate(Date projectUpdatedDate) {
        this.projectUpdatedDate = projectUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectId != null ? projectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmProject)) {
            return false;
        }
        EmProject other = (EmProject) object;
        if ((this.projectId == null && other.projectId != null) || (this.projectId != null && !this.projectId.equals(other.projectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmProject[ projectId=" + projectId + " ]";
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
    
}
