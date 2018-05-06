package com.dao;

import com.pojo.Company;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;
/**
 * @description: 测试公司dao层
 * @author: Altman
 * @date: 2018-04-26
 *
 **/
public class CompanyMapperTest {

    private static Logger logger = LogManager.getLogger();

    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        this.ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
    }

    /**
     * @description: 测试连接
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-04-26 11:39
     **/
    @Test
    public void testConnect() throws SQLException {
        DataSource dataSource = (DataSource) this.ac.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        logger.debug(conn);
    }

    /**
     * @description: 测试根据主键id查询
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-04-26 11:39
     **/
    @Test
    public void testQueryByPK(){
        CompanyMapper companyMapper = this.ac.getBean(CompanyMapper.class);
        Company company = companyMapper.selectCompanyById(1);
        logger.debug("公司名称：" + company.getCompanyName());
    }

}