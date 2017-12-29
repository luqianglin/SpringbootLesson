package cn.et.lesson02.controller;


import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson02.mapper.EmpMapper;

/**
 * 
 * @RestController 控制层注解
 * @author Administrator
 *
 */
@RestController
public class SbController {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	EmpMapper mapper;
	/**
	 * 使用springmvc的例子
	 * @return
	 */
	@RequestMapping("/sysoSource")
	public String hello(){
		return dataSource.toString();
	}
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("/queryAll")
	public List<Map> queryAll(){
		return mapper.queryEmp();
	}
	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryId/{id}")
	public cn.et.lesson02.entity.Emp queryEmpById(@PathVariable Integer id){
		return mapper.queryById(id);
	}
}
