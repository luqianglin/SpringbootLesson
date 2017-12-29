package cn.et.lesson03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**@EnableAutoConfiguration 自动配置注解
 * 必须添加SpringBootApplication 启用spring的自动配置功能
 * @ComponentScan("com.et.lesson02.mapper") 自动扫描
 * springboot如何注册servlet
 */
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		//启动会加载自动配置
		SpringApplication.run(Main.class, args);
	}
}
