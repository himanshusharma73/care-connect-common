package org.careconnect.careconnectcommon.versoning;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Embeddable
@JsonIgnoreProperties
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Name {

    @Size(min = 3,message = "First name should have at least 3 character")
    private String firstName;

    private String middleName;

    @Size(min = 3,message = "Last name should have at least 3 character")
    private String lastName;
}
