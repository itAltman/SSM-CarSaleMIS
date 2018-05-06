package service.impl;
import java.util.List;
import com.dao.CarMapper;
import com.pojo.Car;
import common.Assist;
import service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;
    @Override
    public long getCarRowCount(Assist assist){
        return carMapper.getCarRowCount(assist);
    }
    @Override
    public List<Car> selectCar(Assist assist){
        return carMapper.selectCar(assist);
    }
    @Override
    public List<Car> selectCarOfPaging(Assist assist){
        return carMapper.selectCarOfPaging(assist);
    }
    @Override
    public Car selectCarByObj(Car obj){
        return carMapper.selectCarByObj(obj);
    }
    @Override
    public Car selectCarById(Integer id){
        return carMapper.selectCarById(id);
    }
    @Override
    public int insertCar(Car value){
        return carMapper.insertCar(value);
    }
    @Override
    public int insertNonEmptyCar(Car value){
        return carMapper.insertNonEmptyCar(value);
    }
    @Override
    public int insertCarByBatch(List<Car> value){
        return carMapper.insertCarByBatch(value);
    }
    @Override
    public int deleteCarById(Integer id){
        return carMapper.deleteCarById(id);
    }
    @Override
    public int deleteCar(Assist assist){
        return carMapper.deleteCar(assist);
    }
    @Override
    public int updateCarById(Car enti){
        return carMapper.updateCarById(enti);
    }
    @Override
    public int updateCar(Car value, Assist assist){
        return carMapper.updateCar(value,assist);
    }
    @Override
    public int updateNonEmptyCarById(Car enti){
        return carMapper.updateNonEmptyCarById(enti);
    }
    @Override
    public int updateNonEmptyCar(Car value, Assist assist){
        return carMapper.updateNonEmptyCar(value,assist);
    }

    public CarMapper getCarMapper() {
        return this.carMapper;
    }

    public void setCarMapper(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

}