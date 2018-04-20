package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Adminlog;
import pojo.AdminlogExample;

public interface AdminlogMapper {
    int countByExample(AdminlogExample example);

    int deleteByExample(AdminlogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(Adminlog record);

    int insertSelective(Adminlog record);

    List<Adminlog> selectByExample(AdminlogExample example);

    Adminlog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") Adminlog record, @Param("example") AdminlogExample example);

    int updateByExample(@Param("record") Adminlog record, @Param("example") AdminlogExample example);

    int updateByPrimaryKeySelective(Adminlog record);

    int updateByPrimaryKey(Adminlog record);
}