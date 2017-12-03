package cn.huaying.erp.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.pagehelper.PageHelper;

/*  
 * 注册MyBatis分页插件PageHelper  
 */  

@Configuration  
public class MybatisConfig {  
	private Logger logger = LoggerFactory.getLogger(MybatisConfig.class);
        @Bean  
        public PageHelper pageHelper() {  
        	logger.info("Mybatis分页插件！");
            PageHelper pageHelper = new PageHelper();  
            Properties p = new Properties();  
            p.setProperty("offsetAsPageNum", "true");  
            p.setProperty("rowBoundsWithCount", "true");  
            p.setProperty("reasonable", "true");  
            pageHelper.setProperties(p);  
            return pageHelper;  
        }  
}
