/**
 * 
 */
package com.gomap.performance.organisastion.exception;

import com.gomap.performance.organisastion.dto.ResponseDTO;

/**
 * @author 1056082
 *
 */
public class PerformanceException  extends Exception {
	
	private static final long serialVersionUID = -8144776724511762116L;
	private int errorCode;
	private Throwable error;
	private ResponseDTO responseDTO;
	
	public PerformanceException(int errorCode, Throwable error, ResponseDTO responseDTO) {
		super();
		this.errorCode = errorCode;
		this.error = error;
		this.responseDTO = responseDTO;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public Throwable getError() {
		return error;
	}

	public void setError(Throwable error) {
		this.error = error;
	}

	public ResponseDTO getResponseDTO() {
		return responseDTO;
	}

	public void setResponseDTO(ResponseDTO responseDTO) {
		this.responseDTO = responseDTO;
	}
}
