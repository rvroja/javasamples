package com.csrk.stringex;

public class URLString {
	
	String URL = "https://24.106.206.2:10080/autotools/login.html";
	
	public void showSegments(){
		
		String [] segmentsOne = URL.split("/");
		String [] segmentsTwo = URL.split(":");
		String [] segmentsThree = URL.split(":/");
		
		System.out.println("THE URL is: "+URL);
		
		System.out.println("START SEGMENT Slash");
		for (int i = 0; i < segmentsOne.length; i++) {
			System.out.println(segmentsOne[i]);
		}
		
		System.out.println("END SEGMENT slash");
		System.out.println("START SEGMENT colon");
		for (int i = 0; i < segmentsTwo.length; i++) {
			System.out.println(segmentsTwo[i]);
		}
		System.out.println("END SEGMENT colon");
		System.out.println("START SEGMENT colon-slash");
		for (int i = 0; i < segmentsThree.length; i++) {
			System.out.println(segmentsThree[i]);
		}
	}
	
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
