package cn.et.lesson03.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.et.lesson03.food.entity.Emp;

import cn.et.lesson03.food.service.DeptService;
import cn.et.lesson03.food.service.EmpService;
import cn.et.lesson03.food.utils.PageTools;


@Controller
public class EmpController {
	@Autowired
	EmpService service;
	@Autowired
	DeptService ds;
	@ResponseBody
	@RequestMapping("/queryEmp1")
	public List<Emp> queryEmp(Integer id){
		System.out.println(id+"=====================");
		return ds.queryEmp(id);
	}
	/**
	 * 查询的方法
	 */
	@ResponseBody
	@RequestMapping("/queryEmp")
	public PageTools queryEmp(Integer id,String ename,Integer page,Integer rows){
		
		return service.queryEmp(id,ename, page, rows);
	}

}
