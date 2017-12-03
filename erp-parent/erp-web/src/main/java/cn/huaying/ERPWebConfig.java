package cn.huaying;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ERPWebConfig {
	private static  Logger logger = LoggerFactory.getLogger(ERPWebConfig.class);
	public static void main(String[] args) {
		SpringApplication.run(ERPWebConfig.class, args);
		logger.info("erp服务 server start！！！");
	}
}
