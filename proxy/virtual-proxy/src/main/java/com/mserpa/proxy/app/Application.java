package com.mserpa.proxy.app;

import com.mserpa.proxy.app.loader.FileLoader;
import com.mserpa.proxy.app.loader.FileLoaderProxy;

public class Application {

	public static void main(String[] args) {
        FileLoader fileLoader = new FileLoaderProxy();
        String content = fileLoader.readFile("structural.txt");
        System.out.println(content);
        
        content = fileLoader.readFile("structural.txt");
        System.out.println(content);
                
        content = fileLoader.readFile("creational.txt");
        System.out.println(content);
        
        content = fileLoader.readFile("structural.txt");
        System.out.println(content);
	}
	
}
