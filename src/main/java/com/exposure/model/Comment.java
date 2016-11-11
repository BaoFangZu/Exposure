package com.exposure.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Timestamp create_time;
}
