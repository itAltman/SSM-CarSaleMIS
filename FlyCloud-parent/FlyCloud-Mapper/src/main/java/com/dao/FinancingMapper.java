package com.dao;
import com.pojo.Financing;
import java.util.List;
import common.Assist;
import org.apache.ibatis.annotations.Param;
public interface FinancingMapper{
	/**
	 * 获得Financing数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getFinancingRowCount(Assist assist);
	/**
	 * 获得Financing数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Financing> selectFinancing(Assist assist);
	/**
	 * 获得Financing数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Financing> selectFinancingOfPaging(Assist assist);
	/**
	 * 获得一个Financing对象,以参数Financing对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Financing selectFinancingByObj(Financing obj);
	/**
	 * 通过Financing的id获得Financing对象
	 * @param id
	 * @return
	 */
    Financing selectFinancingById(Integer id);
	/**
	 * 插入Financing到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertFinancing(Financing value);
	/**
	 * 插入Financing中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyFinancing(Financing value);
	/**
	 * 批量插入Financing到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertFinancingByBatch(List<Financing> value);
	/**
	 * 通过Financing的id删除Financing
	 * @param id
	 * @return
	 */
    int deleteFinancingById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Financing
	 * @param assist
	 * @return
	 */
    int deleteFinancing(Assist assist);
	/**
	 * 通过Financing的id更新Financing中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateFinancingById(Financing enti);
 	/**
	 * 通过辅助工具Assist的条件更新Financing中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateFinancing(@Param("enti") Financing value, @Param("assist") Assist assist);
	/**
	 * 通过Financing的id更新Financing中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyFinancingById(Financing enti);
 	/**
	 * 通过辅助工具Assist的条件更新Financing中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyFinancing(@Param("enti") Financing value, @Param("assist") Assist assist);
}