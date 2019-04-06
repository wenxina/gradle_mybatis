package com.example.demo;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.example.demo.incon.mapper")
public class DemoApplication {

    /*@Autowired
    private DataSource dataSource;

    @Bean
    public MybatisSqlSessionFactoryBean sqlSessionFactory() throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSessionFactoryBean;
    }

    *//**
     * 分页插件
     *//*
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
