package com.dedalus.residentToHospital.exception;

public class ResidentNotFoundException extends RuntimeException{
	private String message;
    public ResidentNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    public ResidentNotFoundException() {
    	super("Resident Not Found!!");
    }
}
