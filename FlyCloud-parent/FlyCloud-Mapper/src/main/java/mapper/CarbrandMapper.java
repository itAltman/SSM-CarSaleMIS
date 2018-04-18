package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Carbrand;
import pojo.CarbrandExample;

import java.util.List;

public interface CarbrandMapper {
    int countByExample(CarbrandExample example);

    int deleteByExample(CarbrandExample example);

    int deleteByPrimaryKey(Integer brandid);

    int insert(Carbrand record);

    int insertSelective(Carbrand record);

    List<Carbrand> selectByExample(CarbrandExample example);

    Carbrand selectByPrimaryKey(Integer brandid);

    int updateByExampleSelective(@Param("record") Carbrand record, @Param("example") CarbrandExample example);

    int updateByExample(@Param("record") Carbrand record, @Param("example") CarbrandExample example);

    int updateByPrimaryKeySelective(Carbrand record);

    int updateByPrimaryKey(Carbrand record);
}