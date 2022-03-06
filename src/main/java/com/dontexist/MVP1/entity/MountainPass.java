package com.dontexist.MVP1.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pereval_added")
@Data
@NoArgsConstructor
public class MountainPass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDateTime date;

    @Column
    private String raw_data;

    @Column
    private String images;

}
