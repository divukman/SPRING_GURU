package com.dimitar.di.config;

import com.dimitar.di.data.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom.properties")
public class CustomConfig {

    @Value("{dimitar.ime}")
    private String username;

    @Value("${dimitar.sifra}")
    private String password;


    @Value("${dimitar.dburl}")
    private String url;


    @Bean
    FakeDataSource fakeDataSource() {
        return FakeDataSource.builder().name(username).password(password).URL(url).build();
    }
}
