package dao;
import pojo.Company;
import java.util.List;
import common.Assist;
import org.apache.ibatis.annotations.Param;
public interface CompanyMapper{
	/**
	 * 获得Company数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCompanyRowCount(Assist assist);
	/**
	 * 获得Company数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Company> selectCompany(Assist assist);
	/**
	 * 获得一个Company对象,以参数Company对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Company selectCompanyByObj(Company obj);
	/**
	 * 通过Company的id获得Company对象
	 * @param id
	 * @return
	 */
    Company selectCompanyById(Integer id);
	/**
	 * 插入Company到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCompany(Company value);
	/**
	 * 插入Company中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCompany(Company value);
	/**
	 * 批量插入Company到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCompanyByBatch(List<Company> value);
	/**
	 * 通过Company的id删除Company
	 * @param id
	 * @return
	 */
    int deleteCompanyById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Company
	 * @param assist
	 * @return
	 */
    int deleteCompany(Assist assist);
	/**
	 * 通过Company的id更新Company中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCompanyById(Company enti);
 	/**
	 * 通过辅助工具Assist的条件更新Company中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCompany(@Param("enti") Company value, @Param("assist") Assist assist);
	/**
	 * 通过Company的id更新Company中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCompanyById(Company enti);
 	/**
	 * 通过辅助工具Assist的条件更新Company中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCompany(@Param("enti") Company value, @Param("assist") Assist assist);
}