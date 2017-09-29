package me.leiho.dao;

import me.leiho.entity.Employee;
import me.leiho.entity.Employee2;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
/*
DAO的实现类
 */
@Repository("empDAO")
public class EmployeeDAOMyBatisImpl implements EmployeeDAO {
    @Autowired
    @Qualifier("sst")
    private SqlSessionTemplate sst;
    public void save(Employee employee) {
        /*
        不用考虑提交事务和关闭SqlSession,SqlSessionTemplate已经处理了.
         */
        sst.insert("me.leiho.dao.EmployeeDAO.save",employee);
    }

    public List<Employee> findAll() {
        return sst.selectList("me.leiho.dao.EmployeeDAO.findAll");
    }

    public Employee findById(int id) {
        return sst.selectOne("me.leiho.dao.EmployeeDAO.findById",id);
    }

    public void update(Employee employee){
        sst.update("me.leiho.dao.EmployeeDAO.update",employee);
    }

    public void delete(int id) {
        sst.delete("me.leiho.dao.EmployeeDAO.delete",id);
    }

    public Map findById2(int id) {
        return sst.selectOne("me.leiho.dao.EmployeeDAO.findById2",id);
    }

    public Employee2 findById3(int id) {
        return sst.selectOne("me.leiho.dao.EmployeeDAO.findById3",id);
    }
}
