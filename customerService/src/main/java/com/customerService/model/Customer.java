/**
 * 
 */
package com.customerService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author sreeharimanoharan
 *
 */
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@SequenceGenerator(
			name = "customer_id_sequence",
			sequenceName = "customer_id_sequence"
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "customer_id_sequence"
			)
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
}
