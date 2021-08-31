package org.zerock.board01.common.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.ArrayList;

@Configuration

public class RootConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory()throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public DataSource dataSource(){
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/bit08db");
        config.setUsername("myuser");
        config.setPassword("myuser");


        HikariDataSource dataSource = new HikariDataSource(config);

        return  dataSource;
    }

    @Bean(name = "names")// 빈이라는 객체로 리턴해줌,이름을 메소드이름이랑 맞춤/네임으로 불러줌
    public ArrayList<String> names() {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        return  list;
    }
}
