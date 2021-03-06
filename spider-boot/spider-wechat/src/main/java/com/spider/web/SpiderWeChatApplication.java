package com.spider.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author kuangjiewen
 * @Title: SpiderWebApplication
 * @ProjectName spider
 * @Description: 微信项目启动入口
 * @date 2018/12/20 14:46
 */
@SpringBootApplication
@EnableCaching
@EnableDubboConfiguration
public class SpiderWeChatApplication {
	public static void main(String[] args) {
		System.setProperty("dubbo.qos.port","22222");
		SpringApplication.run(SpiderWeChatApplication.class,args);
	}
}
