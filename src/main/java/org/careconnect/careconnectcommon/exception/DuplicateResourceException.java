package org.careconnect.careconnectcommon.exception;

public class DuplicateResourceException extends RuntimeException{

    private String resource; //patient //doctor

    public DuplicateResourceException(String resource) {
        super(String.format("%s",resource));
        this.resource = resource;
    }
}
