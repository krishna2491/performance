/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Palash
 */
public class EmProjectMemberDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer projectMemberId;
    private int projectId;
    private int employeeId;
    private Date projectMemberCreatedDate;
    private Date projectMemberUpdatedDate;

    public EmProjectMemberDto() {
    }

    public EmProjectMemberDto(Integer projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public EmProjectMemberDto(Integer projectMemberId, int projectId, int employeeId) {
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
        if (!(object instanceof EmProjectMemberDto)) {
            return false;
        }
        EmProjectMemberDto other = (EmProjectMemberDto) object;
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
