package com.messaging_platform.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

// READCONFIG CLASS IS USED TO READ THE DATA FROM CONFIG.PROPERTIES FILE BY CREATING METHODS FOR EACH VARIABLE
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch (Exception e) {
		     System.out.println("Exception is " + e.getMessage());
		}
	}
	
	
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getusername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getchromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getfirefoxpath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getcampaignname()
	{
		String campaignname = pro.getProperty("campaignname");
		return campaignname;
	}
	
	public String getaudiencelistname()
	{
		String audiencelistname = pro.getProperty("audiencelistname");
		return audiencelistname;
	}
	
	public String getoptinemail()
	{
		String optinemail = pro.getProperty("optinemail");
		return optinemail;
	}
	
	public String getcsvfilepath()
	{
		String csvfilepath = pro.getProperty("csvfilepath");
		return csvfilepath;
	}
	
	public String getcarrier1()
	{
		String carrier1 = pro.getProperty("carrier1");
		return carrier1;
	}
	
	public String getcarrier2()
	{
		String carrier2 = pro.getProperty("carrier2");
		return carrier2;
	}
	
	public String getcarrier3()
	{
		String carrier3 = pro.getProperty("carrier3");
		return carrier3;
	}
	
	public String getcarrier4()
	{
		String carrier4 = pro.getProperty("carrier4");
		return carrier4;
	}
	
	public String getcarrier5()
	{
		String carrier5 = pro.getProperty("carrier5");
		return carrier5;
	}
	
	public String getcarrier6()
	{
		String carrier6 = pro.getProperty("carrier6");
		return carrier6;
	}
	
	public String getcarrier7()
	{
		String carrier7 = pro.getProperty("carrier7");
		return carrier7;
	}
	
	public String getcarrier8()
	{
		String carrier8 = pro.getProperty("carrier8");
		return carrier8;
	}
	
	public String getafteroptin()
	{
		String afteroptin = pro.getProperty("afteroptin");
		return afteroptin;
	}
	
	public String getbeforeoptin()
	{
		String beforeoptin = pro.getProperty("beforeoptin");
		return beforeoptin;
	}
	
	public String getrecurring()
	{
		String recurring = pro.getProperty("recurring");
		return recurring;
	}
	
	
	
}
