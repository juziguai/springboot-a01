package com.tencent.wxcloudrun.config;

import com.tencent.wxcloudrun.dao.LoadBalanced;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 1
 * @Title: Config
 * @Package com.tencent.wxcloudrun.config
 * @Author: 作者信息（企业内部通常定义为个人的企业邮箱）
 * @Copyright 版权归**企业（或个人）所有
 * @CreateTime: 2022/8/24 23:28
 */



@Configuration
public class Config {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
