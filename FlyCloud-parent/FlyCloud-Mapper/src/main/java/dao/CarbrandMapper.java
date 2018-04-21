package dao;
import pojo.Carbrand;
import java.util.List;
import common.Assist;
import org.apache.ibatis.annotations.Param;
public interface CarbrandMapper{
	/**
	 * 获得Carbrand数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCarbrandRowCount(Assist assist);
	/**
	 * 获得Carbrand数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Carbrand> selectCarbrand(Assist assist);
	/**
	 * 获得一个Carbrand对象,以参数Carbrand对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Carbrand selectCarbrandByObj(Carbrand obj);
	/**
	 * 通过Carbrand的id获得Carbrand对象
	 * @param id
	 * @return
	 */
    Carbrand selectCarbrandById(Integer id);
	/**
	 * 插入Carbrand到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCarbrand(Carbrand value);
	/**
	 * 插入Carbrand中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCarbrand(Carbrand value);
	/**
	 * 批量插入Carbrand到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCarbrandByBatch(List<Carbrand> value);
	/**
	 * 通过Carbrand的id删除Carbrand
	 * @param id
	 * @return
	 */
    int deleteCarbrandById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Carbrand
	 * @param assist
	 * @return
	 */
    int deleteCarbrand(Assist assist);
	/**
	 * 通过Carbrand的id更新Carbrand中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCarbrandById(Carbrand enti);
 	/**
	 * 通过辅助工具Assist的条件更新Carbrand中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCarbrand(@Param("enti") Carbrand value, @Param("assist") Assist assist);
	/**
	 * 通过Carbrand的id更新Carbrand中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCarbrandById(Carbrand enti);
 	/**
	 * 通过辅助工具Assist的条件更新Carbrand中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCarbrand(@Param("enti") Carbrand value, @Param("assist") Assist assist);
}