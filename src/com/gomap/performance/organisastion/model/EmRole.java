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
@Table(name = "em_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmRole.findAll", query = "SELECT e FROM EmRole e")
    , @NamedQuery(name = "EmRole.findByRoleId", query = "SELECT e FROM EmRole e WHERE e.roleId = :roleId")
    , @NamedQuery(name = "EmRole.findByRoleName", query = "SELECT e FROM EmRole e WHERE e.roleName = :roleName")
    , @NamedQuery(name = "EmRole.findByRoleStatus", query = "SELECT e FROM EmRole e WHERE e.roleStatus = :roleStatus")
    , @NamedQuery(name = "EmRole.findByRoleCreatedDate", query = "SELECT e FROM EmRole e WHERE e.roleCreatedDate = :roleCreatedDate")
    , @NamedQuery(name = "EmRole.findByRoleUpdatedDate", query = "SELECT e FROM EmRole e WHERE e.roleUpdatedDate = :roleUpdatedDate")
    , @NamedQuery(name = "EmRole.findByRoleLevel", query = "SELECT e FROM EmRole e WHERE e.roleLevel = :roleLevel")
    , @NamedQuery(name = "EmRole.findByRoleType", query = "SELECT e FROM EmRole e WHERE e.roleType = :roleType")})
public class EmRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_id")
    private Integer roleId;
    @Size(max = 255)
    @Column(name = "role_name")
    private String roleName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_status")
    private short roleStatus;
    @Column(name = "role_created_date")
    @Temporal(TemporalType.DATE)
    private Date roleCreatedDate;
    @Column(name = "role_updated_date")
    @Temporal(TemporalType.DATE)
    private Date roleUpdatedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_level")
    private int roleLevel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "role_type")
    private String roleType;

    public EmRole() {
    }

    public EmRole(Integer roleId) {
        this.roleId = roleId;
    }

    public EmRole(Integer roleId, short roleStatus, int roleLevel, String roleType) {
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
        if (!(object instanceof EmRole)) {
            return false;
        }
        EmRole other = (EmRole) object;
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
