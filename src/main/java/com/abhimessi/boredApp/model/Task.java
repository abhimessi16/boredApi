package com.abhimessi.boredApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String taskName;
    @Enumerated(value = EnumType.STRING)
    private TaskStatus taskStatus;

}
