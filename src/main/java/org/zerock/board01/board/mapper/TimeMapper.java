package org.zerock.board01.board.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("select now()")
    String getTime3();

    String getTime4();
}
