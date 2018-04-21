package service.Impl;
import java.util.List;
import dao.CarseriesMapper;
import pojo.Carseries;
import common.Assist;
import service.CarseriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarseriesServiceImpl implements CarseriesService{
    @Autowired
    private CarseriesMapper carseriesMapper;
    @Override
    public long getCarseriesRowCount(Assist assist){
        return carseriesMapper.getCarseriesRowCount(assist);
    }
    @Override
    public List<Carseries> selectCarseries(Assist assist){
        return carseriesMapper.selectCarseries(assist);
    }
    @Override
    public List<Carseries> selectCarseriesOfPaging(Assist assist){
        return carseriesMapper.selectCarseriesOfPaging(assist);
    }
    @Override
    public Carseries selectCarseriesByObj(Carseries obj){
        return carseriesMapper.selectCarseriesByObj(obj);
    }
    @Override
    public Carseries selectCarseriesById(Integer id){
        return carseriesMapper.selectCarseriesById(id);
    }
    @Override
    public int insertCarseries(Carseries value){
        return carseriesMapper.insertCarseries(value);
    }
    @Override
    public int insertNonEmptyCarseries(Carseries value){
        return carseriesMapper.insertNonEmptyCarseries(value);
    }
    @Override
    public int insertCarseriesByBatch(List<Carseries> value){
        return carseriesMapper.insertCarseriesByBatch(value);
    }
    @Override
    public int deleteCarseriesById(Integer id){
        return carseriesMapper.deleteCarseriesById(id);
    }
    @Override
    public int deleteCarseries(Assist assist){
        return carseriesMapper.deleteCarseries(assist);
    }
    @Override
    public int updateCarseriesById(Carseries enti){
        return carseriesMapper.updateCarseriesById(enti);
    }
    @Override
    public int updateCarseries(Carseries value, Assist assist){
        return carseriesMapper.updateCarseries(value,assist);
    }
    @Override
    public int updateNonEmptyCarseriesById(Carseries enti){
        return carseriesMapper.updateNonEmptyCarseriesById(enti);
    }
    @Override
    public int updateNonEmptyCarseries(Carseries value, Assist assist){
        return carseriesMapper.updateNonEmptyCarseries(value,assist);
    }

    public CarseriesMapper getCarseriesMapper() {
        return this.carseriesMapper;
    }

    public void setCarseriesMapper(CarseriesMapper carseriesMapper) {
        this.carseriesMapper = carseriesMapper;
    }

}