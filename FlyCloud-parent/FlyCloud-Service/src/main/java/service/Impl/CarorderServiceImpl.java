package service.Impl;
import java.util.List;
import dao.CarorderMapper;
import pojo.Carorder;
import common.Assist;
import service.CarorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarorderServiceImpl implements CarorderService{
    @Autowired
    private CarorderMapper carorderMapper;
    @Override
    public long getCarorderRowCount(Assist assist){
        return carorderMapper.getCarorderRowCount(assist);
    }
    @Override
    public List<Carorder> selectCarorder(Assist assist){
        return carorderMapper.selectCarorder(assist);
    }
    @Override
    public List<Carorder> selectCarorderOfPaging(Assist assist){
        return carorderMapper.selectCarorderOfPaging(assist);
    }
    @Override
    public Carorder selectCarorderByObj(Carorder obj){
        return carorderMapper.selectCarorderByObj(obj);
    }
    @Override
    public Carorder selectCarorderById(Integer id){
        return carorderMapper.selectCarorderById(id);
    }
    @Override
    public int insertCarorder(Carorder value){
        return carorderMapper.insertCarorder(value);
    }
    @Override
    public int insertNonEmptyCarorder(Carorder value){
        return carorderMapper.insertNonEmptyCarorder(value);
    }
    @Override
    public int insertCarorderByBatch(List<Carorder> value){
        return carorderMapper.insertCarorderByBatch(value);
    }
    @Override
    public int deleteCarorderById(Integer id){
        return carorderMapper.deleteCarorderById(id);
    }
    @Override
    public int deleteCarorder(Assist assist){
        return carorderMapper.deleteCarorder(assist);
    }
    @Override
    public int updateCarorderById(Carorder enti){
        return carorderMapper.updateCarorderById(enti);
    }
    @Override
    public int updateCarorder(Carorder value, Assist assist){
        return carorderMapper.updateCarorder(value,assist);
    }
    @Override
    public int updateNonEmptyCarorderById(Carorder enti){
        return carorderMapper.updateNonEmptyCarorderById(enti);
    }
    @Override
    public int updateNonEmptyCarorder(Carorder value, Assist assist){
        return carorderMapper.updateNonEmptyCarorder(value,assist);
    }

    public CarorderMapper getCarorderMapper() {
        return this.carorderMapper;
    }

    public void setCarorderMapper(CarorderMapper carorderMapper) {
        this.carorderMapper = carorderMapper;
    }

}