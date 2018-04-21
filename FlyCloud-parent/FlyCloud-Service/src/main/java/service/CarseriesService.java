package service;
import java.util.List;
import pojo.Carseries;
import common.Assist;
public interface CarseriesService{
	/**
	 * 获得Carseries数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCarseriesRowCount(Assist assist);
	/**
	 * 获得Carseries数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Carseries> selectCarseries(Assist assist);
	/**
	 * 获得Carseries数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Carseries> selectCarseriesOfPaging(Assist assist);
	/**
	 * 获得一个Carseries对象,以参数Carseries对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Carseries selectCarseriesByObj(Carseries obj);
	/**
	 * 通过Carseries的id获得Carseries对象
	 * @param id
	 * @return
	 */
    Carseries selectCarseriesById(Integer id);
	/**
	 * 插入Carseries到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCarseries(Carseries value);
	/**
	 * 插入Carseries中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCarseries(Carseries value);
	/**
	 * 批量插入Carseries到数据库
	 * @param value
	 * @return
	 */
    int insertCarseriesByBatch(List<Carseries> value);
	/**
	 * 通过Carseries的id删除Carseries
	 * @param id
	 * @return
	 */
    int deleteCarseriesById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Carseries
	 * @param assist
	 * @return
	 */
    int deleteCarseries(Assist assist);
	/**
	 * 通过Carseries的id更新Carseries中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCarseriesById(Carseries enti);
 	/**
	 * 通过辅助工具Assist的条件更新Carseries中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCarseries(Carseries value, Assist assist);
	/**
	 * 通过Carseries的id更新Carseries中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCarseriesById(Carseries enti);
 	/**
	 * 通过辅助工具Assist的条件更新Carseries中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCarseries(Carseries value, Assist assist);
}