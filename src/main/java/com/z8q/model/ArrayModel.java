package com.z8q.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "numbers")
public class ArrayModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String numArray;
    private int number;


    public ArrayModel() {
    }

    public ArrayModel(String numArray, int number) {
        this.numArray = numArray;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumArray() {
        return numArray;
    }

    public void setNumArray(String numArray) {
        this.numArray = numArray;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
