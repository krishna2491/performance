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
import javax.persistence.Lob;
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
@Table(name = "em_notification")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmNotification.findAll", query = "SELECT e FROM EmNotification e")
    , @NamedQuery(name = "EmNotification.findByNotificationId", query = "SELECT e FROM EmNotification e WHERE e.notificationId = :notificationId")
    , @NamedQuery(name = "EmNotification.findByNotificationHeading", query = "SELECT e FROM EmNotification e WHERE e.notificationHeading = :notificationHeading")
    , @NamedQuery(name = "EmNotification.findByNotificationAction", query = "SELECT e FROM EmNotification e WHERE e.notificationAction = :notificationAction")
    , @NamedQuery(name = "EmNotification.findByNotificationCreatedDatetime", query = "SELECT e FROM EmNotification e WHERE e.notificationCreatedDatetime = :notificationCreatedDatetime")
    , @NamedQuery(name = "EmNotification.findByNotificationGanerateBy", query = "SELECT e FROM EmNotification e WHERE e.notificationGanerateBy = :notificationGanerateBy")
    , @NamedQuery(name = "EmNotification.findByNotificationGaneratedFor", query = "SELECT e FROM EmNotification e WHERE e.notificationGaneratedFor = :notificationGaneratedFor")
    , @NamedQuery(name = "EmNotification.findByNotificationSeenStatus", query = "SELECT e FROM EmNotification e WHERE e.notificationSeenStatus = :notificationSeenStatus")})
public class EmNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "notification_id")
    private Integer notificationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "notification_heading")
    private String notificationHeading;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "notification_action")
    private String notificationAction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notification_created_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notificationCreatedDatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notification_ganerate_by")
    private int notificationGanerateBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notification_ganerated_for")
    private int notificationGaneratedFor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notification_seen_status")
    private int notificationSeenStatus;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "notification_description")
    private String notificationDescription;

    public EmNotification() {
    }

    public EmNotification(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public EmNotification(Integer notificationId, String notificationHeading, String notificationAction, Date notificationCreatedDatetime, int notificationGanerateBy, int notificationGaneratedFor, int notificationSeenStatus) {
        this.notificationId = notificationId;
        this.notificationHeading = notificationHeading;
        this.notificationAction = notificationAction;
        this.notificationCreatedDatetime = notificationCreatedDatetime;
        this.notificationGanerateBy = notificationGanerateBy;
        this.notificationGaneratedFor = notificationGaneratedFor;
        this.notificationSeenStatus = notificationSeenStatus;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationHeading() {
        return notificationHeading;
    }

    public void setNotificationHeading(String notificationHeading) {
        this.notificationHeading = notificationHeading;
    }

    public String getNotificationAction() {
        return notificationAction;
    }

    public void setNotificationAction(String notificationAction) {
        this.notificationAction = notificationAction;
    }

    public Date getNotificationCreatedDatetime() {
        return notificationCreatedDatetime;
    }

    public void setNotificationCreatedDatetime(Date notificationCreatedDatetime) {
        this.notificationCreatedDatetime = notificationCreatedDatetime;
    }

    public int getNotificationGanerateBy() {
        return notificationGanerateBy;
    }

    public void setNotificationGanerateBy(int notificationGanerateBy) {
        this.notificationGanerateBy = notificationGanerateBy;
    }

    public int getNotificationGaneratedFor() {
        return notificationGaneratedFor;
    }

    public void setNotificationGaneratedFor(int notificationGaneratedFor) {
        this.notificationGaneratedFor = notificationGaneratedFor;
    }

    public int getNotificationSeenStatus() {
        return notificationSeenStatus;
    }

    public void setNotificationSeenStatus(int notificationSeenStatus) {
        this.notificationSeenStatus = notificationSeenStatus;
    }

    public String getNotificationDescription() {
        return notificationDescription;
    }

    public void setNotificationDescription(String notificationDescription) {
        this.notificationDescription = notificationDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notificationId != null ? notificationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmNotification)) {
            return false;
        }
        EmNotification other = (EmNotification) object;
        if ((this.notificationId == null && other.notificationId != null) || (this.notificationId != null && !this.notificationId.equals(other.notificationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmNotification[ notificationId=" + notificationId + " ]";
    }
    
}
