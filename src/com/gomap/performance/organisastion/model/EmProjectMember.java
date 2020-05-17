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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Palash
 */
@Entity
@Table(name = "em_project_member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmProjectMember.findAll", query = "SELECT e FROM EmProjectMember e")
    , @NamedQuery(name = "EmProjectMember.findByProjectMemberId", query = "SELECT e FROM EmProjectMember e WHERE e.projectMemberId = :projectMemberId")
    , @NamedQuery(name = "EmProjectMember.findByProjectId", query = "SELECT e FROM EmProjectMember e WHERE e.projectId = :projectId")
    , @NamedQuery(name = "EmProjectMember.findByEmployeeId", query = "SELECT e FROM EmProjectMember e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmProjectMember.findByProjectMemberCreatedDate", query = "SELECT e FROM EmProjectMember e WHERE e.projectMemberCreatedDate = :projectMemberCreatedDate")
    , @NamedQuery(name = "EmProjectMember.findByProjectMemberUpdatedDate", query = "SELECT e FROM EmProjectMember e WHERE e.projectMemberUpdatedDate = :projectMemberUpdatedDate")})
public class EmProjectMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "project_member_id")
    private Integer projectMemberId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
    private int projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "project_member_created_date")
    @Temporal(TemporalType.DATE)
    private Date projectMemberCreatedDate;
    @Column(name = "project_member_updated_date")
    @Temporal(TemporalType.DATE)
    private Date projectMemberUpdatedDate;

    public EmProjectMember() {
    }

    public EmProjectMember(Integer projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public EmProjectMember(Integer projectMemberId, int projectId, int employeeId) {
        this.projectMemberId = projectMemberId;
        this.projectId = projectId;
        this.employeeId = employeeId;
    }

    public Integer getProjectMemberId() {
        return projectMemberId;
    }

    public void setProjectMemberId(Integer projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getProjectMemberCreatedDate() {
        return projectMemberCreatedDate;
    }

    public void setProjectMemberCreatedDate(Date projectMemberCreatedDate) {
        this.projectMemberCreatedDate = projectMemberCreatedDate;
    }

    public Date getProjectMemberUpdatedDate() {
        return projectMemberUpdatedDate;
    }

    public void setProjectMemberUpdatedDate(Date projectMemberUpdatedDate) {
        this.projectMemberUpdatedDate = projectMemberUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectMemberId != null ? projectMemberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmProjectMember)) {
            return false;
        }
        EmProjectMember other = (EmProjectMember) object;
        if ((this.projectMemberId == null && other.projectMemberId != null) || (this.projectMemberId != null && !this.projectMemberId.equals(other.projectMemberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmProjectMember[ projectMemberId=" + projectMemberId + " ]";
    }
    
}
