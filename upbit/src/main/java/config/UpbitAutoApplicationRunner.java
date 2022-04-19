package com.upbit.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.upbit.auth.GetAccountsController;
import com.upbit.auth.Jwt;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

/**
 * 시리얼 통신에서 메세지를 송수신 하기 위한 어플리케이션을 실행하는 부분임
 */
@Slf4j
@Component
public class UpbitAutoApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("run yulgunDev's upbitAutoApllication................");
    }
}
