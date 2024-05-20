package org.careconnect.careconnectcommon.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.careconnect.careconnectcommon.versoning.Address;
import org.careconnect.careconnectcommon.versoning.Name;

@Data
@JsonIgnoreProperties
public class DoctorDto {

    private Long doctorId;

    private Name name;

    private String email;
    private long mobileNo;

    private String gender;

    private String licenseNumber;

    private Address address;

    private long adharNo;

    private String bloodGroup;

    private String maritalStatus;

    private Specialization specialization;

}
