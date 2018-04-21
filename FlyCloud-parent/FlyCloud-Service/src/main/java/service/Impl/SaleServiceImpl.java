package service.Impl;
import java.util.List;
import dao.SaleMapper;
import pojo.Sale;
import common.Assist;
import service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleMapper saleMapper;
    @Override
    public long getSaleRowCount(Assist assist){
        return saleMapper.getSaleRowCount(assist);
    }
    @Override
    public List<Sale> selectSale(Assist assist){
        return saleMapper.selectSale(assist);
    }
    @Override
    public List<Sale> selectSaleOfPaging(Assist assist){
        return saleMapper.selectSaleOfPaging(assist);
    }
    @Override
    public Sale selectSaleByObj(Sale obj){
        return saleMapper.selectSaleByObj(obj);
    }
    @Override
    public Sale selectSaleById(Integer id){
        return saleMapper.selectSaleById(id);
    }
    @Override
    public int insertSale(Sale value){
        return saleMapper.insertSale(value);
    }
    @Override
    public int insertNonEmptySale(Sale value){
        return saleMapper.insertNonEmptySale(value);
    }
    @Override
    public int insertSaleByBatch(List<Sale> value){
        return saleMapper.insertSaleByBatch(value);
    }
    @Override
    public int deleteSaleById(Integer id){
        return saleMapper.deleteSaleById(id);
    }
    @Override
    public int deleteSale(Assist assist){
        return saleMapper.deleteSale(assist);
    }
    @Override
    public int updateSaleById(Sale enti){
        return saleMapper.updateSaleById(enti);
    }
    @Override
    public int updateSale(Sale value, Assist assist){
        return saleMapper.updateSale(value,assist);
    }
    @Override
    public int updateNonEmptySaleById(Sale enti){
        return saleMapper.updateNonEmptySaleById(enti);
    }
    @Override
    public int updateNonEmptySale(Sale value, Assist assist){
        return saleMapper.updateNonEmptySale(value,assist);
    }

    public SaleMapper getSaleMapper() {
        return this.saleMapper;
    }

    public void setSaleMapper(SaleMapper saleMapper) {
        this.saleMapper = saleMapper;
    }

}