/**
 * 
 */
package com.gomap.performance.master.dto;

/**
 * @author 1056082
 *
 */
public class RequestDTO {
	
	private String loginUserId;
	private String token;
	private String dataObj;
	private String userFeatureId;
	
	
	public String getUserFeatureId() {
		return userFeatureId;
	}
	public void setUserFeatureId(String userFeatureId) {
		this.userFeatureId = userFeatureId;
	}
	public String getUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDataObj() {
		return dataObj;
	}
	public void setDataObj(String dataObj) {
		this.dataObj = dataObj;
	}
	
}
