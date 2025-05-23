package kr.hs.study.myBatisPrj.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoDTO {
    private Long id;
    private String title;
    private boolean done;
}
