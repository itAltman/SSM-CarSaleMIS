package com.dao;
import com.pojo.Adminlog;
import java.util.List;
import common.Assist;
import org.apache.ibatis.annotations.Param;
public interface AdminlogMapper{
	/**
	 * 获得Adminlog数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getAdminlogRowCount(Assist assist);
	/**
	 * 获得Adminlog数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Adminlog> selectAdminlog(Assist assist);
	/**
	 * 获得Adminlog数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Adminlog> selectAdminlogOfPaging(Assist assist);
	/**
	 * 获得一个Adminlog对象,以参数Adminlog对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Adminlog selectAdminlogByObj(Adminlog obj);
	/**
	 * 通过Adminlog的id获得Adminlog对象
	 * @param id
	 * @return
	 */
    Adminlog selectAdminlogById(Integer id);
	/**
	 * 插入Adminlog到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertAdminlog(Adminlog value);
	/**
	 * 插入Adminlog中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyAdminlog(Adminlog value);
	/**
	 * 批量插入Adminlog到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertAdminlogByBatch(List<Adminlog> value);
	/**
	 * 通过Adminlog的id删除Adminlog
	 * @param id
	 * @return
	 */
    int deleteAdminlogById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Adminlog
	 * @param assist
	 * @return
	 */
    int deleteAdminlog(Assist assist);
	/**
	 * 通过Adminlog的id更新Adminlog中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateAdminlogById(Adminlog enti);
 	/**
	 * 通过辅助工具Assist的条件更新Adminlog中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateAdminlog(@Param("enti") Adminlog value, @Param("assist") Assist assist);
	/**
	 * 通过Adminlog的id更新Adminlog中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyAdminlogById(Adminlog enti);
 	/**
	 * 通过辅助工具Assist的条件更新Adminlog中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyAdminlog(@Param("enti") Adminlog value, @Param("assist") Assist assist);
}