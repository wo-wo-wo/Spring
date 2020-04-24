package spring.test.myboot.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface TestSql {
    int insertTest(@Param("name") String name, @Param("age") int age);

    String selectTest();

}
