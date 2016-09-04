package com.csrk.javasamples.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.csrk.fileexamples.FileUtilsDemo;

public class TestFileUtils {
	public static final Logger LOG = LoggerFactory.getLogger(TestFileUtils.class);
	@Test
	public void testCreateFile(){
		
		File directoryOfFile = new File("C:\\home\\schituku");
		Collection<File> filesInThisDirectory = 
				FileUtils.listFiles(directoryOfFile, new String [] {"txt"}, false);
		Assert.assertEquals(filesInThisDirectory.size(), 0);
		
		FileUtilsDemo demo = new FileUtilsDemo("C:\\home\\schituku\\sample.txt");
		List<String> lines = new ArrayList<String>();
		lines.add("Adding first line to the file");
		lines.add("Adding second line to the file");
		demo.writeLinesFromFile(lines);
		demo.readLinesFromFile();
		
		filesInThisDirectory = 
				FileUtils.listFiles(directoryOfFile, new String [] {"txt"}, false);
		Assert.assertEquals(filesInThisDirectory.size(), 1);
		for (Iterator iterator = filesInThisDirectory.iterator(); iterator.hasNext();) {
			File file = (File) iterator.next();
			LOG.debug(file.getName());
			Assert.assertEquals(file.getName(), "sample.txt");
		}
		
	}

}
