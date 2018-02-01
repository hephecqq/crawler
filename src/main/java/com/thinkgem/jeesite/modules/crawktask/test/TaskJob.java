package com.thinkgem.jeesite.modules.crawktask.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 任务类
 * 
 * @author Administrator
 *
 */
@Component()
public class TaskJob {

	public TaskJob() {
		System.out.println("init... Task Job");
	}
	@Scheduled(cron="*/5 * * * * ?")
	public void t1() {
		System.out.println("Task Job t1...start");
	}
}
