package cn.et.lesson01.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson01.entity.Emp;
import cn.et.lesson01.service.EmpService;

/**
 * 
 * @RestController 控制层注解
 * helloworld例子
 * @author Administrator
 *
 */
@RestController
public class SbController {
	/**
	 *  只需要配置application.properties的四要素 即可使用该类
	 *  spring.datasource.url=jdbc:mysql://localhost/food
		spring.datasource.username=root
		spring.datasource.password=123456
		spring.datasource.driver-class-name=com.mysql.jdbc.Driver
	 */
	@Autowired
	EmpService service;
	/**
	 * 使用springmvc的例子
	 * @return
	 */
	@RequestMapping("/hello")
	public Map hello(){
		return service.hello();
		
	}
	/**
	 * 使用jdbctemplate的例子
	 * @param empId
	 * @return
	 */
	@RequestMapping("/emp/{empId}")
	public Map getEmp(@PathVariable String empId){
		return service.getEmp(empId);
	}
	
	/**
	 * 使用hibernate添加
	 * @return
	 */
	@RequestMapping("/saveEmp")
	public String saveEmp(){
		return service.saveEmp();
	}
	/**
	 * 使用hibernate查询
	 * @return
	 */
	@RequestMapping("/queryEmp")
	public Emp queryEmp(){
		return service.querEmp();
	}
	
	/**
	 * 使用hibernate删除例子
	 */
	@RequestMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable Integer id){
		 return service.deleteEmp(id);
		
	}
	
	/**
	 * 使用hibernate修改例子
	 */
	@RequestMapping(value="/updateEmp/{id}")
	public String updateEmp(@PathVariable Integer id){
		 return service.updateEmp(id);
	}
}
