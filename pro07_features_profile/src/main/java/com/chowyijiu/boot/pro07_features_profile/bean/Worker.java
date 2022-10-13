package com.chowyijiu.boot.pro07_features_profile.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Component
@Profile("prod")
@ConfigurationProperties("person")
public class Worker implements Person {

    private String name;
    private Integer age;
}
