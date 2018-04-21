package service.Impl;
import java.util.List;
import dao.CarbrandMapper;
import pojo.Carbrand;
import common.Assist;
import service.CarbrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarbrandServiceImpl implements CarbrandService{
    @Autowired
    private CarbrandMapper carbrandMapper;
    @Override
    public long getCarbrandRowCount(Assist assist){
        return carbrandMapper.getCarbrandRowCount(assist);
    }
    @Override
    public List<Carbrand> selectCarbrand(Assist assist){
        return carbrandMapper.selectCarbrand(assist);
    }
    @Override
    public Carbrand selectCarbrandByObj(Carbrand obj){
        return carbrandMapper.selectCarbrandByObj(obj);
    }
    @Override
    public Carbrand selectCarbrandById(Integer id){
        return carbrandMapper.selectCarbrandById(id);
    }
    @Override
    public int insertCarbrand(Carbrand value){
        return carbrandMapper.insertCarbrand(value);
    }
    @Override
    public int insertNonEmptyCarbrand(Carbrand value){
        return carbrandMapper.insertNonEmptyCarbrand(value);
    }
    @Override
    public int insertCarbrandByBatch(List<Carbrand> value){
        return carbrandMapper.insertCarbrandByBatch(value);
    }
    @Override
    public int deleteCarbrandById(Integer id){
        return carbrandMapper.deleteCarbrandById(id);
    }
    @Override
    public int deleteCarbrand(Assist assist){
        return carbrandMapper.deleteCarbrand(assist);
    }
    @Override
    public int updateCarbrandById(Carbrand enti){
        return carbrandMapper.updateCarbrandById(enti);
    }
    @Override
    public int updateCarbrand(Carbrand value, Assist assist){
        return carbrandMapper.updateCarbrand(value,assist);
    }
    @Override
    public int updateNonEmptyCarbrandById(Carbrand enti){
        return carbrandMapper.updateNonEmptyCarbrandById(enti);
    }
    @Override
    public int updateNonEmptyCarbrand(Carbrand value, Assist assist){
        return carbrandMapper.updateNonEmptyCarbrand(value,assist);
    }

    public CarbrandMapper getCarbrandMapper() {
        return this.carbrandMapper;
    }

    public void setCarbrandMapper(CarbrandMapper carbrandMapper) {
        this.carbrandMapper = carbrandMapper;
    }

}