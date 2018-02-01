package com.thinkgem.jeesite.common.crawl.service.impl;

import java.io.File;
import java.io.InputStream;

/**
 * 解析配置文件接口
 * 
 * @author Administrator
 * @version 1.0.0
 * @date 2018-02-01
 */
public interface IConfigParser {
	
	/**
	 * 根据指定路径获取配置文件InputStream
	 * 
	 * @param path
	 * @return
	 */
	boolean getUserAgentToObj(String path)  throws Exception;
	
	/**
	 * 根据指定路径获取配置文件数组根据文件类型
	 * 
	 * @param path
	 * @return
	 */
	File[] getFileObjByFileType(String path) throws Exception;
	
	/**
	 * 根据指定路径获取配置文件数组根据文件类型
	 * 
	 * @param path
	 * @param strFlag 返回文件String类型标志
	 * @return
	 */
	String[] getFileObjByFileType(String path,boolean strFlag) throws Exception;
	
	
}
