package service;
import java.util.List;
import pojo.Repertory;
import common.Assist;
public interface RepertoryService{
	/**
	 * 获得Repertory数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getRepertoryRowCount(Assist assist);
	/**
	 * 获得Repertory数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Repertory> selectRepertory(Assist assist);
	/**
	 * 获得Repertory数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Repertory> selectRepertoryOfPaging(Assist assist);
	/**
	 * 获得一个Repertory对象,以参数Repertory对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Repertory selectRepertoryByObj(Repertory obj);
	/**
	 * 通过Repertory的id获得Repertory对象
	 * @param id
	 * @return
	 */
    Repertory selectRepertoryById(Integer id);
	/**
	 * 插入Repertory到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertRepertory(Repertory value);
	/**
	 * 插入Repertory中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyRepertory(Repertory value);
	/**
	 * 批量插入Repertory到数据库
	 * @param value
	 * @return
	 */
    int insertRepertoryByBatch(List<Repertory> value);
	/**
	 * 通过Repertory的id删除Repertory
	 * @param id
	 * @return
	 */
    int deleteRepertoryById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Repertory
	 * @param assist
	 * @return
	 */
    int deleteRepertory(Assist assist);
	/**
	 * 通过Repertory的id更新Repertory中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateRepertoryById(Repertory enti);
 	/**
	 * 通过辅助工具Assist的条件更新Repertory中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateRepertory(Repertory value, Assist assist);
	/**
	 * 通过Repertory的id更新Repertory中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyRepertoryById(Repertory enti);
 	/**
	 * 通过辅助工具Assist的条件更新Repertory中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyRepertory(Repertory value, Assist assist);
}