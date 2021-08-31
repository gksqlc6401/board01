package org.zerock.board01.common.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.zerock.board01.board.config.BoardRootConfig;
import org.zerock.board01.board.config.BoardServletConfig;

import javax.servlet.Filter;

@Log4j2
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        log.info("1-------------------------------");
        log.info("1-------------------------------");

        return new Class[]{RootConfig.class, BoardRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        log.info("2-----------------------------------");
        log.info("2-----------------------------------");

        return new Class[]{ServletConfig.class, BoardServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() { return new String[]{"/"};}//프론트 컬트롤러 들어가게하려고

    @Override
    protected Filter[] getServletFilters() {
        //get방식만 사용가능
        CharacterEncodingFilter utf8Filter = new CharacterEncodingFilter();
        utf8Filter.setEncoding("UTF-8");
        utf8Filter.setForceEncoding(true);

        return new Filter[]{utf8Filter};
    }
}

