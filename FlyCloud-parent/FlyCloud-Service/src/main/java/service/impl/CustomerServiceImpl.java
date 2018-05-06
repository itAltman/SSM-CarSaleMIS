package service.impl;
import java.util.List;
import com.dao.CustomerMapper;
import com.pojo.Customer;
import common.Assist;
import service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public long getCustomerRowCount(Assist assist){
        return customerMapper.getCustomerRowCount(assist);
    }
    @Override
    public List<Customer> selectCustomer(Assist assist){
        return customerMapper.selectCustomer(assist);
    }
    @Override
    public List<Customer> selectCustomerOfPaging(Assist assist){
        return customerMapper.selectCustomerOfPaging(assist);
    }
    @Override
    public Customer selectCustomerByObj(Customer obj){
        return customerMapper.selectCustomerByObj(obj);
    }
    @Override
    public Customer selectCustomerById(Integer id){
        return customerMapper.selectCustomerById(id);
    }
    @Override
    public int insertCustomer(Customer value){
        return customerMapper.insertCustomer(value);
    }
    @Override
    public int insertNonEmptyCustomer(Customer value){
        return customerMapper.insertNonEmptyCustomer(value);
    }
    @Override
    public int insertCustomerByBatch(List<Customer> value){
        return customerMapper.insertCustomerByBatch(value);
    }
    @Override
    public int deleteCustomerById(Integer id){
        return customerMapper.deleteCustomerById(id);
    }
    @Override
    public int deleteCustomer(Assist assist){
        return customerMapper.deleteCustomer(assist);
    }
    @Override
    public int updateCustomerById(Customer enti){
        return customerMapper.updateCustomerById(enti);
    }
    @Override
    public int updateCustomer(Customer value, Assist assist){
        return customerMapper.updateCustomer(value,assist);
    }
    @Override
    public int updateNonEmptyCustomerById(Customer enti){
        return customerMapper.updateNonEmptyCustomerById(enti);
    }
    @Override
    public int updateNonEmptyCustomer(Customer value, Assist assist){
        return customerMapper.updateNonEmptyCustomer(value,assist);
    }

    public CustomerMapper getCustomerMapper() {
        return this.customerMapper;
    }

    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

}