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
@Table(name = "em_team_member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmTeamMember.findAll", query = "SELECT e FROM EmTeamMember e")
    , @NamedQuery(name = "EmTeamMember.findByTeamMemberId", query = "SELECT e FROM EmTeamMember e WHERE e.teamMemberId = :teamMemberId")
    , @NamedQuery(name = "EmTeamMember.findByTeamId", query = "SELECT e FROM EmTeamMember e WHERE e.teamId = :teamId")
    , @NamedQuery(name = "EmTeamMember.findByEmployeeId", query = "SELECT e FROM EmTeamMember e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmTeamMember.findByTeamMemberCreatedDate", query = "SELECT e FROM EmTeamMember e WHERE e.teamMemberCreatedDate = :teamMemberCreatedDate")
    , @NamedQuery(name = "EmTeamMember.findByTeamMemberUpdatedDate", query = "SELECT e FROM EmTeamMember e WHERE e.teamMemberUpdatedDate = :teamMemberUpdatedDate")})
public class EmTeamMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "team_member_id")
    private Integer teamMemberId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "team_id")
    private Integer teamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id")
    private Integer employeeId;
    @Column(name = "team_member_created_date")
    @Temporal(TemporalType.DATE)
    private Date teamMemberCreatedDate;
    @Column(name = "team_member_updated_date")
    @Temporal(TemporalType.DATE)
    private Date teamMemberUpdatedDate;
    @Column(name = "activate_flag")
    private Integer activateFlag;

    public EmTeamMember() {
    }

    public EmTeamMember(Integer teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public EmTeamMember(Integer teamMemberId, Integer teamId, Integer employeeId) {
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

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
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
