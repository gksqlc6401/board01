package org.zerock.board01.board.domain;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Board {//읽기전용

    private Long bno;
    private String title,content,writer;
    private LocalDateTime regDate,modDate;

}
