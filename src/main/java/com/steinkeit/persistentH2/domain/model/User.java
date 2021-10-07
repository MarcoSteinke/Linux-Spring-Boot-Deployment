package com.steinkeit.persistentH2.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

public class User {

    @Id
    private Long id;
    @Getter
    private String name;

    public User(String name) {
        this.name = name;
    }
}
