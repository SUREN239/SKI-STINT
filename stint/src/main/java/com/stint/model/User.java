package com.stint.model;

import jakarta.persistence.*;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String uname;
    private String password;
    private String dept;
    private String desig;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Tasks tasks;


}
