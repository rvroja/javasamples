package com.csrk.apps;

import com.csrk.stringex.URLString;

public class URLParser {

	public static void main(String[] args) {
		
		URLString urlString = new URLString();
		
		System.out.println("The ip in url is: "+urlString.getIPAddress());
		
		System.out.println("The port in url is: "+urlString.getPort());
		
		System.out.println("The path in url is: "+urlString.getPath());
		
		System.out.println("The path in url is: "+urlString.getResource());
	}

}
