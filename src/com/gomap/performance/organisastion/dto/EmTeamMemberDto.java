/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

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
public class EmTeamMemberDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer teamMemberId;
    private int teamId;
    private int employeeId;
    private Date teamMemberCreatedDate;
    private Date teamMemberUpdatedDate;

    public EmTeamMemberDto() {
    }

    public EmTeamMemberDto(Integer teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public EmTeamMemberDto(Integer teamMemberId, int teamId, int employeeId) {
        this.teamMemberId = teamMemberId;
        this.teamId = teamId;
        this.employeeId = employeeId;
    }

    public Integer getTeamMemberId() {
        return teamMemberId;
    }

    public void setTeamMemberId(Integer teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getTeamMemberCreatedDate() {
        return teamMemberCreatedDate;
    }

    public void setTeamMemberCreatedDate(Date teamMemberCreatedDate) {
        this.teamMemberCreatedDate = teamMemberCreatedDate;
    }

    public Date getTeamMemberUpdatedDate() {
        return teamMemberUpdatedDate;
    }

    public void setTeamMemberUpdatedDate(Date teamMemberUpdatedDate) {
        this.teamMemberUpdatedDate = teamMemberUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teamMemberId != null ? teamMemberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmTeamMemberDto)) {
            return false;
        }
        EmTeamMemberDto other = (EmTeamMemberDto) object;
        if ((this.teamMemberId == null && other.teamMemberId != null) || (this.teamMemberId != null && !this.teamMemberId.equals(other.teamMemberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmTeamMember[ teamMemberId=" + teamMemberId + " ]";
    }
    
}
