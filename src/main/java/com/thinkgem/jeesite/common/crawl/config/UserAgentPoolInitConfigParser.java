package com.thinkgem.jeesite.common.crawl.config;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import com.thinkgem.jeesite.common.crawl.service.impl.IConfigParser;

/**
 * UserAgent代理池
 * 
 * @author Administrator
 *
 */
@Component
public class UserAgentPoolInitConfigParser implements Serializable, IConfigParser {

	/**
	 * 解析UserAgent容器List
	 */
	public List<String> userAgentConfigPool = new ArrayList<String>();

	private static final long serialVersionUID = 2378315105169921028L;

	Resource resource1 = null;

	@Override
	public File[] getFileObjByFileType(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getFileObjByFileType(String path, boolean strFlag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getUserAgentToObj(String path) throws Exception {
		String config_file_useragent_path = CrawlerEnum.CONFIG_FILE_USERAGENT_PATH.getName();
		boolean isSuccess = false;
		InputStream inputStream = null;
		try {
			Resource resource = new ClassPathResource(path);
			inputStream = resource.getInputStream();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			userAgentConfigPool = IOUtils.readLines(inputStream, "utf-8");
		} catch (IOException e) {
			isSuccess = false;
		}
		return isSuccess;
	}

}
