package com.spark.platform.cms;

import com.spark.platform.common.security.annotation.EnableSparkResourceServer;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.spark.platform.cms.**.dao"})
@EnableSparkResourceServer
@EnableSwagger2Doc
public class SparkCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkCmsApplication.class, args);
    }

}
