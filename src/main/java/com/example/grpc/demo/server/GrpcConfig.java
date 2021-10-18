package com.example.grpc.demo.server;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Malphite
 * @date: 2021/10/18 2:08 下午
 * @version: 1.0
 * @group:
 */
@Component
@ConfigurationProperties(prefix = "grpc.server")
@Data
public class GrpcConfig {

    private String address = "127.0.0.1";

    private int port = 50001;
}
