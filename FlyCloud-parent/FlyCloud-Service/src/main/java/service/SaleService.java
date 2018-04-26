package service;
import java.util.List;
import com.pojo.Sale;
import common.Assist;
public interface SaleService{
	/**
	 * 获得Sale数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSaleRowCount(Assist assist);
	/**
	 * 获得Sale数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Sale> selectSale(Assist assist);
	/**
	 * 获得Sale数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Sale> selectSaleOfPaging(Assist assist);
	/**
	 * 获得一个Sale对象,以参数Sale对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Sale selectSaleByObj(Sale obj);
	/**
	 * 通过Sale的id获得Sale对象
	 * @param id
	 * @return
	 */
    Sale selectSaleById(Integer id);
	/**
	 * 插入Sale到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSale(Sale value);
	/**
	 * 插入Sale中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySale(Sale value);
	/**
	 * 批量插入Sale到数据库
	 * @param value
	 * @return
	 */
    int insertSaleByBatch(List<Sale> value);
	/**
	 * 通过Sale的id删除Sale
	 * @param id
	 * @return
	 */
    int deleteSaleById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Sale
	 * @param assist
	 * @return
	 */
    int deleteSale(Assist assist);
	/**
	 * 通过Sale的id更新Sale中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSaleById(Sale enti);
 	/**
	 * 通过辅助工具Assist的条件更新Sale中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSale(Sale value, Assist assist);
	/**
	 * 通过Sale的id更新Sale中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySaleById(Sale enti);
 	/**
	 * 通过辅助工具Assist的条件更新Sale中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySale(Sale value, Assist assist);
}