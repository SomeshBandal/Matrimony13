package com.spring.jwt.ContactDetails;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ContactDTO {

    @NotBlank(message = "Full address required")
    private String fullAddress;

    @NotBlank(message = "City required")
    private String city;

    @NotBlank(message = "Pincode required")
    @Positive(message = "pincode should be positive")
    private Integer pinCode;

    @NotBlank(message = "City required")
    private Long mobileNumber;

    @NotBlank(message = "City required")
    private Long alternateNumber;

    @NotBlank(message = "City required")
    private Integer userId;
}
