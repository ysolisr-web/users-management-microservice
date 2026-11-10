package com.jcaa.usersmanagement.infrastructure.config;

import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Slf4j
@Configuration(proxyBeanMethods = false)
public class DataSourceSpringConfig {

    private static final String LOG_DATASOURCE_INIT = "[DataSourceSpringConfig] DataSource H2 inicializado correctamente.";

    @Bean
    public DataSource dataSource() {
        log.info(LOG_DATASOURCE_INIT);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
}