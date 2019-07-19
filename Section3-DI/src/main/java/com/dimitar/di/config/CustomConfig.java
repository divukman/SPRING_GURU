package com.dimitar.di.config;

import com.dimitar.di.examplebeans.FakeDataSource;
import com.dimitar.di.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource(
//        {
//                "classpath:custom.properties",
//                "classpath:jms.properties"
//        })

//@PropertySources({
//        @PropertySource("classpath:custom.properties"),
//        @PropertySource("classpath:jms.properties")
//})
public class CustomConfig {

    @Autowired
    Environment env;

    @Value("${dimitar.ime}")
    private String username;

    @Value("${dimitar.sifra}")
    private String password;


    @Value("${dimitar.dburl}")
    private String url;


    @Value("${guru.jms.username}")
    private String jmsUsername;

    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Value("${guru.jms.url}")
    private String jmsUrl;


    @Bean
    FakeDataSource fakeDataSource() {
        return FakeDataSource.builder().name( /*env.getProperty("IME")*/ username).password(password).URL(url).build();
    }

    @Bean
    FakeJmsBroker fakeJmsBroker() {
        return FakeJmsBroker.builder().username(jmsUsername).password(jmsPassword).url(jmsUrl).build();
    }
}
