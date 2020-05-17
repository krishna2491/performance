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
public class EmRoleDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer roleId;
    private String roleName;
    private short roleStatus;
    private Date roleCreatedDate;
    private Date roleUpdatedDate;
    private int roleLevel;
       private String roleType;

    public EmRoleDto() {
    }

    public EmRoleDto(Integer roleId) {
        this.roleId = roleId;
    }

    public EmRoleDto(Integer roleId, short roleStatus, int roleLevel, String roleType) {
        this.roleId = roleId;
        this.roleStatus = roleStatus;
        this.roleLevel = roleLevel;
        this.roleType = roleType;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public short getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(short roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Date getRoleCreatedDate() {
        return roleCreatedDate;
    }

    public void setRoleCreatedDate(Date roleCreatedDate) {
        this.roleCreatedDate = roleCreatedDate;
    }

    public Date getRoleUpdatedDate() {
        return roleUpdatedDate;
    }

    public void setRoleUpdatedDate(Date roleUpdatedDate) {
        this.roleUpdatedDate = roleUpdatedDate;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmRoleDto)) {
            return false;
        }
        EmRoleDto other = (EmRoleDto) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmRole[ roleId=" + roleId + " ]";
    }
    
}
