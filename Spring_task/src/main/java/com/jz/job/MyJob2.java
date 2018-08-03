package com.jz.job;

import java.util.Date;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob2 extends QuartzJobBean{

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("当前时间为:==="+new Date());
	}

}
