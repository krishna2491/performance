/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;

/**
 *
 * @author Palash
 */
public class EmUserPermissionDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer userPermissionId;
    private int roleId;
    private int tabId;
    private String userView;
    private String userAdd;
    private String userEdit;
    private String userDelete;
    private short userPermissionStatus;

    public EmUserPermissionDto() {
    }

    public EmUserPermissionDto(Integer userPermissionId) {
        this.userPermissionId = userPermissionId;
    }

    public EmUserPermissionDto(Integer userPermissionId, int roleId, int tabId, String userView, String userAdd, String userEdit, String userDelete, short userPermissionStatus) {
        this.userPermissionId = userPermissionId;
        this.roleId = roleId;
        this.tabId = tabId;
        this.userView = userView;
        this.userAdd = userAdd;
        this.userEdit = userEdit;
        this.userDelete = userDelete;
        this.userPermissionStatus = userPermissionStatus;
    }

    public Integer getUserPermissionId() {
        return userPermissionId;
    }

    public void setUserPermissionId(Integer userPermissionId) {
        this.userPermissionId = userPermissionId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getTabId() {
        return tabId;
    }

    public void setTabId(int tabId) {
        this.tabId = tabId;
    }

    public String getUserView() {
        return userView;
    }

    public void setUserView(String userView) {
        this.userView = userView;
    }

    public String getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    public String getUserEdit() {
        return userEdit;
    }

    public void setUserEdit(String userEdit) {
        this.userEdit = userEdit;
    }

    public String getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(String userDelete) {
        this.userDelete = userDelete;
    }

    public short getUserPermissionStatus() {
        return userPermissionStatus;
    }

    public void setUserPermissionStatus(short userPermissionStatus) {
        this.userPermissionStatus = userPermissionStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userPermissionId != null ? userPermissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmUserPermissionDto)) {
            return false;
        }
        EmUserPermissionDto other = (EmUserPermissionDto) object;
        if ((this.userPermissionId == null && other.userPermissionId != null) || (this.userPermissionId != null && !this.userPermissionId.equals(other.userPermissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmUserPermission[ userPermissionId=" + userPermissionId + " ]";
    }
    
}
