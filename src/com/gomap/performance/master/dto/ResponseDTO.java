/**
 * 
 */
package com.gomap.performance.master.dto;

/**
 * @author 1056082
 *
 */
public class ResponseDTO {
	
	int errorCode;
	String errorMsg;
	String successMsg;
    Object dataObj; // response data for the each functionality   
    
    
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getSuccessMsg() {
		return successMsg;
	}
	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}
	public Object getDataObj() {
		return dataObj;
	}
	public void setDataObj(Object dataObj) {
		this.dataObj = dataObj;
	}
}
