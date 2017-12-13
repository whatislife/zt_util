package com.zhht.util.filecom;

public final class ConfigApi {
//	public static final String PRO_FILE_NAME = "gplus.properties";
//	public static final String ACCESS_KEY = PropertiesUtil.getProperty(PRO_FILE_NAME, "AccessKey");
//	public static final String ACCESS_SECRET = PropertiesUtil.getProperty(PRO_FILE_NAME, "AccessSecret");
//	public static final String UPLOAD_EMPTY_NUM = SERVICE_HOST +PropertiesUtil.getProperty(PRO_FILE_NAME, "UPLOAD_EMPTY_NUM");
	public static final String LOCAL_PATH = PropertiesUtil.getProperty("local.path");
	public static final String REMOTE_PATH = PropertiesUtil.getProperty("remote.path");
	
	public static final String BASE = PropertiesUtil.getProperty("base");
	public static final String CPS = PropertiesUtil.getProperty("cps");
	
}
