package com.school.book.task;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
/**
 * 定时任务类
 * spring boot task 在计算时间的时候 是根据当前系统的时间计算的
 * 每10s 的话 就是 10s 20s 30s 执行一次
 * 每 1min 就是 1min 2min 3 min 执行一次
 * 
 * 
 * @author Administrator
 *
 */
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
@Configuration
@EnableScheduling
public class TestTask {
	
	@Bean
    public TaskScheduler scheduledExecutorService() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(8);
        scheduler.setThreadNamePrefix("scheduled-thread-");
        return scheduler;
    }
	/**
	 * 每十秒打印一次
	 * 表达式
	 * 指定：秒，分，时，日期，月份，星期，年（可选）。
	 *  *表示任意
	 */
	@Scheduled(cron="0/10 * * * * *")
	public void task() {
		System.out.println("每十秒打印一次");
	}
}
