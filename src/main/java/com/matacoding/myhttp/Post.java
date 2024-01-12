package com.matacoding.myhttp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

}
