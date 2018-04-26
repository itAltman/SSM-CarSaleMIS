package service.impl;
import java.util.List;

import com.dao.CompanyMapper;
import com.pojo.Company;
import common.Assist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public long getCompanyRowCount(Assist assist){
        return companyMapper.getCompanyRowCount(assist);
    }
    @Override
    public List<Company> selectCompany(Assist assist){
        return companyMapper.selectCompany(assist);
    }
    @Override
    public Company selectCompanyByObj(Company obj){
        return companyMapper.selectCompanyByObj(obj);
    }
    @Override
    public Company selectCompanyById(Integer id){
        return companyMapper.selectCompanyById(id);
    }
    @Override
    public int insertCompany(Company value){
        return companyMapper.insertCompany(value);
    }
    @Override
    public int insertNonEmptyCompany(Company value){
        return companyMapper.insertNonEmptyCompany(value);
    }
    @Override
    public int insertCompanyByBatch(List<Company> value){
        return companyMapper.insertCompanyByBatch(value);
    }
    @Override
    public int deleteCompanyById(Integer id){
        return companyMapper.deleteCompanyById(id);
    }
    @Override
    public int deleteCompany(Assist assist){
        return companyMapper.deleteCompany(assist);
    }
    @Override
    public int updateCompanyById(Company enti){
        return companyMapper.updateCompanyById(enti);
    }
    @Override
    public int updateCompany(Company value, Assist assist){
        return companyMapper.updateCompany(value,assist);
    }
    @Override
    public int updateNonEmptyCompanyById(Company enti){
        return companyMapper.updateNonEmptyCompanyById(enti);
    }
    @Override
    public int updateNonEmptyCompany(Company value, Assist assist){
        return companyMapper.updateNonEmptyCompany(value,assist);
    }

    public CompanyMapper getCompanyMapper() {
        return this.companyMapper;
    }

    public void setCompanyMapper(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

}