package com.mserpa.proxy.protection.app;

import com.mserpa.proxy.protection.app.loader.FileLoader;
import com.mserpa.proxy.protection.app.loader.FileLoaderImpl;
import com.mserpa.proxy.protection.app.loader.security.Credentials;
import com.mserpa.proxy.protection.app.loader.security.FileLoaderSecurityProxy;

public class Application {

	public static void main(String[] args) {
		Credentials validCredentials = new Credentials();
		validCredentials.setUsername("marcelo");
		validCredentials.setPassword("helloproxy");
	    FileLoader fileLoader = new FileLoaderSecurityProxy(validCredentials);
        String content = fileLoader.readFile("structural.txt");
        System.out.println(content);
        
        content = fileLoader.readFile("structural.txt");
        System.out.println(content);
                
        content = fileLoader.readFile("creational.txt");
        System.out.println(content);
        
		Credentials invalidCredentials = new Credentials();
		invalidCredentials.setUsername("marcelo");
		invalidCredentials.setPassword("wrongpassword");
		
	    fileLoader = new FileLoaderSecurityProxy(invalidCredentials);
        content = fileLoader.readFile("structural.txt");
        System.out.println(content);
	}
	
}
