package com.csrk.stringex;

public class URLString {
	
	String URL = "https://24.106.206.2:10080/autotools/login.html";
	
	public String getIPAddress(){
		String ipAddress=null;
		
		String [] segments = URL.split("/");

		ipAddress = segments[2].split(":")[0];
		
		return ipAddress;
	}
	
	public String getPort(){
		String port=null;
		
		String [] segments = URL.split("/");

		port = segments[2].split(":")[1];
		
		return port;
	}
	
	public String getPath(){
		String path=null;
		
		String [] segments = URL.split("/");
		
		path = segments[3];
		
		return path;
	}
	
	public String getResource(){
		String resource=null;
		
		String [] segments = URL.split("/");
		
		resource = segments[4];
		
		return resource;
	}

}
