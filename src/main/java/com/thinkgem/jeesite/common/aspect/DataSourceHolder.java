package com.thinkgem.jeesite.common.aspect;

/**
 * 数据源的Handler类
 * 
 * @author Administrator
 *
 */
public class DataSourceHolder {

	// 数据源名称线程池
	public static final ThreadLocal<String> holder = new ThreadLocal<String>();

	// 在项目启动的时候将配置的读,写数据源加到holder中
	public static void putDataSource(String dataSource) {
		holder.set(dataSource);
	}

	// 从holder中获取数据源字符串
	public static String getDataSource() {
		return holder.get();
	}
}
