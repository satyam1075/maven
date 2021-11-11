package com.myclient.testscripts;

import org.testng.annotations.Test;

public class PassDataInExternalResources 
{
	@Test
	public void passData() 
	{
	String url = System.getProperty("url");
	String browser = System.getProperty("browser");
	
	System.out.println(url);
	System.out.println(browser);
		
	}
}
