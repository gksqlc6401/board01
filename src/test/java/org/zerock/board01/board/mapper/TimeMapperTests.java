package org.zerock.board01.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.board01.board.config.BoardRootConfig;
import org.zerock.board01.common.config.RootConfig;


@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {BoardRootConfig.class, RootConfig.class})
public class TimeMapperTests {

    @Autowired
    TimeMapper timeMapper;

    @Test
    public void TestGetTime() {

        log.info("=---------------------");
        log.info("=---------------------");
        log.info(timeMapper.getTime3());
        log.info("=---------------------");
        log.info("=---------------------");

    }

}
