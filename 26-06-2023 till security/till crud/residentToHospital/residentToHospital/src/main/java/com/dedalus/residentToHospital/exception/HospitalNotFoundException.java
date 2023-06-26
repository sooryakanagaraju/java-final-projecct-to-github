package com.dedalus.residentToHospital.exception;

public class HospitalNotFoundException extends RuntimeException {
	private String message;
    public HospitalNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    public HospitalNotFoundException() {
    	super("Hospital Not Found!!");
    }
}
