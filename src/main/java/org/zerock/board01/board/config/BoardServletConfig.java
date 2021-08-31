package org.zerock.board01.board.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan("org.zerock.board01.board.controller")
public class BoardServletConfig implements WebMvcConfigurer {

}
