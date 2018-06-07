package com.mspn.jhipster.sampleapp.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.mspn.jhipster.sampleapp")
public class FeignConfiguration {

}
