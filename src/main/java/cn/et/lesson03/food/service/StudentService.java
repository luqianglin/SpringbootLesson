package cn.et.lesson03.food.service;



import cn.et.lesson03.food.entity.Student;
import cn.et.lesson03.food.utils.PageTools;

public interface StudentService {

	public abstract PageTools queryStudent(String sname,Integer page,Integer rows);
	public void deleteStudent(Integer sid);
	public void updateStudent(Student student);
	public void saveStudent(Student student);
}