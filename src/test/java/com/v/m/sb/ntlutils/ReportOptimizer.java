package com.v.m.sb.ntlutils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class ReportOptimizer {
	
	@Test
	public void archiveFiles() throws IOException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss-mmm"); 
		String path = sdf.format(new Date()); 
		System.out.println(path);
		File src = new File("S:\\Vmetry\\JavaWorkspace\\DDTtestSecond\\Report");   
		File dest = new File("S:\\Vmetry\\JavaWorkspace\\DDTtestSecond\\ArchiveFolder\\OLD"+path);  
		
		FileUtils.copyDirectory(src, dest);
	
	}
}
