package service;
import java.util.List;
import com.pojo.Customer;
import common.Assist;
public interface CustomerService{
	/**
	 * 获得Customer数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCustomerRowCount(Assist assist);
	/**
	 * 获得Customer数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Customer> selectCustomer(Assist assist);
	/**
	 * 获得Customer数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Customer> selectCustomerOfPaging(Assist assist);
	/**
	 * 获得一个Customer对象,以参数Customer对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Customer selectCustomerByObj(Customer obj);
	/**
	 * 通过Customer的id获得Customer对象
	 * @param id
	 * @return
	 */
    Customer selectCustomerById(Integer id);
	/**
	 * 插入Customer到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCustomer(Customer value);
	/**
	 * 插入Customer中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCustomer(Customer value);
	/**
	 * 批量插入Customer到数据库
	 * @param value
	 * @return
	 */
    int insertCustomerByBatch(List<Customer> value);
	/**
	 * 通过Customer的id删除Customer
	 * @param id
	 * @return
	 */
    int deleteCustomerById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Customer
	 * @param assist
	 * @return
	 */
    int deleteCustomer(Assist assist);
	/**
	 * 通过Customer的id更新Customer中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCustomerById(Customer enti);
 	/**
	 * 通过辅助工具Assist的条件更新Customer中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCustomer(Customer value, Assist assist);
	/**
	 * 通过Customer的id更新Customer中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCustomerById(Customer enti);
 	/**
	 * 通过辅助工具Assist的条件更新Customer中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCustomer(Customer value, Assist assist);
}