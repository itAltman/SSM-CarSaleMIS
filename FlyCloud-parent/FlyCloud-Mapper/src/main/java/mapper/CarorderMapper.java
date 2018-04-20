package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Carorder;
import pojo.CarorderExample;

public interface CarorderMapper {
    int countByExample(CarorderExample example);

    int deleteByExample(CarorderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Carorder record);

    int insertSelective(Carorder record);

    List<Carorder> selectByExample(CarorderExample example);

    Carorder selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByExample(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByPrimaryKeySelective(Carorder record);

    int updateByPrimaryKey(Carorder record);
}