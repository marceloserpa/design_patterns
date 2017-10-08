package com.mserpa.proxy.protection.app.loader.exception;

public class AccessDeniedException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public AccessDeniedException() {
		System.out.println("Access denied");
	}

}
