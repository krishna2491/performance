/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.dao;

import java.util.List;

import com.gomap.performance.organisastion.model.AuditLog;
import com.gomap.performance.organisastion.model.ElementMaster;

/**
 * @author Fujitsu
 *
 */
public interface AuditLogDao {
	public AuditLog storeAuditLog(AuditLog auditLog);
	public List<AuditLog> getAuditLogData(AuditLog auditLog);

}