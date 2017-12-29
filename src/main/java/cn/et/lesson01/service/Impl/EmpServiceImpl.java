package cn.et.lesson01.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.et.lesson01.dao.EmpRepository;
import cn.et.lesson01.entity.Emp;
import cn.et.lesson01.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	JdbcTemplate jdbc;
	/**
	 * 自定义一个接口继承CrudRepository即可
	 * 		interface EmpRepository  extends CrudRepository<操作实体类,主键类型>
	 */
	@Autowired
	EmpRepository er;

	/**
	 * 使用jdbctemplate的例子
	 */
	@Override
	public Map getEmp(String empId) {
		List<Map<String, Object>> list=jdbc.queryForList("select * from emp where id="+empId);
		return list.get(0);
	}
	
	/**
	 * 使用hibernate查询的例子
	 */
	@Override
	public Emp querEmp() {
		Emp emp=er.findOne(5);
		return emp;
	}
	
	/**
	 * 使用hibernate添加的例子
	 */
	@Override
	public String saveEmp() {
		Emp emp=new Emp();
		emp.setEname("dd");
		emp.setSal(100.2);
		emp.setDeptid(4);
		er.save(emp);
		return "1";
	}

	/**
	 * 使用springmvc的例子
	 */
	@Override
	public Map hello() {
		Map map=new HashMap();
		map.put("id", 1);
		map.put("name", "张三");
		return map;
	}

	@Override
	public String deleteEmp(Integer empId) {
		er.delete(empId);
		return "删除成功";
	}

	@Override
	public String updateEmp(Integer empId) {
		Emp e=new Emp();
		e.setId(5);
		e.setEname("小婷婷");
		e.setSal(10000);
		e.setDeptid(5);
		er.save(e);
		return "修改成功";
	}

	
}
