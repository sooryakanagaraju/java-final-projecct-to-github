package com.dedalus.residentToHospital.exception;

public class HospitalAlreadyExistsException extends Exception {
	private String message;
    public HospitalAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
    public HospitalAlreadyExistsException() {
    	super("Hospital already exists!!");
    }
}
