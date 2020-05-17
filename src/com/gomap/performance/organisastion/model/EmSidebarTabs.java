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
@Table(name = "em_sidebar_tabs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmSidebarTabs.findAll", query = "SELECT e FROM EmSidebarTabs e")
    , @NamedQuery(name = "EmSidebarTabs.findByTabId", query = "SELECT e FROM EmSidebarTabs e WHERE e.tabId = :tabId")
    , @NamedQuery(name = "EmSidebarTabs.findByTabname", query = "SELECT e FROM EmSidebarTabs e WHERE e.tabname = :tabname")
    , @NamedQuery(name = "EmSidebarTabs.findByControllerName", query = "SELECT e FROM EmSidebarTabs e WHERE e.controllerName = :controllerName")
    , @NamedQuery(name = "EmSidebarTabs.findByChildStatus", query = "SELECT e FROM EmSidebarTabs e WHERE e.childStatus = :childStatus")
    , @NamedQuery(name = "EmSidebarTabs.findByChildId", query = "SELECT e FROM EmSidebarTabs e WHERE e.childId = :childId")
    , @NamedQuery(name = "EmSidebarTabs.findByTabNumber", query = "SELECT e FROM EmSidebarTabs e WHERE e.tabNumber = :tabNumber")
    , @NamedQuery(name = "EmSidebarTabs.findByChildTabname", query = "SELECT e FROM EmSidebarTabs e WHERE e.childTabname = :childTabname")
    , @NamedQuery(name = "EmSidebarTabs.findByChildControllerName", query = "SELECT e FROM EmSidebarTabs e WHERE e.childControllerName = :childControllerName")
    , @NamedQuery(name = "EmSidebarTabs.findByStatus", query = "SELECT e FROM EmSidebarTabs e WHERE e.status = :status")
    , @NamedQuery(name = "EmSidebarTabs.findByTabIcon", query = "SELECT e FROM EmSidebarTabs e WHERE e.tabIcon = :tabIcon")})
public class EmSidebarTabs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tab_id")
    private Integer tabId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tabname")
    private String tabname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "controller_name")
    private String controllerName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "child_status")
    private short childStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "child_id")
    private int childId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tab_number")
    private int tabNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "child_tabname")
    private String childTabname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "child_controller_name")
    private String childControllerName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tab_icon")
    private String tabIcon;

    public EmSidebarTabs() {
    }

    public EmSidebarTabs(Integer tabId) {
        this.tabId = tabId;
    }

    public EmSidebarTabs(Integer tabId, String tabname, String controllerName, short childStatus, int childId, int tabNumber, String childTabname, String childControllerName, int status, String tabIcon) {
        this.tabId = tabId;
        this.tabname = tabname;
        this.controllerName = controllerName;
        this.childStatus = childStatus;
        this.childId = childId;
        this.tabNumber = tabNumber;
        this.childTabname = childTabname;
        this.childControllerName = childControllerName;
        this.status = status;
        this.tabIcon = tabIcon;
    }

    public Integer getTabId() {
        return tabId;
    }

    public void setTabId(Integer tabId) {
        this.tabId = tabId;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public short getChildStatus() {
        return childStatus;
    }

    public void setChildStatus(short childStatus) {
        this.childStatus = childStatus;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    public String getChildTabname() {
        return childTabname;
    }

    public void setChildTabname(String childTabname) {
        this.childTabname = childTabname;
    }

    public String getChildControllerName() {
        return childControllerName;
    }

    public void setChildControllerName(String childControllerName) {
        this.childControllerName = childControllerName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTabIcon() {
        return tabIcon;
    }

    public void setTabIcon(String tabIcon) {
        this.tabIcon = tabIcon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabId != null ? tabId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmSidebarTabs)) {
            return false;
        }
        EmSidebarTabs other = (EmSidebarTabs) object;
        if ((this.tabId == null && other.tabId != null) || (this.tabId != null && !this.tabId.equals(other.tabId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmSidebarTabs[ tabId=" + tabId + " ]";
    }
    
}
