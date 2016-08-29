package com.csrk.fileexamples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilsDemo {
	
	File file= new File("/home/schituku/sample.txt");
	
	public void readLinesFromFile(){
		try {
			List<String> lines = FileUtils.readLines(file);
			
			for (String string : lines) {
				System.out.println(string);
			}
		} catch (IOException e) {
			System.out.println("File may not be there");
		}
	}
	
	public void writeLinesFromFile(List<String> lines){
		try {
			
			for (String string : lines) {
				System.out.println(string);
			}
			FileUtils.writeLines(file, lines);
			
		} catch (IOException e) {
			System.out.println("File may not be there");
		}
	}

}
