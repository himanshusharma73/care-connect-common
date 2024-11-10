package org.careconnect.careconnectcommon.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Name {

    @Size(min = 3,message = "First name should have at least 3 character")
    private String firstName;

    private String middleName;

    @Size(min = 3,message = "Last name should have at least 3 character")
    private String lastName;
}
