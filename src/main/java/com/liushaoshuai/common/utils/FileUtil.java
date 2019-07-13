package com.liushaoshuai.common.utils;

import java.io.File;

public class FileUtil {
	/**
	 * @Title: getExtendName 
	 * @Description: 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getExtendName(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}
	
	/**
	 * 
	 * @Title: getTempDirectory 
	 * @Description: 方法2：返回操作系统临时目录(5分)
	 * @return
	 * @return: File
	 */
	public static File getTempDirectory() {
		//返回的临时路径
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	
	/**
	 * @Title: getUserDirectory 
	 * @Description: 方法3：返回操作系统用户目录(5分)
	 *  例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	 * @return
	 * @return: File
	 */
	public static File getUserDirectory() {
		//返回的用户目录
		String path = System.getProperty("user.home");
		return new File(path);
	}
	
	
	
	
	
	
	
	
	
	
	
}
