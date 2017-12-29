package cn.et.lesson01.dao;

import org.springframework.data.repository.CrudRepository;

import cn.et.lesson01.entity.Emp;
/**
 * 自定义一个接口继承自CrudRepository即可
 *  interface EmpRepository extends CrudRepository<操作实体类, 主键类型>
 * @author Administrator 
 *
 */
public interface EmpRepository extends CrudRepository<Emp, Integer>{

}
