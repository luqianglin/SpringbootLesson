package cn.et.lesson02.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.et.lesson02.entity.Emp;

@Mapper
public interface EmpMapper {
	/**
	 * 查询所有
	 * @return
	 */
	@Select("select * from emp")
	List<Map> queryEmp();
	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	@Select("select * from emp where id=#{0}")
	Emp queryById(int id);
}
