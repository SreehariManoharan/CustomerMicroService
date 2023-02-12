/**
 * 
 */
package com.customerService.model;

import lombok.Data;

/**
 * @author sreeharimanoharan
 *
 */
@Data
public class CustomerRegistrationRequest {

	private String firstName;
	private String lastName;
	private String email;
}
