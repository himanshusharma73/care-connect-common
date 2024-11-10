package org.careconnect.careconnectcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.careconnect.careconnectcommon.versoning.Address;
import org.careconnect.careconnectcommon.versoning.Name;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "patient")
@JsonIgnoreProperties
public class PatientEntity {
    private LocalDate registrationDate=LocalDate.now();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientId;

    private Name name;

    private LocalDate birthdate;

    private String gender;

    @Email
    private String email;

    private long mobileNo;


    private long adharNo;

    private Address address;

    private String bloodGroup;

    private String maritalStatus;

    private String occupation;

    private long emergencyContactNumber;

    private Boolean isSmoker;

    private Boolean isAlcoholic;

    private String preferredLanguage;

    private boolean hasInsurance;

    private boolean isSelfPay;

    private Boolean isMedicaidEligible;

}
