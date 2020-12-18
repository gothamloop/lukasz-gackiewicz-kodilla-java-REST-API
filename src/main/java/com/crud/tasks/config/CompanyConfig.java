package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CompanyConfig {
    @Value("${info.app.company.name}")
    private String companyName;

    @Value("${info.app.company.email}")
    private String companyEmail;
}
