package com.emr.retrofitdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todos {

    private Long userId;
    private Long id;
    private String title;
    private boolean completed;
}
