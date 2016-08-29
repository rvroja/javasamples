package com.csrk.fileexamples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtilsDemo {
	
	File file;
	public static final Logger LOG = LoggerFactory.getLogger(FileUtilsDemo.class);
	
	public FileUtilsDemo(String pathOfFile) {
		super();
		file = new File(pathOfFile);
	}

	public void readLinesFromFile(){
		try {
			LOG.debug("About to Read the lines from the file");
			List<String> lines = FileUtils.readLines(file);
			LOG.debug("Finished Reading the lines from the file");
			LOG.debug("The lines in the file are:");
			
			for (String string : lines) {
				LOG.debug(string);
			}
		} catch (IOException e) {
			LOG.debug("File may not be there");
		}
	}
	
	public void writeLinesFromFile(List<String> lines){
		
		LOG.debug("Inside the writelines method");
		try {
			
			for (String string : lines) {
				LOG.debug("about to write the below line into the file:");
				LOG.debug(string);
			}
			FileUtils.writeLines(file, lines);
			LOG.debug("finished writing the above line into the file:");
			
		} catch (IOException e) {
			LOG.debug("File may not be there");
		}
	}

}