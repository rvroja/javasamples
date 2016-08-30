package com.csrk.apps;

import java.util.ArrayList;
import java.util.List;

import com.csrk.fileexamples.FileUtilsDemo;

public class FileUtilApp {

	public static void main(String[] args) {
		
		
		FileUtilsDemo demo = new FileUtilsDemo(args[0]);
		
		List<String> lines = new ArrayList<String>();
		lines.add("Adding first line to the file");
		lines.add("Adding second line to the file");
		demo.writeLinesFromFile(lines);
		demo.readLinesFromFile();
	}

}
