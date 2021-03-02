package com.darkdevil.springbatchexample2.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Tutorial {
    @Id
    private int id;
    private String tutorial_author;
    private String tutorial_title;
    private String submission_date;
}
