package com.mserpa.proxy.app.loader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import com.mserpa.proxy.app.Application;

public class FileLoaderImpl implements FileLoader{

	@Override
	public String readFile(String fileName) {
		System.out.println("loading " + fileName + " from disk");
        ClassLoader classLoader = new Application().getClass().getClassLoader();
        String path = classLoader.getResource(fileName).getFile();
		File file = new File(path);
        if(file.exists()) {
    		return extractContent(file);       	
        }
        return null;
	}

	private String extractContent(File file) {
		try {
			return new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
