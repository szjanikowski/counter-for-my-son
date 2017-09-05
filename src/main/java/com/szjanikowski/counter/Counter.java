package com.szjanikowski.counter;


import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Counter {

    @Id
    private String id;

    private long startTime;

    protected Counter() {}

    public Counter(String id, long startTime) {
        this.id = id;
        this.startTime = startTime;
    }

}
