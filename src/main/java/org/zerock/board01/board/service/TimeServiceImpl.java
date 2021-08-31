package org.zerock.board01.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.board01.board.mapper.TimeMapper;

@Log4j2
@RequiredArgsConstructor
@Service
public class TimeServiceImpl implements TimeService{

    private final TimeMapper timeMapper;

    @Override
    public String getNow1() {
        log.info("Get..................time");
        return timeMapper.getTime3();
    }
}
