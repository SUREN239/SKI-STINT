package com.stint.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "task")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String taskTitle;
    private String assignedTo;
    private String taskDesc;
    private Date dueDate;


}
