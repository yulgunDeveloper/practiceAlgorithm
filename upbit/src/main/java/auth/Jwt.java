package com.upbit.auth;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;


@Data
@Slf4j
public class Jwt {
    @Value("${security.access-key}")
    private String accessKey;

    @Value("${security.secret-key}")
    private String secretKey;
}
