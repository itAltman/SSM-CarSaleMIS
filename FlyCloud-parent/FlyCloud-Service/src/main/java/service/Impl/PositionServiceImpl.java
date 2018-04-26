package service.impl;
import java.util.List;
import com.dao.PositionMapper;
import com.pojo.Position;
import common.Assist;
import service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionMapper positionMapper;
    @Override
    public long getPositionRowCount(Assist assist){
        return positionMapper.getPositionRowCount(assist);
    }
    @Override
    public List<Position> selectPosition(Assist assist){
        return positionMapper.selectPosition(assist);
    }
    @Override
    public Position selectPositionByObj(Position obj){
        return positionMapper.selectPositionByObj(obj);
    }
    @Override
    public Position selectPositionById(Integer id){
        return positionMapper.selectPositionById(id);
    }
    @Override
    public int insertPosition(Position value){
        return positionMapper.insertPosition(value);
    }
    @Override
    public int insertNonEmptyPosition(Position value){
        return positionMapper.insertNonEmptyPosition(value);
    }
    @Override
    public int insertPositionByBatch(List<Position> value){
        return positionMapper.insertPositionByBatch(value);
    }
    @Override
    public int deletePositionById(Integer id){
        return positionMapper.deletePositionById(id);
    }
    @Override
    public int deletePosition(Assist assist){
        return positionMapper.deletePosition(assist);
    }
    @Override
    public int updatePositionById(Position enti){
        return positionMapper.updatePositionById(enti);
    }
    @Override
    public int updatePosition(Position value, Assist assist){
        return positionMapper.updatePosition(value,assist);
    }
    @Override
    public int updateNonEmptyPositionById(Position enti){
        return positionMapper.updateNonEmptyPositionById(enti);
    }
    @Override
    public int updateNonEmptyPosition(Position value, Assist assist){
        return positionMapper.updateNonEmptyPosition(value,assist);
    }

    public PositionMapper getPositionMapper() {
        return this.positionMapper;
    }

    public void setPositionMapper(PositionMapper positionMapper) {
        this.positionMapper = positionMapper;
    }

}