/**
 * 
 */
package com.gomap.performance.master.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

/**
 * @author 1056082
 *
 */
public class LoginDTO {
	
	@Pattern(regexp = "^[a-z0-9]*$")
	@NotNull
	@Size(min = 1, max = 30)
	private String email;
	
	@Pattern(regexp = "^[a-z0-9]*$")
	@NotNull
	@Size(min = 1, max = 30)
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
