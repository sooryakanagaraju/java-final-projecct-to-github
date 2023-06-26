package com.dedalus.residentToHospital.exception;

public class ResidentAlreadyExistsException extends Exception {
	private String message;
    public ResidentAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
    public ResidentAlreadyExistsException() {
    	super("Resident already exists!!");
    }

}
