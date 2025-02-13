package com.innoventes.test.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.innoventes.test.app.validation.annotation.ValidCompanyCode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {
	
	private Long id;

	@NotBlank(message = "Company name required")
	@Size(min = 5, message = "Name must be 5+ chars")
	private String companyName;

	@NotBlank(message = "Email required")
    @Email(message = "Invalid email format")
	private String email;

	@PositiveOrZero(message = "Must be >= 0")
	private Integer strength;
	
	private String webSiteURL;

	@ValidCompanyCode
	private String companyCode;
}
