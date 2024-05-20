package org.careconnect.careconnectcommon.versoning;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;

@Data
@Embeddable
@JsonIgnoreProperties
public class Name {

    @Size(min = 3,message = "First name should have at least 3 character")
    private String firstName;

    private String middleName;

    @Size(min = 3,message = "Last name should have at least 3 character")
    private String lastName;
}
