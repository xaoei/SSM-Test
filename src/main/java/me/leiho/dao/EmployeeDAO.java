package me.leiho.dao;

import me.leiho.entity.Employee;
import me.leiho.entity.Employee2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/*
DAO接口
 */
public interface EmployeeDAO {
    public void save(Employee employee);
    public List<Employee> findAll();
    public Employee findById(int id);
    public void update(Employee employee);
    public void delete(int id);
    public Map findById2(int id);
    public Employee2 findById3(int id);
}
