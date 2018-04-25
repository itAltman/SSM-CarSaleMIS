package service.impl;
import java.util.List;
import dao.EmployeeMapper;
import pojo.Employee;
import common.Assist;
import service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public long getEmployeeRowCount(Assist assist){
        return employeeMapper.getEmployeeRowCount(assist);
    }
    @Override
    public List<Employee> selectEmployee(Assist assist){
        return employeeMapper.selectEmployee(assist);
    }
    @Override
    public List<Employee> selectEmployeeOfPaging(Assist assist){
        return employeeMapper.selectEmployeeOfPaging(assist);
    }
    @Override
    public Employee selectEmployeeByObj(Employee obj){
        return employeeMapper.selectEmployeeByObj(obj);
    }
    @Override
    public Employee selectEmployeeById(Integer id){
        return employeeMapper.selectEmployeeById(id);
    }
    @Override
    public int insertEmployee(Employee value){
        return employeeMapper.insertEmployee(value);
    }
    @Override
    public int insertNonEmptyEmployee(Employee value){
        return employeeMapper.insertNonEmptyEmployee(value);
    }
    @Override
    public int insertEmployeeByBatch(List<Employee> value){
        return employeeMapper.insertEmployeeByBatch(value);
    }
    @Override
    public int deleteEmployeeById(Integer id){
        return employeeMapper.deleteEmployeeById(id);
    }
    @Override
    public int deleteEmployee(Assist assist){
        return employeeMapper.deleteEmployee(assist);
    }
    @Override
    public int updateEmployeeById(Employee enti){
        return employeeMapper.updateEmployeeById(enti);
    }
    @Override
    public int updateEmployee(Employee value, Assist assist){
        return employeeMapper.updateEmployee(value,assist);
    }
    @Override
    public int updateNonEmptyEmployeeById(Employee enti){
        return employeeMapper.updateNonEmptyEmployeeById(enti);
    }
    @Override
    public int updateNonEmptyEmployee(Employee value, Assist assist){
        return employeeMapper.updateNonEmptyEmployee(value,assist);
    }

    public EmployeeMapper getEmployeeMapper() {
        return this.employeeMapper;
    }

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

}