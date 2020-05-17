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
@Table(name = "em_feedback_requester_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmFeedbackRequesterMaster.findAll", query = "SELECT e FROM EmFeedbackRequesterMaster e")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByFeedbackRequesterId", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.feedbackRequesterId = :feedbackRequesterId")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByEmployeeId", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByFeedbackForEmpId", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.feedbackForEmpId = :feedbackForEmpId")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByProjectId", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.projectId = :projectId")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByDepartmentId", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByFeedbackTitle", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.feedbackTitle = :feedbackTitle")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByFeedbackRequesterCreatedDate", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.feedbackRequesterCreatedDate = :feedbackRequesterCreatedDate")
    , @NamedQuery(name = "EmFeedbackRequesterMaster.findByFeedbackRequesterUpdatedDate", query = "SELECT e FROM EmFeedbackRequesterMaster e WHERE e.feedbackRequesterUpdatedDate = :feedbackRequesterUpdatedDate")})
public class EmFeedbackRequesterMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "feedback_requester_id")
    private Integer feedbackRequesterId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id")
    private int employeeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feedback_for_emp_id")
    private int feedbackForEmpId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
    private int projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "department_id")
    private int departmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "feedback_title")
    private String feedbackTitle;
    @Column(name = "feedback_requester_created_date")
    @Temporal(TemporalType.DATE)
    private Date feedbackRequesterCreatedDate;
    @Column(name = "feedback_requester_updated_date")
    @Temporal(TemporalType.DATE)
    private Date feedbackRequesterUpdatedDate;

    public EmFeedbackRequesterMaster() {
    }

    public EmFeedbackRequesterMaster(Integer feedbackRequesterId) {
        this.feedbackRequesterId = feedbackRequesterId;
    }

    public EmFeedbackRequesterMaster(Integer feedbackRequesterId, int employeeId, int feedbackForEmpId, int projectId, int departmentId, String feedbackTitle) {
        this.feedbackRequesterId = feedbackRequesterId;
        this.employeeId = employeeId;
        this.feedbackForEmpId = feedbackForEmpId;
        this.projectId = projectId;
        this.departmentId = departmentId;
        this.feedbackTitle = feedbackTitle;
    }

    public Integer getFeedbackRequesterId() {
        return feedbackRequesterId;
    }

    public void setFeedbackRequesterId(Integer feedbackRequesterId) {
        this.feedbackRequesterId = feedbackRequesterId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getFeedbackForEmpId() {
        return feedbackForEmpId;
    }

    public void setFeedbackForEmpId(int feedbackForEmpId) {
        this.feedbackForEmpId = feedbackForEmpId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getFeedbackTitle() {
        return feedbackTitle;
    }

    public void setFeedbackTitle(String feedbackTitle) {
        this.feedbackTitle = feedbackTitle;
    }

    public Date getFeedbackRequesterCreatedDate() {
        return feedbackRequesterCreatedDate;
    }

    public void setFeedbackRequesterCreatedDate(Date feedbackRequesterCreatedDate) {
        this.feedbackRequesterCreatedDate = feedbackRequesterCreatedDate;
    }

    public Date getFeedbackRequesterUpdatedDate() {
        return feedbackRequesterUpdatedDate;
    }

    public void setFeedbackRequesterUpdatedDate(Date feedbackRequesterUpdatedDate) {
        this.feedbackRequesterUpdatedDate = feedbackRequesterUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedbackRequesterId != null ? feedbackRequesterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmFeedbackRequesterMaster)) {
            return false;
        }
        EmFeedbackRequesterMaster other = (EmFeedbackRequesterMaster) object;
        if ((this.feedbackRequesterId == null && other.feedbackRequesterId != null) || (this.feedbackRequesterId != null && !this.feedbackRequesterId.equals(other.feedbackRequesterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmFeedbackRequesterMaster[ feedbackRequesterId=" + feedbackRequesterId + " ]";
    }
    
}
