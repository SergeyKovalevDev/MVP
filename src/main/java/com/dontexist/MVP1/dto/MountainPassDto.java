package com.dontexist.MVP1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MountainPassDto {
    private Integer id;
    private LocalDateTime date;
    private String raw_data;
    private String images;
}
