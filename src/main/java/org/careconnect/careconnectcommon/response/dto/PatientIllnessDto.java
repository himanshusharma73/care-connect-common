package org.careconnect.careconnectcommon.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@JsonIgnoreProperties
public class PatientIllnessDto {

    private long illnessId;

    private long patientId;

    private List<String> illness;

    private String description;

    private LocalDate illnessDate;
}
