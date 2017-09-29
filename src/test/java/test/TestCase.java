package test;

import me.leiho.dao.EmployeeDAO;
import me.leiho.entity.Employee;
import me.leiho.entity.Employee2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class TestCase {
    static int id = 86;
    private EmployeeDAO dao;
    @Before
    public void init(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao = ac.getBean("empDAO",EmployeeDAO.class);
    }
    @Test
    public void test1(){
        Employee e = new Employee();
        e.setEname("哈里发");
        e.setSalary(1111);
        e.setAge(66);
        dao.save(e);
    }
    @Test
    public void test2(){
        List<Employee> es = dao.findAll();
        for (Employee e:es) {
            System.out.println(e);
        }
    }
    @Test
    public void test3(){
        Employee e = dao.findById(id);
        System.out.println(e);
    }
    @Test
    public void test4(){
        Employee e = new Employee();
        Employee oe = dao.findById(id);
        e.setId(id);
        e.setEname("老"+oe.getEname());
        e.setSalary(oe.getSalary()*1.2);
        e.setAge(oe.getAge()+2);
        dao.update(e);
    }
    @Test
    public void test5(){
        dao.delete(id);
        id++;
    }
    @Test
    public void test6(){
        Map m = dao.findById2(id);
        System.out.println(m);
    }
    @Test
    public void test7(){
        Employee2 e = dao.findById3(id);
        System.out.println(e);
    }
}
