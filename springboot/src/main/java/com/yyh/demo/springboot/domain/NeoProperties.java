package com.yyh.demo.springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeoProperties {
    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String descripiton;

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public String getTitle() {
        return title;
    }
}
