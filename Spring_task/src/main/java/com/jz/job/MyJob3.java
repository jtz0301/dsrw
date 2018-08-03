package com.jz.job;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
public class MyJob3 {
	
	
	/** 
     * 定时计算。每天凌晨 01:00 执行一次 
     */  
	@Scheduled(cron = "0/5 * * * * ?")
	public void show(){
		System.out.println("XMl:is show run======");
	}
	
	
	/** 
     * 心跳更新。启动时执行一次，之后每隔5秒执行一次 
     */  
    @Scheduled(fixedRate = 1000*5)
	public void print(){
		System.out.println("XMl:print run++++++++");
	}
	

}
