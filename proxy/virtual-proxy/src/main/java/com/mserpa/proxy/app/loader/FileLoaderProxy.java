package com.mserpa.proxy.app.loader;

import java.util.HashMap;
import java.util.Map;

public class FileLoaderProxy implements FileLoader {
	
	private static Map<String, String> cache;
	
	static {
		cache = new HashMap<String, String>();
	}
	
	private FileLoader fileLoader;
	
	public FileLoaderProxy() {
		fileLoader = new FileLoaderImpl();
	}

	@Override
	public String readFile(String fileName) {
		if(cache.get(fileName) == null) {
			String content = fileLoader.readFile(fileName);
			cache.put(fileName, content);
		}
		System.out.println("loading " + fileName + " from memory");
		return cache.get(fileName);
	}

}
