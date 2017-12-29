package cn.et.lesson01.service;

import java.util.Map;

import cn.et.lesson01.entity.Emp;

public interface EmpService {
	/**
	 * 使用springmvc的例子
	 */

	public Map hello();
	
	/**
	 * 使用jdbctemplate的例子
	 */
	public Map getEmp(String empId);
	
	/**
	 * 使用hibernate添加的例子
	 */
	public String saveEmp();
	
	/**
	 * 使用hibernate查询例子
	 */
	public Emp querEmp();
	

	/**
	 * 使用hibernate删除例子
	 */
	public String deleteEmp(Integer empId);
	
	/**
	 * 使用hibernate修改例子
	 */
	public String updateEmp(Integer empId);
}
