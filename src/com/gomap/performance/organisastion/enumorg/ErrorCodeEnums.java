/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.enumorg;

/**
 * @author krishnakant.bairagi
 *
 */
public enum ErrorCodeEnums {


	
	NO_ERROR (0),
	FILE_EMPTY_ERROR (601);
	
	
	private final int errorCode;

	private ErrorCodeEnums(int errorCode) {
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}





}
