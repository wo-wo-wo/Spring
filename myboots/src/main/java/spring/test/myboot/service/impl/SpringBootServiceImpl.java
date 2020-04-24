package spring.test.myboot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.test.myboot.repository.TestSql;
import spring.test.myboot.service.SpringBootService;

@Service
public class SpringBootServiceImpl implements SpringBootService {


    private static final Logger logger = LoggerFactory.getLogger(SpringBootServiceImpl.class);


    @Autowired
    private TestSql sql;

    @Override
    public String testOne() {
        // TODO Auto-generated method stub


        return "恭喜你成功迈入第一步了";
    }

    @Override
    public String add(int i, String name, int age) {
        // TODO Auto-generated method stub
        System.out.println("终于进入数据层了");
        int s = sql.insertTest(name, age);
        logger.info("本次共add={}条数据", 6);
        return null;
    }

}
