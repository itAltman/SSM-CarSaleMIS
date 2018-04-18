package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Carseries;
import pojo.CarseriesExample;

import java.util.List;

public interface CarseriesMapper {
    int countByExample(CarseriesExample example);

    int deleteByExample(CarseriesExample example);

    int deleteByPrimaryKey(Integer seriesid);

    int insert(Carseries record);

    int insertSelective(Carseries record);

    List<Carseries> selectByExample(CarseriesExample example);

    Carseries selectByPrimaryKey(Integer seriesid);

    int updateByExampleSelective(@Param("record") Carseries record, @Param("example") CarseriesExample example);

    int updateByExample(@Param("record") Carseries record, @Param("example") CarseriesExample example);

    int updateByPrimaryKeySelective(Carseries record);

    int updateByPrimaryKey(Carseries record);
}