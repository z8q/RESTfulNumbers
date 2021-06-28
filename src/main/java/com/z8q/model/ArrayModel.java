package com.z8q.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "numbers")
public class ArrayModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "numArray can't be empty")
    private String numArray;
    @NotBlank(message = "number can't be empty")
    private int number;

    public ArrayModel() {}

    public ArrayModel(String numArray, int number) {
        this.numArray = numArray;
        this.number = number;
    }

    public Long getId() {
        return id;
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
