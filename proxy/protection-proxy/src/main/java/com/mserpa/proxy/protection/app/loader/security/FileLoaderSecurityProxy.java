package com.mserpa.proxy.protection.app.loader.security;

import com.mserpa.proxy.protection.app.loader.FileLoader;
import com.mserpa.proxy.protection.app.loader.FileLoaderImpl;
import com.mserpa.proxy.protection.app.loader.exception.AccessDeniedException;

public class FileLoaderSecurityProxy implements FileLoader{

	private static final String VALID_USER = "marcelo";
	private static final String VALID_PASSWORD = "helloproxy";
	
	private FileLoader fileLoader;
	
	public FileLoaderSecurityProxy(Credentials credentials) {
		super();
		if(isInvalidCredentials(credentials)) {
			throw new AccessDeniedException();
		}
		System.out.println("Access allowed");
		fileLoader = new FileLoaderImpl();		
	}

	@Override
	public String readFile(String fileName) {
		return fileLoader.readFile(fileName);
	}
	
	private boolean isInvalidCredentials(Credentials credentials) {
		return !VALID_USER.equals(credentials.getUsername()) || !VALID_PASSWORD.equals(credentials.getPassword());
	}

}
