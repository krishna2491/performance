/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Palash
 */
@Entity
@Table(name = "em_user_permission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmUserPermission.findAll", query = "SELECT e FROM EmUserPermission e")
    , @NamedQuery(name = "EmUserPermission.findByUserPermissionId", query = "SELECT e FROM EmUserPermission e WHERE e.userPermissionId = :userPermissionId")
    , @NamedQuery(name = "EmUserPermission.findByRoleId", query = "SELECT e FROM EmUserPermission e WHERE e.roleId = :roleId")
    , @NamedQuery(name = "EmUserPermission.findByTabId", query = "SELECT e FROM EmUserPermission e WHERE e.tabId = :tabId")
    , @NamedQuery(name = "EmUserPermission.findByUserView", query = "SELECT e FROM EmUserPermission e WHERE e.userView = :userView")
    , @NamedQuery(name = "EmUserPermission.findByUserAdd", query = "SELECT e FROM EmUserPermission e WHERE e.userAdd = :userAdd")
    , @NamedQuery(name = "EmUserPermission.findByUserEdit", query = "SELECT e FROM EmUserPermission e WHERE e.userEdit = :userEdit")
    , @NamedQuery(name = "EmUserPermission.findByUserDelete", query = "SELECT e FROM EmUserPermission e WHERE e.userDelete = :userDelete")
    , @NamedQuery(name = "EmUserPermission.findByUserPermissionStatus", query = "SELECT e FROM EmUserPermission e WHERE e.userPermissionStatus = :userPermissionStatus")})
public class EmUserPermission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_permission_id")
    private Integer userPermissionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_id")
    private int roleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tab_id")
    private int tabId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "userView")
    private String userView;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "userAdd")
    private String userAdd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "userEdit")
    private String userEdit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "userDelete")
    private String userDelete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_permission_status")
    private short userPermissionStatus;

    public EmUserPermission() {
    }

    public EmUserPermission(Integer userPermissionId) {
        this.userPermissionId = userPermissionId;
    }

    public EmUserPermission(Integer userPermissionId, int roleId, int tabId, String userView, String userAdd, String userEdit, String userDelete, short userPermissionStatus) {
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
        if (!(object instanceof EmUserPermission)) {
            return false;
        }
        EmUserPermission other = (EmUserPermission) object;
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
