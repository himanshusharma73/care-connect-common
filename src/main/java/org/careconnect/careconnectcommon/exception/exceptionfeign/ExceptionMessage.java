package org.careconnect.careconnectcommon.exception.exceptionfeign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionMessage {
    private String errorCode;
    private String errorDetails;
    private String errorDescription;
}