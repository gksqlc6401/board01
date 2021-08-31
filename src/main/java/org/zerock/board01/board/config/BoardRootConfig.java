package org.zerock.board01.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.zerock.board01.board.mapper")
@ComponentScan(basePackages = "org.zerock.board01.board.service")
public class BoardRootConfig {

}
