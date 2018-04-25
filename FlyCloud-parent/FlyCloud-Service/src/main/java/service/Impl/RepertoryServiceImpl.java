package service.impl;
import java.util.List;
import dao.RepertoryMapper;
import pojo.Repertory;
import common.Assist;
import service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RepertoryServiceImpl implements RepertoryService{
    @Autowired
    private RepertoryMapper repertoryMapper;
    @Override
    public long getRepertoryRowCount(Assist assist){
        return repertoryMapper.getRepertoryRowCount(assist);
    }
    @Override
    public List<Repertory> selectRepertory(Assist assist){
        return repertoryMapper.selectRepertory(assist);
    }
    @Override
    public List<Repertory> selectRepertoryOfPaging(Assist assist){
        return repertoryMapper.selectRepertoryOfPaging(assist);
    }
    @Override
    public Repertory selectRepertoryByObj(Repertory obj){
        return repertoryMapper.selectRepertoryByObj(obj);
    }
    @Override
    public Repertory selectRepertoryById(Integer id){
        return repertoryMapper.selectRepertoryById(id);
    }
    @Override
    public int insertRepertory(Repertory value){
        return repertoryMapper.insertRepertory(value);
    }
    @Override
    public int insertNonEmptyRepertory(Repertory value){
        return repertoryMapper.insertNonEmptyRepertory(value);
    }
    @Override
    public int insertRepertoryByBatch(List<Repertory> value){
        return repertoryMapper.insertRepertoryByBatch(value);
    }
    @Override
    public int deleteRepertoryById(Integer id){
        return repertoryMapper.deleteRepertoryById(id);
    }
    @Override
    public int deleteRepertory(Assist assist){
        return repertoryMapper.deleteRepertory(assist);
    }
    @Override
    public int updateRepertoryById(Repertory enti){
        return repertoryMapper.updateRepertoryById(enti);
    }
    @Override
    public int updateRepertory(Repertory value, Assist assist){
        return repertoryMapper.updateRepertory(value,assist);
    }
    @Override
    public int updateNonEmptyRepertoryById(Repertory enti){
        return repertoryMapper.updateNonEmptyRepertoryById(enti);
    }
    @Override
    public int updateNonEmptyRepertory(Repertory value, Assist assist){
        return repertoryMapper.updateNonEmptyRepertory(value,assist);
    }

    public RepertoryMapper getRepertoryMapper() {
        return this.repertoryMapper;
    }

    public void setRepertoryMapper(RepertoryMapper repertoryMapper) {
        this.repertoryMapper = repertoryMapper;
    }

}