package com.hachi.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yang
 * @version 1.0.0
 * @date 2020/8/3 19:59
 */
@Configuration
@MapperScan("com.hachi.mall.mbg.mapper")
public class MyBatisConfig {
}
