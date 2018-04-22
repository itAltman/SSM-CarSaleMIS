package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Position;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class PositionMapperTest {
    private static Logger logger = LogManager.getLogger();

    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        this.ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
    }


    /**
     * @description: 测试根据主键id查询
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-04-15 10:17
     **/
    @Test
    public void testQueryByPK(){
        PositionMapper positionMapper = this.ac.getBean(PositionMapper.class);
        Position position = positionMapper.selectPositionById(1);
        logger.debug(position);
    }


    /**
     * @description: 测试连接
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-04-15 10:17
     **/
    @Test
    public void testConnect() throws SQLException {
        DataSource dataSource = (DataSource) this.ac.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        logger.debug(conn);
    }


}