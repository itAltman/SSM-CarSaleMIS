package dao;
import pojo.Carorder;
import java.util.List;
import common.Assist;
import org.apache.ibatis.annotations.Param;
public interface CarorderMapper{
	/**
	 * 获得Carorder数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCarorderRowCount(Assist assist);
	/**
	 * 获得Carorder数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Carorder> selectCarorder(Assist assist);
	/**
	 * 获得Carorder数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Carorder> selectCarorderOfPaging(Assist assist);
	/**
	 * 获得一个Carorder对象,以参数Carorder对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Carorder selectCarorderByObj(Carorder obj);
	/**
	 * 通过Carorder的id获得Carorder对象
	 * @param id
	 * @return
	 */
    Carorder selectCarorderById(Integer id);
	/**
	 * 插入Carorder到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCarorder(Carorder value);
	/**
	 * 插入Carorder中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCarorder(Carorder value);
	/**
	 * 批量插入Carorder到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCarorderByBatch(List<Carorder> value);
	/**
	 * 通过Carorder的id删除Carorder
	 * @param id
	 * @return
	 */
    int deleteCarorderById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Carorder
	 * @param assist
	 * @return
	 */
    int deleteCarorder(Assist assist);
	/**
	 * 通过Carorder的id更新Carorder中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCarorderById(Carorder enti);
 	/**
	 * 通过辅助工具Assist的条件更新Carorder中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCarorder(@Param("enti") Carorder value, @Param("assist") Assist assist);
	/**
	 * 通过Carorder的id更新Carorder中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCarorderById(Carorder enti);
 	/**
	 * 通过辅助工具Assist的条件更新Carorder中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCarorder(@Param("enti") Carorder value, @Param("assist") Assist assist);
}