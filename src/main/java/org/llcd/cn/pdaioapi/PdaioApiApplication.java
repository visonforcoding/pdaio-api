package org.llcd.cn.pdaioapi;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Version;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
@Slf4j
public class PdaioApiApplication {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(PdaioApiApplication.class, args);
        log.info(String.format("spring version is : %s", SpringVersion.getVersion()));
        log.info(String.format("hibernate version is : %s", Version.getVersionString()));;
    }

}
