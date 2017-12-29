package cn.et.lesson02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * 通过类的注解产生bean
 * @author Administrator
 *
 */
@Configuration
public class ConfigBean {
	/**
	 * <bean id="druidStatView" class="cn.et.ServletRegistrationBean"/>
	 *  过滤器  返回FileterRegistrationBean
	 * @return
	 */
	@Bean
	public ServletRegistrationBean druidStatView(){
		ServletRegistrationBean srb = new ServletRegistrationBean();
		//servlet的名字
		srb.setName("DruidStatView");
		StatViewServlet svs = new StatViewServlet();
		srb.setServlet(svs);
		//设置拦截的路径
		String url="/druid/*";
		List<String> urls = new ArrayList<String>();
		urls.add(url);
		srb.setUrlMappings(urls);
		//设置用户名和密码
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String,String>();
		linkedHashMap.put("loginUsername", "admin");
		linkedHashMap.put("loginPassword", "123456");
		srb.setInitParameters(linkedHashMap);
		
		return srb;
		
	}
}
