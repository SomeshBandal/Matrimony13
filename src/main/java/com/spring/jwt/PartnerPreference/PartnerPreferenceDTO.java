package com.spring.jwt.PartnerPreference;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerPreferenceDTO {

    @NotBlank(message = "Partner age is required")
    private String partnerAge;

    @NotBlank(message = "Looking for field is required")
    private String lookingFor;

    @NotBlank(message = "Partner height is required")
    private String partnerHeight;

    @NotBlank(message = "Eating habits are required")
    private String eatingHabits;

    @NotBlank(message = "Country living in is required")
    private String countryLivingIn;

    @NotBlank(message = "Partner complexion is required")
    private String partnerComplexion;

    @NotBlank(message = "Partner religion is required")
    private String partnerReligion;

    @NotBlank(message = "Partner caste is required")
    private String partnerCaste;

    @NotBlank(message = "Partner education is required")
    private String partnerEducation;

    @NotBlank(message = "Partner resident status is required")
    private String partnerResidentStatus;

    @NotBlank(message = "Preference is required")
    private String preference;

}
