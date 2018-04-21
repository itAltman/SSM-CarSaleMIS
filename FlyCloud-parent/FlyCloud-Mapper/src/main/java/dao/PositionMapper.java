package dao;
import pojo.Position;
import java.util.List;
import common.Assist;
import org.apache.ibatis.annotations.Param;
public interface PositionMapper{
	/**
	 * 获得Position数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getPositionRowCount(Assist assist);
	/**
	 * 获得Position数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Position> selectPosition(Assist assist);
	/**
	 * 获得一个Position对象,以参数Position对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Position selectPositionByObj(Position obj);
	/**
	 * 通过Position的id获得Position对象
	 * @param id
	 * @return
	 */
    Position selectPositionById(Integer id);
	/**
	 * 插入Position到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPosition(Position value);
	/**
	 * 插入Position中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyPosition(Position value);
	/**
	 * 批量插入Position到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPositionByBatch(List<Position> value);
	/**
	 * 通过Position的id删除Position
	 * @param id
	 * @return
	 */
    int deletePositionById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Position
	 * @param assist
	 * @return
	 */
    int deletePosition(Assist assist);
	/**
	 * 通过Position的id更新Position中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updatePositionById(Position enti);
 	/**
	 * 通过辅助工具Assist的条件更新Position中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updatePosition(@Param("enti") Position value, @Param("assist") Assist assist);
	/**
	 * 通过Position的id更新Position中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyPositionById(Position enti);
 	/**
	 * 通过辅助工具Assist的条件更新Position中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyPosition(@Param("enti") Position value, @Param("assist") Assist assist);
}