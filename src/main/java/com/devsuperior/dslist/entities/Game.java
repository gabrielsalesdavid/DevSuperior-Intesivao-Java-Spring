package com.devsuperior.dslist.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor

public class Game{
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){
    }
}