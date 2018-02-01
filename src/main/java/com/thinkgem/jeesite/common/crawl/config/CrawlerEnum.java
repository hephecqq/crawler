package com.thinkgem.jeesite.common.crawl.config;

/**
 * 爬虫配置枚举
 * 
 * @author Administrator
 * @version 1.0.0
 */
public enum CrawlerEnum {

	CONFIG_FILE_USERAGENT_PATH("crawler/useragentpool.txt", 1), CONFIG_FILE_PROP_PATH("crawler/crawler.properties", 2);
	
	private String name; // 配置文件路径
	private int level; // 配置文件级别
	
	private CrawlerEnum(String name, int level) {
		this.name = name;
		this.level = level;
	}

	// 普通方法
	public static String getName(int level) {
		for (CrawlerEnum c : CrawlerEnum.values()) {
			if (c.getLevel() == level) {
				return c.name;
			}
		}
		return null;
	}

	// get set 方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
