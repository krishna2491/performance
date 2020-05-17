/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

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
public class EmSidebarTabsDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer tabId;
    private String tabname;
    private String controllerName;
    private short childStatus;
    private int childId;
    private int tabNumber;
    private String childTabname;
    private String childControllerName;
    private int status;
    private String tabIcon;

    public EmSidebarTabsDto() {
    }

    public EmSidebarTabsDto(Integer tabId) {
        this.tabId = tabId;
    }

    public EmSidebarTabsDto(Integer tabId, String tabname, String controllerName, short childStatus, int childId, int tabNumber, String childTabname, String childControllerName, int status, String tabIcon) {
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
        if (!(object instanceof EmSidebarTabsDto)) {
            return false;
        }
        EmSidebarTabsDto other = (EmSidebarTabsDto) object;
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
