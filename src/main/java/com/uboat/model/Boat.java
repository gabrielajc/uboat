package com.uboat.model;

import jakarta.persistence.*;

@Entity
@Table
public class Boat {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;
}
