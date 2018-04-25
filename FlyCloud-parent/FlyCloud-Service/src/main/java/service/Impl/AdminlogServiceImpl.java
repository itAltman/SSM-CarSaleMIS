package service.impl;
import java.util.List;
import dao.AdminlogMapper;
import pojo.Adminlog;
import common.Assist;
import service.AdminlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminlogServiceImpl implements AdminlogService{
    @Autowired
    private AdminlogMapper adminlogMapper;
    @Override
    public long getAdminlogRowCount(Assist assist){
        return adminlogMapper.getAdminlogRowCount(assist);
    }
    @Override
    public List<Adminlog> selectAdminlog(Assist assist){
        return adminlogMapper.selectAdminlog(assist);
    }
    @Override
    public List<Adminlog> selectAdminlogOfPaging(Assist assist){
        return adminlogMapper.selectAdminlogOfPaging(assist);
    }
    @Override
    public Adminlog selectAdminlogByObj(Adminlog obj){
        return adminlogMapper.selectAdminlogByObj(obj);
    }
    @Override
    public Adminlog selectAdminlogById(Integer id){
        return adminlogMapper.selectAdminlogById(id);
    }
    @Override
    public int insertAdminlog(Adminlog value){
        return adminlogMapper.insertAdminlog(value);
    }
    @Override
    public int insertNonEmptyAdminlog(Adminlog value){
        return adminlogMapper.insertNonEmptyAdminlog(value);
    }
    @Override
    public int insertAdminlogByBatch(List<Adminlog> value){
        return adminlogMapper.insertAdminlogByBatch(value);
    }
    @Override
    public int deleteAdminlogById(Integer id){
        return adminlogMapper.deleteAdminlogById(id);
    }
    @Override
    public int deleteAdminlog(Assist assist){
        return adminlogMapper.deleteAdminlog(assist);
    }
    @Override
    public int updateAdminlogById(Adminlog enti){
        return adminlogMapper.updateAdminlogById(enti);
    }
    @Override
    public int updateAdminlog(Adminlog value, Assist assist){
        return adminlogMapper.updateAdminlog(value,assist);
    }
    @Override
    public int updateNonEmptyAdminlogById(Adminlog enti){
        return adminlogMapper.updateNonEmptyAdminlogById(enti);
    }
    @Override
    public int updateNonEmptyAdminlog(Adminlog value, Assist assist){
        return adminlogMapper.updateNonEmptyAdminlog(value,assist);
    }

    public AdminlogMapper getAdminlogMapper() {
        return this.adminlogMapper;
    }

    public void setAdminlogMapper(AdminlogMapper adminlogMapper) {
        this.adminlogMapper = adminlogMapper;
    }

}