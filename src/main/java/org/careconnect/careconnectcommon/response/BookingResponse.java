package org.careconnect.careconnectcommon.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.careconnect.careconnectcommon.response.dto.DoctorDto;
import org.careconnect.careconnectcommon.response.dto.PatientDto;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@JsonIgnoreProperties
public class BookingResponse {

    private Long appointmentId;

    private DoctorDto doctor;

    private PatientDto patient;

    private LocalDate appointmentDate;

    private LocalTime appointmentStartTime;

    private LocalTime appointmentEndTime;

    private String status;

}
